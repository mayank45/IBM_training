RUN mkdir app
WORKDIR /app

COPY target/user_service.jar /app/user_service.jar

EXPOSE 7777
CMD ["java", "-jar", "user_service.jar"]