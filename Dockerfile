# ---------- Build Stage ----------
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# ---------- Package Stage ----------
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/demoapi-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]