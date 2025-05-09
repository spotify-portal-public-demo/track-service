FROM amazoncorretto:21-alpine
ENTRYPOINT ["/usr/bin/track-service.sh"]

COPY track-service.sh /usr/bin/track-service.sh
COPY target/*.jar /usr/share/track-service/track-service.jar
