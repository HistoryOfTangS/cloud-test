#FROM openjdk:12
FROM adoptopenjdk/openjdk14
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8 -Duser.timezone=GMT+08

ARG JAR_FILE
ADD target/${JAR_FILE} cloud-test-user.jar

ENTRYPOINT exec java -jar cloud-test-user.jar