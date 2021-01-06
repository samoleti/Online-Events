FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD build/libs/backend-0.0.1-SNAPSHOT.jar /backend.jar
ENTRYPOINT ["java", "-jar","/backend.jar"]