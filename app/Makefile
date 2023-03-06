.DEFAULT_GOAL := build-run

run-dist:
	./build/install/app/bin/app

run:
	./gradlew run

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