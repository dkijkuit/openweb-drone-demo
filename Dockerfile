FROM eclipse-temurin:19-jre-alpine
COPY target/demo-*.jar app.jar
#COPY /drone/src/target/demo-*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]