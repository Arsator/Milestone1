pipeline {
    agent any

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