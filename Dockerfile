FROM amazoncorretto:19
MAINTAINER Lautaro Jofre
COPY target/Jofre-0.0.1-SNAPSHOT.jar jofre-app.jar
ENTRYPOINT ["java","-jar","jofre-app.jar"]
