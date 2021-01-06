@Library('jenkins-library@master') _

pipeline {
    agent any
    stages {
        stage('Git Checkout'){
            steps{
                gitCheckout(
                    branch: "master"/
                    url: "https://github.com/vijnanu1802/jenkins-shared-library-framework.git"
                    )
            }
        }
        stage('build') {
            steps {
                HelloWorld
            }
        }
    }
}
