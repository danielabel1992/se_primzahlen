import java.util.ArrayList;

public class Application {

    private static int[] getCountOfDigits(ArrayList<Integer> primes) {
        int counts[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int prime : primes) {
            int digit = prime % 10;
            counts[digit-1] = counts[digit-1] + 1;
        }
        return counts;
    }


    public static void main(String... args) {

        int range = 1000000;
        IStrategy strategy = new Prime1();
//        IStrategy strategy = new Prime2();
//        IStrategy strategy = new Prime3();

        Context context = new Context(strategy);
        ArrayList<Integer> list = context.executeStrategy(range);

        int counts[] = getCountOfDigits(list);
        Histogram histogram = new Histogram.Builder().digit1(counts[0])
                                                    .digit2(counts[1])
                                                    .digit3(counts[2])
                                                    .digit4(counts[3])
                                                    .digit5(counts[4])
                                                    .digit6(counts[5])
                                                    .digit7(counts[6])
                                                    .digit8(counts[7])
                                                    .digit9(counts[8])
                                                    .build();
        System.out.println(histogram);

    }

}
