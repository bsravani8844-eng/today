FROM openjdk:21
COPY target/today.jar today.jar
CMD ["java", "-jar", "today.jar"]