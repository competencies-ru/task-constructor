FROM openjdk:17-alpine
ADD target/task-constructor.jar task-constructor.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "task-constructor.jar"]