import Decorator.Prime;
import histogram.Histogram;
import strategy.IStrategy;
import strategy.Prime1;

import java.util.ArrayList;

public class Application {




    public static void main(String... args) {

        int range = 100000;

        IStrategy strategy = new Prime1(); // Alternativen: Prime1, Prime2, Prime3
        Context context = new Context(strategy);
        ArrayList<Integer> list = context.primes(range);
        Histogram histogram = new Histogram.Builder().primeNumbers(list).build();
        ArrayList<Integer> digits = histogram.histrogram(context.primes(range));
        System.out.println(digits.toString()); // Liefert eine Auflistung mit der Anzahl der auzutretenden Zahlen


    }

}
