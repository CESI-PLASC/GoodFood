#!/bin/sh -l

echo "DOCKER VERSION"
docker -v

docker run --name good-food-db -e MYSQL_ROOT_PASSWORD=root -d mysql:7.5
docker logs good-food-db
