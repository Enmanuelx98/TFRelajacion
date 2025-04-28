# the base image
FROM amazoncorretto:17-alpine-jdk

# Copy the JAR file from the build context into the Docker image

COPY /target/backend.jar /api-v1.jar

# Set the default command to run the Java application
ENTRYPOINT ["java", "-jar", "/api-v1.jar"]