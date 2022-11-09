pipeline {
    agent any
        tools {
            maven '3.8.6'
            jdk 'Java 11'
        }
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