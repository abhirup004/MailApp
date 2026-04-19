# MailApp

MailApp is a Spring Boot application that provides a REST API for sending emails. It simplifies the process of sending both simple text emails and emails with file attachments.

## Features

- **Send Simple Email**: An endpoint to send plain text emails.
- **Send Email with Attachment**: An endpoint to send emails with file attachments.

## Tech Stack

- Java 17
- Spring Boot 3.4.0
- Spring Web
- Spring Boot Starter Mail
- Lombok
- Maven

## Prerequisites

Before you begin, ensure you have met the following requirements:
- Java 17 installed.
- Maven installed (or use the provided `mvnw` wrapper).
- An SMTP server configuration (e.g., Gmail SMTP) updated in `src/main/resources/application.properties`.

## API Endpoints

### 1. Send Simple Email
- **URL**: `/send_simple_email`
- **Method**: `POST`
- **Body** (JSON):
  ```json
  {
      "recipient": "recipient@example.com",
      "msgBody": "This is the body of the email.",
      "subject": "Hello from MailApp"
  }
  ```

### 2. Send Email with Attachment
- **URL**: `/send_email_with_attachment`
- **Method**: `POST`
- **Body** (JSON):
  ```json
  {
      "recipient": "recipient@example.com",
      "msgBody": "Please find the attached document.",
      "subject": "Document Delivery",
      "attachment": "/path/to/your/file.pdf"
  }
  ```

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/abhirup004/MailApp.git
   ```
2. Navigate to the project directory:
   ```bash
   cd MailApp
   ```
3. Update the `application.properties` with your email credentials:
   ```properties
   spring.mail.host=smtp.gmail.com
   spring.mail.port=587
   spring.mail.username=your-email@gmail.com
   spring.mail.password=your-app-password
   spring.mail.properties.mail.smtp.auth=true
   spring.mail.properties.mail.smtp.starttls.enable=true
   ```
4. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
5. The application will start on `http://localhost:8080`.

## Testing

A Postman collection (`Mailing App.postman_collection.json`) is included in the repository. You can import this directly into Postman to test the endpoints easily.
