FROM openjdk:11
MAINTAINER baeldung.com
COPY target/KuberTest-1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]