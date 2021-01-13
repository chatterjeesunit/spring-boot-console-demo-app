# Dummy Spring Boot Console application

## Build Application
```
./gradlew clean build
```

## Run Console application
Build application first.

 * Default `Hello` Task
```
java -jar build/libs/spring-boot-console-app-demo-1.0.0.jar 
```
* `UUID` Task
```
java -jar build/libs/spring-boot-console-app-demo-1.0.0.jar uuid 
```

## Build Docker Image
Build application first
```
docker build -t spring-boot-console-app:1.0

```

## Run via Docker
Build docker image first
 * Default `Hello` Task
```
docker run --rm --name demoapp spring-boot-console-app:1.0 
```
* `UUID` Task
```
docker run --rm --name demoapp spring-boot-console-app:1.0 uuids 
```
