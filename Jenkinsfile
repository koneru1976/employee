pipeline {
    agent any

    stages {
        stage('Compile stage') {
            steps {
                sh 'gradle clean compile'
            }
        }
        stage('Unit testing stage') {
            steps {
                sh 'gradle test'
            }
        }
    }
}