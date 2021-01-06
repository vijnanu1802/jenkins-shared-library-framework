@Library('jenkins-shared-library-framework@master') _

pipeline {
    agent any
    stages {
       
        stage('build') {
            steps {
                HelloWorld
            }
        }
    }
}
