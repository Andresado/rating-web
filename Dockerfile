FROM openjdk18-openshift:latest
VOLUME /tmp
COPY /target/Ejemplosoap-01.jar /deployments/Ejemplosoap-01.jar
ENTRYPOINT ["/opt/run-java/run/run-java.sh"]
EXPOSE 8080