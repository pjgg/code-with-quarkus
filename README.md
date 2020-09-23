# code-with-quarkus project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `code-with-quarkus-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/code-with-quarkus-1.0.0-SNAPSHOT-runner.jar`.

## Docker 

pull&play: `docker pull pjgg/code-with-quarkus:1.0.0-SNAPSHOT`

Create a docker java native image: `make build-docker-native-image`

Create a docker java image: `make build-docker-image`

Push to DockerHub registry: `make push-docker-image`

Run docker image: `make run-docker-image`