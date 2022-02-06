package Chapter5.Enum;

import java.util.Scanner;

public enum Operation {

    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;
    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x, double y);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First operand: ");
        Double x = Double.parseDouble(scan.nextLine());
        System.out.println("Second operand: ");
        Double y = Double.parseDouble(scan.nextLine());

        for(Operation op: Operation.values()) {
            System.out.printf("%.2f %s %.2f = %.2f%n", x, op, y, op.apply(x, y));
        }
    }
}
