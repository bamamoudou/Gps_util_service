FROM openjdk:8-jdk-alpine
LABEL maintainer="mamoudouba8787@gmail.com"
VOLUME /tmp
EXPOSE 8081
COPY build/libs/gpsutil_api-1.0.0.jar gps.jar
ENTRYPOINT ["java","-jar","gps.jar"]