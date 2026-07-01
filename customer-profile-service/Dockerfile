FROM maven:3.9-eclipse-temurin-21-alpine AS build
WORKDIR /workspace
COPY pom.xml .
COPY customer-profile-service/pom.xml customer-profile-service/
RUN mvn -pl customer-profile-service -am dependency:go-offline -q
COPY customer-profile-service/src customer-profile-service/src
RUN mvn -pl customer-profile-service -am package -DskipTests -q

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /workspace/customer-profile-service/target/customer-profile-service-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
