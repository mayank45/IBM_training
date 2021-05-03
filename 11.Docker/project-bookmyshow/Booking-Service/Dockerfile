FROM java:8

RUN mkdir app
WORKDIR /app

COPY target/booking_service.jar /app/booking_service.jar

EXPOSE 7777
CMD ["java", "-jar", "booking_service.jar"]