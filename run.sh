#!/bin/bash
docker container stop $(docker container ls -aq)
docker container rm $(docker container ls -aq)
docker image rm service1

sh gradlew clean
sh gradlew build

docker build -t service1 .

docker-compose up