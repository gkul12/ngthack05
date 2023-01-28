FROM openjdk:8
EXPOSE 9969
COPY /build/libs/brownfield.jar brownfield.jar
ENTRYPOINT ["java", "-jar", "brownfield.jar"]
