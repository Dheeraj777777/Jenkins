FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/even-odd-app-1.0-SNAPSHOT.jar app.jar
EXPOSE 3000
CMD ["java", "-jar", "app.jar"]
