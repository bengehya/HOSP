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

        stage('Terraform Init/Plan') {
            steps {
                dir('terraform') {
                    bat '''
                        terraform init -no-color
                        terraform plan -no-color -out=tfplan
                    '''
                }
            }
        }

        stage('Approbation Manuel') {
            steps {
                timeout(time: 30, unit: 'MINUTES') {
                    input message: 'Apply terraform changes ?'
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
    }
}
