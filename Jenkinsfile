pipeline {
    agent any
  stages {
      stage("Git Checkout") {
          steps {
              git "https://github.com/Arsator/Milestone1"
          }
      }

      stage("Build Image") {
          steps {
              docker.build 'milestone1:1.1'
          }
      }
  }
}