import strategy.IStrategy;

import java.util.ArrayList;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public ArrayList<Integer> primes(int range) {
        return strategy.primes(range);
    }
}