# The implementation SerVectorOPE

## To run (validation)

In directory: SerVectorOPE, execute

java -jar target\SerVectorOPE-0.1.0-jar-with-dependencies.jar


# Service SerVectorCli in a OCI container

## Containerfile method

The Containerfile exists in the project directory

podman build  -t servectorcli-oci -f ./Containerfile

Check the created container image

podman image list

Now, start the container in the detached mode (--detach or -d)

podman run --name servectorcli-oci -ti -rm servectorcli-oci:latest
