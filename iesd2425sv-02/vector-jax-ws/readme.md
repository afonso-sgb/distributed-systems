# Services Vector

The Vector project is abstracted as two ISoS/ISystem Service elements

SerVector
SerVectorCli

# Validation

At the root vector-jax-ws, execute

$ mvn clean package

If there is an error in SerVectirCli, it is because the SerVector is not running

Go to vector-jax-ws/SerVerctor/SerVectorOPE/ (eventually, in a different terminal)

$ java -jar target/SerVectorOPE-0.1.0-jar-with-dependencies.jar

At the root vector-jax-ws, repeat

$ mvn clean package

This time you are expected to obtain no-errors

Go to vector-jax-ws/SerVerctorCli/SerVectorCliOPE/

$ java -jar target/SerVectorCliOPE-0.1.0-jar-with-dependencies.jar

You might obtain from the SerVector

It you select http://localhost:2060/Vector?wsdl,
you obtain the WSDL interface definition