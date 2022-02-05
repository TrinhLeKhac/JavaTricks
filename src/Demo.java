import java.util.Arrays;

// public classes should never expose mutable fields
public class Demo {
    public static void main(String[] args) {
        final int[] a = {1, 2, 3}; // array is mutable, final modifiers but can change value
        a[0] = 4;
        System.out.println(Arrays.toString(a));
    }
}
