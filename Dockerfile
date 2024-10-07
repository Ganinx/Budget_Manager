
FROM openjdk:11-jre-slim


WORKDIR /BudgetManager


COPY target/BudgetManager-1.0-SNAPSHOT.jar


EXPOSE 8080


ENTRYPOINT ["java", "-jar", "app.jar"]