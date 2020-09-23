DEPLOYMENT ?= ./src/main/docker

.PHONY: build-docker-native-image
build-docker-native-image: | $(DEPLOYMENT)
	$(DEPLOYMENT)/build-native-image.sh

.PHONY: build-docker-image
build-docker-image: | $(DEPLOYMENT)
	$(DEPLOYMENT)/build-image.sh

.PHONY: push-docker-image
push-docker-image: | $(DEPLOYMENT)
	$(DEPLOYMENT)/push-docker-image.sh

.PHONY: run-docker-image
run-docker-image: | $(DEPLOYMENT)
	$(DEPLOYMENT)/docker-run.sh