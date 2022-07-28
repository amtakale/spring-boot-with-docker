FROM openjdk:8-alpine

MAINTAINER AMIT TAKALE <amtakale@cisco.com>

COPY ./target/spring-boot-with-docker-app.war .

CMD ["java", "-jar", "spring-boot-with-docker-app.war"]