#!/bin/bash -x

source src/main/docker/build.env.sh

mvn package -Dmaven.test.skip=true
$DOCKER build --no-cache -f src/main/docker/Dockerfile.jvm -t $DOCKER_IMAGE .