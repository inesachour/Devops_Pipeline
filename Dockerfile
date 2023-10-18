FROM openjdk:17
COPY target/TP2_4.jar /app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app.jar"]
