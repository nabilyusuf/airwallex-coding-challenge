FROM maven:alpine

MAINTAINER  Nabil Yusuf <nabilyusuf1@yahoo.com>

RUN mkdir -p /opt/codingExcersice/airwallex-coding-challenge/
WORKDIR /opt/codingExcersice/airwallex-coding-challenge/

COPY src/main/ /opt/codingExcersice/airwallex-coding-challenge/src/main/
COPY src/test/ /opt/codingExcersice/airwallex-coding-challenge/src/test/
RUN ls -la /opt/codingExcersice/airwallex-coding-challenge/src/*
COPY pom.xml /opt/codingExcersice/airwallex-coding-challenge/
COPY docker-entrypoint.sh /opt/codingExcersice/airwallex-coding-challenge/docker-entrypoint.sh

RUN chmod 777 /opt/codingExcersice/airwallex-coding-challenge/docker-entrypoint.sh

ENTRYPOINT ["/opt/codingExcersice/airwallex-coding-challenge/docker-entrypoint.sh"]
