package strategy;

import Decorator.Prime;

import java.util.ArrayList;

public class Prime2 extends Prime implements IStrategy {

    @Override
    public ArrayList<Integer> primes(int range) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        for (int i = 1; i <= range; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    private boolean isPrime(int n) {
        for (int i = 2; 2 * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
