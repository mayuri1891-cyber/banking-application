FROM eclipse-temurin:17-jdk

COPY wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh

WORKDIR /app
COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]