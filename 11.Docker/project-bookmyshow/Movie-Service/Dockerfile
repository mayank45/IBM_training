RUN mkdir app
WORKDIR /app

COPY target/movie_service.jar /app/movie_service.jar

EXPOSE 7777
CMD ["java", "-jar", "movie_service.jar"]