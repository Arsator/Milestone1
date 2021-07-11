node{

    stage("Git Checkout") {
        git 'https://github.com/Arsator/Milestone1'
    }

    stage("Building Image") {
        sh "docker build -t arsator/milestone1:1.0 ."
    }

}