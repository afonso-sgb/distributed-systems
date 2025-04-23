FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/Manager-1.0-jar-with-dependencies.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
