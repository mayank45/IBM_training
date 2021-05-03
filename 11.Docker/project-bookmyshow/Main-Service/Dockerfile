RUN mkdir app
WORKDIR /app

COPY target/main_service.jar /app/main_service.jar

EXPOSE 7777
CMD ["java", "-jar", "main_service.jar"]