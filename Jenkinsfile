pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "aashishvaswani/scientific-calculator:latest"

        PATH = "/usr/local/bin:/opt/homebrew/bin:/usr/bin:/bin:/usr/sbin:/sbin:${env.PATH}"
    }
    
    triggers {
        githubPush()
    }

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', 
                    credentialsId: 'github-ssh',
                    url: 'git@github.com:aashishvaswani/Scientific-Calculator-with-DevOps.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                echo '$PATH'
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                sh 'docker push $DOCKER_IMAGE'
            }
        }
        

        stage('Deploy with Ansible') {
            steps {
                //withCredentials([string(credentialsId: 'ansible_sudo_password', variable: 'SUDO_PASS')]) {
                    // sh '''
                    //     export ANSIBLE_HOST_KEY_CHECKING=False
                    //     ansible-playbook -i inventory.ini playbook.yaml
                    // '''
                //}

            script {
              withEnv(["ANSIBLE_HOST_KEY_CHECKING=False"]) {   
                ansiblePlaybook(
                    playbook: 'playbook.yaml',
                    inventory: 'inventory.ini'
                )
              }
            }
        }
    }

    post {
        success {
            mail to: 'VaswaniAashish.Raju@iiitb.ac.in',
                 subject: "Application Deployment SUCCESS: Build ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "The build was successful!"
        }
        failure {
            mail to: 'VaswaniAashish.Raju@iiitb.ac.in',
                 subject: "Application Deployment FAILURE: Build ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "The build failed."
        }
        always {
            cleanWs()
        }
    }
}
