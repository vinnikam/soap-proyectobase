FROM amazoncorretto:21-alpine-jdk
LABEL authors="Vinni"

COPY /target/soap-proyectobase-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
