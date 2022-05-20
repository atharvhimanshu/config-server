FROM openjdk:11-jdk
VOLUME /tmp
ADD config-server-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8761
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]