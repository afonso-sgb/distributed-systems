package isos.tutorial.isyvector.cesvector.servectorcli;

import isos.tutorial.isyvector.cesvector.servector.IVector;

public class Check{

    static void check(IVector port){
        System.out.println(port.invariantCheck());
    }
}