FROM openjdk:8
MAINTAINER Pranav Kumar pranavrox.37@gmail.com
COPY ./target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]

COPY src/ /build/src/
RUN mvn package
RUN mvn install

# Step : Package image
FROM openjdk:11-jre

COPY --from=builder /build/target/calculator_app-1.0-SNAPSHOT-jar-with-dependencies.jar /app/my-app.jar
CMD java -cp /app/my-app.jar app.App