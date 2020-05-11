FROM openjdk:11-jre-slim
COPY ./build/libs/service1.jar /app/
ENTRYPOINT ["java","-jar", "/app/service1.jar"]
