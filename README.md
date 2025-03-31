# Scientific Calculator with DevOps

A simple **Java-based Scientific Calculator** enhanced with modern **DevOps practices** to demonstrate CI/CD, containerization, and automated deployment.

>  Developed by **Aashish Vaswani (MT2024167)**  
>  IIIT Bangalore | Software Production Engineering | Feb 2025

---

## Tech Stack

- **Java + Maven** – Core app & build tool  
- **JUnit 5** – Unit testing  
- **Docker** – Containerization  
- **Jenkins** – CI/CD pipeline  
- **Ansible** – Deployment automation  
- **GitHub** – Version control & triggers  
- **ngrok** – Webhook tunneling for local Jenkins  

---

## Features

- Supports operations: square root, power, log, factorial, etc.
- Dockerized and pushed to Docker Hub
- Jenkins automates: build → test → dockerize → push → deploy
- Ansible provisions and deploys the container
- GitHub Webhooks trigger Jenkins via ngrok

---

## Run Locally

```bash
mvn clean package
mvn test
java -jar target/ScientificCalculator.jar
```

## Run with Docker

```
docker build -t aashishvaswani/scientific-calculator .
docker run -it aashishvaswani/scientific-calculator
```

## CI/CD Pipeline Overview

1. Push to GitHub triggers Jenkins (via ngrok webhook)
2. Jenkins:
   - Builds with Maven
   - Runs tests
   - Builds Docker image
   - Pushes image to Docker Hub
   - Deploys with Ansible

---

## Testing

- **Positive Tests**: Valid inputs return expected results
- **Negative Tests**: Invalid inputs handled without crashing

