FROM openjdk:11

COPY . /app

WORKDIR /app

ENV GRADLE_USER_HOME=/cache
RUN mkdir /cache

RUN chmod +x gradlew

CMD ./gradlew bootRun
