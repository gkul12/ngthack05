FROM openjdk:8
EXPOSE 9969
COPY --from=build /home/gradle/src/build/libs/brownfield.jar brownfield.jar
ENTRYPOINT ["java", "-jar", "brownfield.jar"]