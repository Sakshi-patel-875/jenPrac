pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }

        success {
            echo 'Build Successful! All JUnit tests passed.'
        }
        failure {
            echo 'Build Failed! Check test cases or code.'
        }
    }
}
