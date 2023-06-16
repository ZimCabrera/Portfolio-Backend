
FROM amazoncorretto:17-alpine-jdk
MAINTAINER ZIM
COPY target/CynthiaMC-0.0.1-SNAPSHOT.jar  zimcab-app.jar
ENTRYPOINT ["java","-jar","/zimcab-app.jar"] 