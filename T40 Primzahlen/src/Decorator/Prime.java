package Decorator;

import strategy.IStrategy;

import java.util.ArrayList;

public abstract class Prime implements IStrategy{

    private String description ="Primes";

    public String getDescription() {
        return description;
    }

    public abstract ArrayList<Integer> primes(int range);

}
