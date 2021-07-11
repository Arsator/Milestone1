pipeline {
    agent any

    environment {
        registry = "arsator/milestone1"
        registryCredentials = "dockerhub"
        dockerImage = ""
    }

    stages {

        stage ("Checkout") {
            steps {
                echo "Checking out file from Github"
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'Github', url: 'https://github.com/Arsator/Milestone1.git']]])
            }
        }

        stage ("Build") {
            steps {
                echo "Building Stage"
                scipt {
                    dockerImage = docker.build registry + "%BUILD_NUMBER"
                }
            }
        }

        stage ("Test") {
            steps {
                echo "Testing Stage"
            }
        }

        stage ("Deploy") {
            steps {
                echo "Deployment Stage"
            }
        }
    }
}