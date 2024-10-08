FROM openjdk:23

WORKDIR /app

COPY target/week3_recap_partb-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "week3_recap_partb-0.0.1-SNAPSHOT.jar", "spring.profiles.active=docker"]