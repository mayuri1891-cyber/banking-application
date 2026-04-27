# 🏦 Banking Application (Microservices Architecture)

A cloud-ready **Banking Application** built using **Spring Boot, Microservices, Docker, and Observability Stack (Prometheus + Grafana + Loki)**.

This project demonstrates real-world backend architecture with containerization, monitoring, and logging.

---

## 🚀 Tech Stack

* **Backend:** Java, Spring Boot
* **Architecture:** Microservices
* **Build Tool:** Maven
* **Containerization:** Docker, Docker Compose
* **Monitoring:** Prometheus, Grafana
* **Logging:** Loki, Promtail
* **Web Server / Gateway:** Nginx
* **Database:** MySQL

---

## 🧱 Project Structure

```
banking-application/
│
├── auth-service/                # Authentication microservice
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
│
├── monitoring/                 # Observability configs
│   ├── prometheus.yml
│   ├── promtail-config.yml
│
├── docker-compose.yml          # Orchestrates all services
├── nginx.conf                  # Reverse proxy config
└── README.md
```

---

## ⚙️ Features

* ✅ Microservices-based architecture
* ✅ Dockerized services
* ✅ Centralized logging using Loki
* ✅ Metrics monitoring with Prometheus
* ✅ Visualization with Grafana dashboards
* ✅ Scalable and cloud-ready design

---

## 🐳 Running the Application

### 🔧 Prerequisites

* Docker
* Docker Compose
* Java 17 (for local development)

---

### ▶️ Start all services

```bash
docker-compose up -d --build
```

---

### 🔍 Verify running containers

```bash
docker ps
```

---

## 🌐 Access URLs

| Service      | URL                   |
| ------------ | --------------------- |
| Auth Service | http://localhost:8082 |
| Grafana      | http://localhost:3000 |
| Prometheus   | http://localhost:9090 |
| Loki         | http://localhost:3100 |

---

## 📊 Monitoring (Prometheus + Grafana)

* Metrics exposed via:

```
/actuator/prometheus
```

* Example metrics:

    * Request rate
    * Error rate
    * JVM memory usage
    * Response time

---

## 📜 Logging (Loki + Promtail)

* Centralized log collection from Docker containers
* Query logs in Grafana using:

```
{job="containerlogs"}
```

* Filter logs:

```
{job="containerlogs"} |= "ERROR"
```

---

## 📈 Grafana Dashboard

You can import prebuilt Spring Boot dashboard:

* Go to Grafana → Import
* Use Dashboard ID: **4701**
* Select Prometheus datasource

---

## 🔐 Notes

* This project uses **dummy data** for testing
* Not intended for real financial transactions
* Designed for learning and demonstration purposes

---

## 🚧 Future Enhancements

* [ ] User Service
* [ ] Transaction Service
* [ ] API Gateway
* [ ] Kubernetes deployment
* [ ] CI/CD pipeline
* [ ] Alerting system (Grafana Alerts)

---

## 💡 Architecture Overview

* Each microservice runs in its own container
* Docker Compose manages orchestration
* Prometheus scrapes metrics from services
* Loki collects logs via Promtail
* Grafana visualizes metrics and logs

---

## 🤝 Author

**Mayuri**
Senior Java Developer | Microservices Enthusiast

---

## ⭐ If you like this project

Give it a ⭐ on GitHub and feel free to fork!
