FROM adoptopenjdk/openjdk14:ubi
LABEL PROJECT_NAME="priceintelligencediscoveryserver"
WORKDIR /opt
ENV PORT 8761
EXPOSE 8761
COPY target/*.jar /opt/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]