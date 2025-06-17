# @khasogi27/vdi-server

A backend server for Virtual Desktop Infrastructure (VDI), built with Java Spring Boot.

## Overview

**@khasogi27/vdi-server** is designed to provide robust backend services for a VDI system, handling authentication, session management, resource provisioning, and more. This project is part of the VDI suite, complementing the [`vdi-client`](https://github.com/khasogi27/vdi-client).

## Features

- RESTful API built with Spring Boot
- Secure authentication and session management
- Resource provisioning for virtual desktops
- Modular and extensible architecture

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.6+
- (Optional) Docker (for containerized deployment)

### Installation

1. **Clone the repository**
    ```bash
    git clone https://github.com/khasogi27/vdi-server.git
    cd vdi-server
    ```

2. **Configure Environment**
    - Copy and modify the example environment file if provided (e.g., `.env.example`).
    - Set up any required database or external services.

3. **Build the project**
    ```bash
    mvn clean install
    ```

4. **Run the server**
    ```bash
    mvn spring-boot:run
    ```

    Or run the packaged JAR:
    ```bash
    java -jar target/vdi-server-*.jar
    ```

### Configuration

Configuration is handled via `application.properties` or `application.yml`. Example parameters:

```properties
# src/main/resources/application.properties

server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/vdi
spring.datasource.username=root
spring.datasource.password=yourpassword
```

### API Usage

> **Note:** For detailed API documentation, see the [API docs](./docs/API.md) (if available) or inspect the Swagger UI at `/swagger-ui.html` when running the server.

## Development

- Fork and clone the repository
- Create a feature branch (`git checkout -b feature/my-feature`)
- Commit your changes
- Open a pull request

## Related Projects

- [@khasogi27/vdi-client](https://github.com/khasogi27/vdi-client) – The frontend client for this VDI system.

## License

This project is licensed under the MIT License. See [LICENSE](./LICENSE) for details.

## Contributing

Contributions are welcome! Please open issues or pull requests as needed.

---

*© 2025 khasogi27. All rights reserved.*
