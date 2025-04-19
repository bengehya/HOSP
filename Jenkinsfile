pipeline {
    agent any

    environment {
        AWS_ACCESS_KEY_ID     = credentials('AWS_ACCESS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', 
                url: 'https://github.com/bengehya/HOSP.git'
            }
        }

        stage('Terraform Init and Plan') {
            steps {
                dir('terraform') {
                    bat '''
                        terraform init
                        terraform plan -out=tfplan
                    '''
                }
            }
        }

        stage('Manual Approval') {
            steps {
                timeout(time: 30, unit: 'MINUTES') {
                    input message: 'Apply Terraform changes?'
                }
            }
        }

        stage('Terraform Apply') {
            steps {
                dir('terraform') {
                    bat 'terraform apply -auto-approve tfplan'
                }
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv() {
                    bat './gradlew sonar'
                }
            }
        }
        
        // === ENLEVÉ : PLUS de Quality Gate blocant ===
    }
}
