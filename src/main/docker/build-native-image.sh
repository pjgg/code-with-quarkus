#!/bin/bash -x

source src/main/docker/build.env.sh

mvn package -Pnative -Dquarkus.native.container-build=true -Dmaven.test.skip=true
$DOCKER build --no-cache -f src/main/docker/Dockerfile.native -t $DOCKER_IMAGE .
