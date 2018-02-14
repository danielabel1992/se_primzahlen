package strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Prime2Test {

    private Prime2 prime2;

    @Before
    public void init() {
        prime2 = new Prime2();
    }

    @Test
    public void primesTest() {
        assertNotNull(prime2.primes(10));
    }
}