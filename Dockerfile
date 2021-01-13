FROM adoptopenjdk/openjdk11:jre-11.0.8_10-alpine
LABEL maintainer="Sunit Chatterjee (sunitc.dev)"
RUN apk add curl
COPY build/libs/spring-boot-console-app-demo-*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
