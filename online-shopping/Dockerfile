#define base docker image
FROM openjdk:11
EXPOSE 8080
ADD target/onlineshoppingapp.jar onlineshoppingapp.jar
ENTRYPOINT ["java","-jar","onlineshoppingapp.jar"]