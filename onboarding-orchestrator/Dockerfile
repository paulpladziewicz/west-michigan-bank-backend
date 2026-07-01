FROM maven:3.9-eclipse-temurin-21-alpine AS build
WORKDIR /workspace
COPY pom.xml .
COPY onboarding-orchestrator/pom.xml onboarding-orchestrator/
RUN mvn -pl onboarding-orchestrator -am dependency:go-offline -q
COPY onboarding-orchestrator/src onboarding-orchestrator/src
RUN mvn -pl onboarding-orchestrator -am package -DskipTests -q

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /workspace/onboarding-orchestrator/target/onboarding-orchestrator-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
