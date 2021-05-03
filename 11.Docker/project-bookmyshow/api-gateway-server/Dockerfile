FROM java:8

RUN mkdir app
WORKDIR /app

COPY target/api_gateway.jar /app/api_gateway.jar

EXPOSE 7777
CMD ["java", "-jar", "api_gateway.jar"]