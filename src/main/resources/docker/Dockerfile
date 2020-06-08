FROM openjdk:8-jdk-alpine
WORKDIR /opt/app
ARG JAR_FILE=target/chatroom-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]

FROM rabbitmq:3-management

RUN rabbitmq-plugins enable --offline rabbitmq_stomp

EXPOSE 61613