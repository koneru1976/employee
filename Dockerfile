FROM openjdk:10-jre-slim

WORKDIR /srv

COPY build/libs/employee-0.0.1-SNAPSHOT.jar /srv/app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar","app.jar"]