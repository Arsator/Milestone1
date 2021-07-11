pipeline {
    agent any
    tools {
    // a bit ugly because there is no `@Symbol` annotation for the DockerTool
    // see the discussion about this in PR 77 and PR 52: 
    // https://github.com/jenkinsci/docker-commons-plugin/pull/77#discussion_r280910822
    // https://github.com/jenkinsci/docker-commons-plugin/pull/52
    'org.jenkinsci.plugins.docker.commons.tools.DockerTool' '18.09'
  }
  environment {
    DOCKER_CERT_PATH = credentials('id-for-a-docker-cred')
  }

  stages {
      stage("Git Checkout") {
          steps {
              git "https://github.com/Arsator/Milestone1"
          }
      }

      stage("Build Image") {
          steps {
              sh "docker version"
          }
      }
  }
}