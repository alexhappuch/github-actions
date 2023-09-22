FROM openjdk:17
EXPOSE 8080
ADD target/github-actions-spi.jar github-actions-spi.jar
ENTRYPOINT ["java","-jar","/github-actions-spi.jar"]