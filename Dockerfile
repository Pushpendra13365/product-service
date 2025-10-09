FROM openjdk:17
WORKDIR /app
COPY ./target/product_service_microservices.jar /app.jar
EXPOSE 9090
CMD ["java","-jar","product_service_microservices.jar"]