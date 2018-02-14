package strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Prime3Test {

    private Prime3 prime3;

    @Before
    public void init() {
        prime3 = new Prime3();
    }

    @Test
    public void primesTest() {
        assertNotNull(prime3.primes(10));
    }
}