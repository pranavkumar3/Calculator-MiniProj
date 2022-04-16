FROM openjdk:8
MAINTAINER Pranav Kumar pranavrox.37@gmail.com
COPY ./target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]