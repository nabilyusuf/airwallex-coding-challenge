#!/bin/bash
set -e

echo "Running the code in the docker container ..."
mvn compile
mvn spring-boot:run