# Use Java 17 (or your version)
FROM eclipse-temurin:21-jdk-alpine

# Add a volume (optional)
VOLUME /tmp

# Copy the jar built by Maven
COPY target/*.jar app.jar

# Start the app
ENTRYPOINT ["java","-jar","/app.jar"]
