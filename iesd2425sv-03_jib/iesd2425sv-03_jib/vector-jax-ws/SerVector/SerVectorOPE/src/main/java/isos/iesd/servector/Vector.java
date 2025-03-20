package isos.iesd.servector;

import java.util.Arrays;
import java.util.List;

import jakarta.jws.WebService;

/**
 * IESD - Distributed Coordination - Vector service example
 *
 */ 
@WebService(endpointInterface = "isos.iesd.servector.IVector")
public class Vector implements IVector {

    private static List<Integer> vector = Arrays.asList(300, 234, 56, 789);


    @Override
    public int read(int pos) {
        System.out.println("Reading from vector position " + pos);
        return vector.get(pos);
    }

    @Override
    public void write(int pos, int n) {
        System.out.println("Writing to vector in position " + pos + " with " + n);
        vector.set(pos, n);
    }

    @Override
    public String invariantCheck() {

        Integer invariant = vector.stream().reduce(0, Integer::sum);
        
        return invariant.toString(); // invariant = 1379
    }
}
