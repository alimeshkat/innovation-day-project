# innovation-day-project #3

Prerequisites:
- Install Java 17
- Install GraalVM


What to make:

- Simple Spring Boot application in Kotlin
- Rest: H2 database, create some resources.(We may use the Expose framework instead of JPA)
- Use spring cloud config server
- Add a rest client to call another service (Ktor client)
- Add a Kafka producer/consumer
- Serverless 

Presentation:

Show dif mem usage startup time 
- use https://visualvm.github.io/ for memory usage


---

## Install guide

With docker.
```shell
mvn -Pnative spring-boot:build-image
```
Without docker. Follow the guide [here](https://docs.spring.io/spring-boot/docs/3.0.0/reference/html/native-image.html#native-image.developing-your-first-application.native-build-tools.prerequisites) to install GraalVm tool and native image build tool.
```shell
mvn -Pnative native:compile
```
