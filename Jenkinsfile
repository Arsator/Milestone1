pipeline {
    agent {
        label 'ec2-general-worker-node'
    }

    environment {
        registryId = "Docker_hub_id"
        registryUrl = "https://registry.hub.docker.com"
        imageName = 'arsator/milestone1:1.0'
        dockerImage = ''
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
                  junit 'target/surefire-reports/*.xml'
              }
          }
      }

      stage("Build Image") {
          steps {
              script {
                  dockerImage = docker.build imageName
              }
          }

          post {
              success {
                  sh 'echo Image built successfully.'
              }
          }
      }

      stage("Deploy Image") {
          steps {
              script {
                  docker.withRegistry(registryUrl, registryId) {
                      dockerImage.push()
                  }
              }
          }

          post {
              success {
                  sh 'echo deployed success.'
              }
          }
      }

      stage("Remove Image") {
          steps {
              sh 'docker rmi $imageName'
          }
      }
  }
}