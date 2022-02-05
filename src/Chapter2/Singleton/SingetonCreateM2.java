package Chapter2.Singleton;

/***
 * Make an static final INSTANCE from private constructor, keep it private
 * using a public static method return that INSTANCE
 * This method is a static factory method
 */
public class SingetonCreateM2 {

    private static final SingetonCreateM2 INSTANCE = new SingetonCreateM2();
    private SingetonCreateM2() {

    }
    public static SingetonCreateM2 getInstance() {
        return INSTANCE;
    }
}
