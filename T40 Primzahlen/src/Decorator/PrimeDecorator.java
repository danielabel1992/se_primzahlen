package Decorator;

import java.util.ArrayList;

public abstract class PrimeDecorator extends Prime {
    public abstract String getDescription();
    public abstract ArrayList<Integer> primes(int range);

}
