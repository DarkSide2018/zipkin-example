#!/bin/bash
echo "=========================="
echo "Creating postgres"
echo "----------------"

docker container stop zipkin-postgres


echo "=========================="
echo "launch docker"
echo "----------------"

docker container rm zipkin-postgres


docker run --name zipkin-postgres   \
             -e POSTGRES_USER=migration     \
             -e POSTGRES_PASSWORD=123456    \
             -e POSTGRES_DB=zipkin_db -p 5432:5432 \
             -d postgres


echo "=========================="
echo "launch gradle"
echo "----------------"
sleep 1

./gradlew clean
./gradlew generateJooq
./gradlew bootJar
echo "=========================="
echo "local env was created"
echo "----------------"
