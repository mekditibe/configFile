FROM openjdk:19
LABEL MAINTAINER="Mekdes"
COPY target/user-service-0.0.1-SNAPSHOT.jar appuser.jar

ENTRYPOINT ["java", "-jar","appuser.jar"]