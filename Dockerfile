FROM openjdk:8
ADD target/app-0.0.1-SNAPSHOT.jar app-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","app-0.0.1-SNAPSHOT.jar"]