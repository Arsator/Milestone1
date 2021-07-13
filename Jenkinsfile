pipeline {
    agent none
     stages {
      stage("Build") {
          agent {
              docker {
                  image 'maven:3.8.1-adoptopenjdk-11'
                  args '-v /root/.me:/root/.m2'
              }
          }
          steps {
              sh 'mvn -B -DskipTests clean package'
          }
      }

      stage("Unit Test") {
          agent {
              docker {
                  image 'maven:3.8.1-adoptopenjdk-11'
                  args '-v /root/.me:/root/.m2'
              }
          }

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
          agent any

          steps {
              sh 'docker build -t arsator/milestone1:$BUILD_VERSION .'
          }
      }
  }
}
