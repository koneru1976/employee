pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                withGradle('gradle-5.2.1') {
                    sh 'gradlew clean compile'
                }
            }
        }

    }
}