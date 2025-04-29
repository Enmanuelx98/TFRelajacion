
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/backend.jar /app/backend.jar

EXPOSE 8081

# Set the default command to run the Java application
ENTRYPOINT ["java", "-jar", "/backend.jar"]