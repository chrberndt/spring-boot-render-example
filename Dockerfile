FROM eclipse-temurin:17-jdk-alpine
// VOLUME /tmp
COPY . .
RUN ./gradlew jar

COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080