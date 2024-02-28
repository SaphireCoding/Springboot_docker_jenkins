FROM openjdk:17


ARG JAR_FILE=target	/*.jar

COPY ${JAR_FILE} springbt-dkr-jnks.jar


ENTRYPOINT ["java", "-jar", "springbt-dkr-jnks.jar"]
