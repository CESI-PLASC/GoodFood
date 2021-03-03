#!/bin/sh -l

sh "docker run --name good-food-db -e MYSQL_ROOT_PASSWORD=root -d mysql:7.5"
sh "docker logs good-food-db"
