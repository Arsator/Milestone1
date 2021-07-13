pipeline {
    agent any
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
                  junit 'target/surefire-reports/*.xml'
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