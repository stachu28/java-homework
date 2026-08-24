package Task6;

public enum Calculation {
    ADD {
        public int calculate(int a, int b) {
            return a + b;
        }
    }, SUBTRACT {
        public int calculate(int a, int b) {
            return a - b;
        }
    }, MULTIPLY {
        public int calculate(int a, int b) {
            return a * b;
        }
    }, DIVIDE {
        public int calculate(int a, int b) {
            return a / b;
        }
    };
    abstract int calculate(int a, int b);
}
