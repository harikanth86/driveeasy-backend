# Use Java 21 JDK
FROM eclipse-temurin:21-jdk-alpine

# Copy built JAR
COPY target/*.jar app.jar

# Optional: expose port (for docs)
EXPOSE 8080

# Run the app
ENTRYPOINT ["java","-jar","/app.jar"]
