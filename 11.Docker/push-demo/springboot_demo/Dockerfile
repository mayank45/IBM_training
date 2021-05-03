FROM java:8

RUN mkdir app
WORKDIR /app

COPY target/my_demo.jar /app/demo.jar

EXPOSE 7777
CMD ["java", "-jar", "demo.jar"]