# The implementation SerVectorOPE

## To run
java -jar target\SerVectorOPE-0.1.0-jar-with-dependencies.jar

## To validate
Validate service availability opening a browser with : http://localhost:2060/Vector?wsdl


# Service SerVector in a OCI container

## Containerfile method

The Containerfile exists in the project directory

podman build  -t servector-oci -f ./Containerfile

Check the created container image

podman image list

Now, start the container in the detached mode (--detach or -d)

podman run --name servector-oci --detach -p 2060:2060 servector-oci:latest


Validate service opening a browser with : http://localhost:2060/Vector?wsdl


## Jib method

mvn clean package jib:dockerBuild -Djib.dockerClient.executable=$(which podman)

The image localhost/ can be seen at local container registry
$ podman image list
REPOSITORY                         TAG           IMAGE ID      CREATED       SIZE
...
localhost/servector-oci-jib        latest        67db81119009  55 years ago  302 MB
...

To run the container

podman run -td --name=servector-oci-jib -p 2060:2060 localhost/servector-oci-jib

