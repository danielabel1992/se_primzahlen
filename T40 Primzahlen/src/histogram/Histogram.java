package histogram;

import Decorator.Prime;
import Decorator.PrimeDecorator;

import java.util.ArrayList;

public class Histogram extends PrimeDecorator {

    private ArrayList<Integer> digits;

    private Prime prime;

    private Histogram(Builder builder) {
        this.prime = builder.prime;
        this.digits = new ArrayList<>();
    }

    @Override
    public String getDescription() {
        return this.prime.getDescription() + ", Histogram";
    }

    @Override
    public ArrayList<Integer> primes(int range) {
        return this.histrogram(this.prime.primes(range));
    }

    public ArrayList<Integer> histrogram(ArrayList<Integer> primes) {
        ArrayList<Integer> counts = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++) {
            counts.add(0);
        }
        for (int prime : primes) {
            int digit = prime % 10;
            counts.set(digit-1, counts.get(digit-1) + 1) ;
        }
        return counts;
    }

    public static class Builder {

        private ArrayList<Integer> primeNumbers;
        private Prime prime;

        public Builder prime(Prime prime) {
            this.prime = prime;
            return this;
        }

        public Builder primeNumbers(ArrayList<Integer> primeNumbers) {
            this.primeNumbers = primeNumbers;
            return this;
        }

        public Histogram build() {
            return new Histogram(this);
        }

    }

}
