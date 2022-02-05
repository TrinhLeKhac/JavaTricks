package Chapter2.NonInstantiableClass;

/**
 * Utility classes were not designed to be instantiated
 *
 * Solution:
 * Make the constructor is private => it is inaccessable outside the class
 * The AssertionError => insurance in case the constructor is accidentally invoked from within the class
 * Prevent class from being subclassed
 * */
public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
    throw new AssertionError();
    }
}
