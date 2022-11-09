pipeline {
    agent any
        tools {
            maven 'maven 3.8.6'
//             jdk 'jdk11'
        }
    stages {
        stage('build') {
            steps {
                echo 'build'
                sh 'mvn clean compile'
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