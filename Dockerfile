FROM openjdk:17-jdk

WORKDIR /app

COPY target/ScientificCalculator-1.0-SNAPSHOT.jar /app/ScientificCalculator.jar

CMD ["java", "-jar", "ScientificCalculator.jar"]

