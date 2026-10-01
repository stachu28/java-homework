package Task6;

public enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public double calculate(int a, int b) {
        switch (this) {

            case ADD -> {
                return a + b;
            }

            case SUBTRACT -> {
                return a - b;
            }

            case DIVIDE -> {
                if (b == 0) {
                    System.out.println("Dividing by 0 is not possible!");
                } else {
                    return (double) a / b;
                }
            }

            case MULTIPLY -> {
                return a * b;
            }

            default -> {
                return 0;
            }
        }

        return 0;
    }
}
