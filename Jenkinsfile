pipeline {
    agent any
        tools {
            maven 'Maven 3.8.6'
            jdk 'Java 17.0.4.1'
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