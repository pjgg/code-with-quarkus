#!/bin/bash -x

source src/main/docker/build.env.sh

if [ $ONLY_CHECK_COMMIT = "false" ]; then
    echo "Pushing Docker image"
    docker login -u "$DOCKER_USER" -p "$DOCKER_PWD" docker.io
    $DOCKER -- push $DOCKER_IMAGE
else
    echo "ONLY_CHECK_COMMIT is true. Not pushing."
fi
