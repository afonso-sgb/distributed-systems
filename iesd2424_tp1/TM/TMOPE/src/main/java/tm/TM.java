package tm;

import java.util.Arrays;
import java.util.List;

import jakarta.jws.WebService;

@WebService(endpointInterface = "tm.ITM")
public class TM implements ITM{

    @Override
    public int check(int a) {
        return a + 5;
    }
}
