FROM eclipse-temurin:17-jdk-alpine
COPY . .
RUN ./gradlew jar
RUN cp ./build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
