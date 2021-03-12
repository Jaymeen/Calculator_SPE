FROM openjdk:8
COPY ./target/Calculator_Project-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","Calculator_Project-1.0-SNAPSHOT.jar","akshil"]
