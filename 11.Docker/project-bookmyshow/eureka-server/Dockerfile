FROM java:8

RUN mkdir app
WORKDIR /app

COPY target/eureka_server.jar /app/eureka_server.jar

EXPOSE 8761
CMD ["java", "-jar", "eureka_server.jar"]