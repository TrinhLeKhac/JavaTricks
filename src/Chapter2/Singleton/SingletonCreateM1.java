package Chapter2.Singleton;

/**
 * There are 2 ways to implement singletons
 * Make an static final INSTANCE of class with private Constructor and share it public
 */

public class SingletonCreateM1 {
    public static final SingletonCreateM1 INSTANCE = new SingletonCreateM1();

    private SingletonCreateM1() {
    }
}
