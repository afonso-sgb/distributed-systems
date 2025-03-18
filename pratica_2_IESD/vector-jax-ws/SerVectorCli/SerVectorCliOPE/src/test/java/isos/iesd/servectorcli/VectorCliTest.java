package isos.iesd.servectorcli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for a simple App.
 */
public class VectorCliTest {

    @Test
    @DisplayName("expected invariant 1379")
    void invokeVerctorServices() {
        VectorClient vectorClient = new VectorClient();
        assertEquals("1379", vectorClient.invariantVerctorServices(), "invariant value expected 1379");
    }
}
