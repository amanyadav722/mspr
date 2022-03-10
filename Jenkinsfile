pipeline {
    agent none

    environment {
        DOCKER_HUB_USERNAME = credentials('DOCKER_USERNAME')
        DOCKER_HUB_PASSWORD = credentials('DOCKER_HUB_TOKEN')
        CURRENT_COMMIT = getCommitHash()
    }

    stages {
        stage('Application Tests') {
            agent {
                docker {
                    image 'openjdk:17'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                sh "echo 'Lancement de l'application'"
                sh 'java .jar /Users/hp/Documents/ConnectorMspr.jar'
            }
        }
    }
}
