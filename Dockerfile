FROM amazoncorretto:11-alpine
ENTRYPOINT ["/usr/bin/track-service.sh"]

COPY track-service.sh /usr/bin/track-service.sh
COPY target/track-service.jar /usr/share/track-service/track-service.jar
