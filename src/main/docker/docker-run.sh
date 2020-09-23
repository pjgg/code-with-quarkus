#!/bin/bash -x

source src/main/docker/build.env.sh

$DOCKER run -i --rm -p 8080:8080 $DOCKER_IMAGE