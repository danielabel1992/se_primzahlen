package histogram;

import org.junit.Before;
import org.junit.Test;
import strategy.Prime1;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HistogramTest {

    private Histogram histogram;
    ArrayList<Integer> list;

    @Before
    public void init() {
        list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        this.histogram = new Histogram.Builder().primeNumbers(list).prime(new Prime1()).build();
    }

    @Test
    public void getDescriptionTest() {
        assertNotNull(histogram.getDescription());
    }

    @Test
    public void primesTest() {
        assertNotNull(histogram.primes(10));
    }

    @Test
    public void histrogramTest() {
        assertNotNull(histogram.histrogram(list));
    }
}