FROM openjdk:17
WORKDIR /app
COPY target/even-odd-app-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
