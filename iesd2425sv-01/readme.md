# Services Vector

The Vector project is part of the ISystem ISyIESD. It contains one CES called CESVector that has two services: SerVectorServer and SerVectorClient.

## Service SerVector (Server)

### APIM Module (API and Models)

Contains the interface IVector with two methods:

* int read(int pos) - read a position from the vector
* void write(int pos, int n) - write to the vector in a given position

### OPE Module (Operations Element)

Contains the implementation of the IVector interface (Vector) and the main class (SiteServer) that exposes the Web Service in http://localhost:2058/Vector?wsdl.


## Service SerVectorCli (Client)

For details, go to the respective readme.adoc file


### APIM Module (API and Models)

Contains the generated classes of the Web Service. Acts as a proxy. To generate these classes, run `mvn install`. They are located at `servectorclientapim/target/generated-sources/wsimport`.

### OPE Module (Operations)

The implementation of the Client (VectorClient) that call methods implemented by the Server.
