package strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Prime1Test {

    private Prime1 prime1;

    @Before
    public void init() {
        prime1 = new Prime1();
    }

    @Test
    public void primesTest() {
        assertNotNull(prime1.primes(10));
    }
}