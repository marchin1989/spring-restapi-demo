FROM openjdk:11.0.13-slim

COPY ./build/libs /app
WORKDIR /app

CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
