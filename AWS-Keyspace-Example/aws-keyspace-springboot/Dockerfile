#
# Build stage
#
FROM maven AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk
COPY ./target/earlynosh-gateway.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch earlynosh-gateway.jar'
ENTRYPOINT ["java","-jar","earlynosh-gateway.jar"]
