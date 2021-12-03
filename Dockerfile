FROM openjdk:15

EXPOSE 8080

COPY target/joseph_bigData.jar .

CMD ["java", "-jar", "joseph_bigData.jar"]