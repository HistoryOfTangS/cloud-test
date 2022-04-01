FROM jdk8
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8 -Duser.timezone=GMT+08

ARG JAR_FILE
ADD target/${JAR_FILE} cloud-test-service.jar

ENTRYPOINT exec java -jar cloud-test-service.jar