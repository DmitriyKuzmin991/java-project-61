.DEFAULT_GOAL := build-run

run:
	./build/install/app/bin/app

build:
	./gradlew clean build

install:
	./gradlew installDist

clean:
	./gradlew clean

test:
	./gradlew test

report:
	./gradlew jacocoTestReport

lint:
	./gradlew checkstyleMain checkstyleTest

update-deps:
	./gradlew useLatestVersions

.PHONY: build
