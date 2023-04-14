


1.  localhost:9090/kyc/swagger-ui/index.html
2.  http://localhost:9090/kyc/h2-console/   [  jdbc:h2:file:./data/kyc & sa, password ]
3.  http://localhost:9090/kyc/userKYC


docker build --tag=kyc:latest .         --working
docker run -p 9090:9090 kyc:latest      --working
