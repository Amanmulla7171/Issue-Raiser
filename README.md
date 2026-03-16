# Municipal Issue Raiser App

## Overview
The Municipal Issue Raiser App is designed to empower Indian citizens to report civic issues such as waste collection problems, broken pipelines, street light outages, and water supply issues directly to municipal corporations. This application aims to streamline the complaint process and enhance communication between citizens and local authorities.

## Features
- **User Management**: Registration and login for citizens and officers with role-based access.
- **Issue Management**: Submit complaints with photos, location, and category.
- **Tracking System**: Real-time status updates and notifications for users.
- **Admin Dashboard**: Analytics view, officer assignment, and complaint management.
- **Location Services**: GPS integration for geo-tagging complaints.
- **File Upload**: Support for attaching images and videos to complaints.

## Technology Stack
- **Backend**: Java Spring Boot 3.x
- **Database**: MySQL
- **Frontend**: Android
- **Security**: JWT Authentication
- **Architecture**: Microservices

## Project Structure
```
municipal-issue-raiser
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── municipal
│       │           └── issueraiser
│       │               ├── IssueRaiserApplication.java
│       │               ├── config
│       │               ├── controller
│       │               ├── dto
│       │               ├── entity
│       │               ├── repository
│       │               ├── service
│       │               ├── security
│       │               └── util
│       └── resources
│           ├── application.yml
│           ├── static
│           └── templates
├── pom.xml
├── .gitignore
└── README.md
```

## Setup Instructions
1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd municipal-issue-raiser
   ```

2. **Database Setup**:
   - Create a MySQL database named `municipal_issue_db`.
   - Update the `application.yml` file with your database credentials.

3. **Build the Project**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the Application**:
   - The application will be available at `http://localhost:8080`.

## Contribution
Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for details.