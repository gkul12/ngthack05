FROM openjdk:17
EXPOSE 9969
COPY /build/libs/brownfield.jar brownfield.jar
ENTRYPOINT ["java", "-jar", "brownfield.jar"]
