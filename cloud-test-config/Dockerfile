FROM jdk8:v1.0
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8 -Duser.timezone=GMT+08

ARG JAR_FILE
ADD target/${JAR_FILE} cloud-test-config.jar

ENTRYPOINT exec java -jar cloud-test-config.jar