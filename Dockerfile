FROM amazoncorretto:11
COPY target/hello-service-0.0.1-SNAPSHOT.jar hello-service.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=aws","/hello-service.jar"]