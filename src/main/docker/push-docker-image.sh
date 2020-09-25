#!/bin/bash -x

source src/main/docker/build.env.sh

echo "Pushing Docker image"
docker login -u "$DOCKER_USER" -p "$DOCKER_PWD" docker.io
$DOCKER push $DOCKER_IMAGE

