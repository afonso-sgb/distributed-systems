package isos.tutorial.isyvector.cesvector.servector;


import java.util.Arrays;
import java.util.List;

import jakarta.jws.WebService;

/**
 * IESD - Distributed Coordination - Vector service example
 **/
@WebService(endpointInterface = "isos.tutorial.isyvector.cesvector.servector.IVector")
public class Vector implements IVector {

    protected static List<Integer> vector = Arrays.asList(300, 234, 56, 789);
    protected final static int CONST_SUM = vector.stream().mapToInt(Integer::intValue).sum();

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
		// Invariant validation logic
        if (CONST_SUM != vector.stream().mapToInt(Integer::intValue).sum()){
            return "NOK";
        }
		return "OK";
	}
}
