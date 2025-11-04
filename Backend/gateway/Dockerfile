# Stage 1: Install Maven and JDK
FROM eclipse-temurin:17-jdk AS dev
WORKDIR /app

# Install Maven
RUN apt-get update && apt-get install -y maven

# Expose port
EXPOSE 8080

# Mount local code
VOLUME /app

# Mount source code and run Spring Boot
CMD ["mvn", "spring-boot:run"]
