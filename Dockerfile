FROM openjdk:8
ADD target/docker-simple-cicd.jar docker-simple-cicd.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","docker-simple-cicd.jar"]