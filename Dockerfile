FROM tomcat:8.0-jre8

ARG DEPENDENCY=target/dependency
# se añaden los archivos dentro del Apache Tomcat
COPY ${DEPENDENCY}/LoggerUtils.war /usr/local/tomcat/webapps/logger-utils.war
CMD ["catalina.sh","run"]
