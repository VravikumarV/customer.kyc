FROM openjdk:17
COPY target/customer.kyc-0.0.1-SNAPSHOT.jar kyc-1.0.0.jar
ENTRYPOINT ["java","-jar","/kyc-1.0.0.jar"]