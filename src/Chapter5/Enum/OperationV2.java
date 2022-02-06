package Chapter5.Enum;

/**
 * Java 8, lambdas are by far the best way to represent small
 * function objects. Don’t use anonymous classes for function objects unless you
 * have to create instances of types that aren’t functional interfaces
 * */
import java.util.function.DoubleBinaryOperator;

public enum OperationV2 {
    PLUS("+", Double::sum),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator op;

    OperationV2(String symbol,DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() {return symbol;}

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }
}
