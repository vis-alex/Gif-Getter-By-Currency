FROM openjdk:11
EXPOSE 8080
WORKDIR /app
COPY ./Gif-Getter-By-Currency-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
