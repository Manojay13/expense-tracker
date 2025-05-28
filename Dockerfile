FROM maven:3.9.6-eclipse-temurin-21 AS build
COPY . .
RUN maven clean package -DskipTests

FROM eclipse-temurin:21-jdk
COPY --from=build COPY --from=build /target/*.jar expenseTracker.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","expenseTracker.jar" ]
