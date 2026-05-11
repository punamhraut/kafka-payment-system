# Kafka Banking Event-Driven Demo

This project demonstrates a simple event-driven banking transaction flow using Spring Boot and Apache Kafka.

The application publishes payment events to a Kafka topic, and multiple backend services consume the same event independently for different processing tasks.

## Architecture Diagram
![Kafka Architecture](images/kafka-architecture.png)

## Technologies Used
- Java 8
- Spring Boot
- Apache Kafka
- REST API
- Maven

## Event Flow
Payment Service → Kafka Topic (payment-success)

Multiple consumers process the same event independently:
- Fraud Detection Service
- Notification Service
- Audit Service
- Analytics Service


## Why Kafka?
Kafka enables asynchronous communication between services and helps improve:
- Scalability
- Decoupling
- Reliability
- Fault tolerance
- Real-time event processing

## API Endpoint
POST /payments/process

### Request Body
```json
{
  "transactionId": "TXN101",
  "customerName": "Punam",
  "amount": 5000
}
```

## Run Steps
1. Start Kafka Server
2. Run Spring Boot Application
3. Trigger API using Postman
4. Verify producer and consumer logs in console

Kafka server was started locally using Windows Kafka setup.

