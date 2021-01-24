# Product Service

## This project is responsible to product

### Docker

To run the project with docker you need do some steps


Execute Gradle build or the command ./gradlew build && java -jar build/libs/name_app.jar
After it run docker build --build-arg JAR_FILE=build/libs/\*.jar -t springio/gs-spring-boot-docker . and docker run -p 8080:8080 springio/gs-spring-boot-docker