public class Histogram {

    private int digit1 = 0;
    private int digit2 = 0;
    private int digit3 = 0;
    private int digit4 = 0;
    private int digit5 = 0;
    private int digit6 = 0;
    private int digit7 = 0;
    private int digit8 = 0;
    private int digit9 = 0;

    private Histogram(Builder builder) {
        digit1 = builder.digit1;
        digit2 = builder.digit2;
        digit3 = builder.digit3;
        digit4 = builder.digit4;
        digit5 = builder.digit5;
        digit6 = builder.digit6;
        digit7 = builder.digit7;
        digit8 = builder.digit8;
        digit9 = builder.digit9;
    }

    public static class Builder {
        private int digit1 = 0;
        private int digit2 = 0;
        private int digit3 = 0;
        private int digit4 = 0;
        private int digit5 = 0;
        private int digit6 = 0;
        private int digit7 = 0;
        private int digit8 = 0;
        private int digit9 = 0;

        public Builder digit1(int count) {
            digit1 = count;
            return this;
        }

        public Builder digit2(int count) {
            digit2 = count;
            return this;
        }

        public Builder digit3(int count) {
            digit3 = count;
            return this;
        }

        public Builder digit4(int count) {
            digit4 = count;
            return this;
        }

        public Builder digit5(int count) {
            digit5 = count;
            return this;
        }

        public Builder digit6(int count) {
            digit6 = count;
            return this;
        }

        public Builder digit7(int count) {
            digit7 = count;
            return this;
        }

        public Builder digit8(int count) {
            digit8 = count;
            return this;
        }

        public Builder digit9(int count) {
            digit9 = count;
            return this;
        }

        public Histogram build() {
            return new Histogram(this);
        }

    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Primzahlen - Verteilung der Endziffern:\n");
        sb.append("\n\t1 : ").append(digit1);
        sb.append("\n\t2 : ").append(digit2);
        sb.append("\n\t3 : ").append(digit3);
        sb.append("\n\t4 : ").append(digit4);
        sb.append("\n\t5 : ").append(digit5);
        sb.append("\n\t6 : ").append(digit6);
        sb.append("\n\t7 : ").append(digit7);
        sb.append("\n\t8 : ").append(digit8);
        sb.append("\n\t9 : ").append(digit9);

        return sb.toString();
    }

}
