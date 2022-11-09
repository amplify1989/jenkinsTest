pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'build'
                sh 'mvn version'
            }
        }

        stage('test') {
            steps {
                echo 'test'
            }
        }

        stage('deploy') {
            steps {
                echo 'deploy'
            }
        }
    }
}