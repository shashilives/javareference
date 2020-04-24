package problem.solving;

public enum Opeartions {
    PLUS {
        public double apply(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        @Override
        public double apply(int x, int y) {
            return x-y;
        }
    };

    public abstract double apply(int x, int y);
}
