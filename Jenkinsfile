pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11'
            args '-v /root/.me:/root/.m2'
        }
    }
  stages {
      stage("Git Checkout") {
          steps {
              git "https://github.com/Arsator/Milestone1"
          }
      }


      stage("Build") {
          steps {
              sh 'mvn -B -DskipTests clean package'
          }
      }

      stage("Unit Test") {
          steps {
              sh 'mvn test'
          }

          post {
              always {
                  junit '**/surefire-reports/*.xml'
              }
          }
      }

      stage("Build Image") {
          steps {
              sh 'docker build -t arsator/milestone1:$BUILD_NUMBER .'
          }
      }
  }
}