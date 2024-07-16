# Etapa de construcción
FROM gradle:7.5.1-jdk17 AS build
WORKDIR /home/gradle/project
COPY . .
RUN gradle clean bootJar

# Etapa final
FROM openjdk:17
WORKDIR /my-project
COPY --from=build /home/gradle/project/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]