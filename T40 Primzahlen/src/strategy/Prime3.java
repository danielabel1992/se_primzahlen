package strategy;

import Decorator.Prime;

import java.util.ArrayList;

public class Prime3 extends Prime implements IStrategy {

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
        //check if n is a multiple of 2
        if (n % 2 == 0) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
