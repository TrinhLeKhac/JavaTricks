package Chapter4.Constant;

/**
 * If the constants are strongly tied to an existing class or interface,
 * you should add them to the class or interface
 * all of the boxed numerical primitive classes, such as Integer and Double,
 * export MIN_VALUE and MAX_VALUE constants
 *
 *If the constants are best viewed as members of an
 * enumerated type, you should export them with an enum type
 *
 * Otherwise, you should export the constants with a noninstantiable utility class
 * */
public class PhysicalConstants {
    private PhysicalConstants() {

    }
    public static final double AVOGADROS_NUMBER = 6.022_140_857e23;
    public static final double BOLTZMANN_CONST = 1.380_648_52e-23;
    public static final double ELECTRON_MASS = 9.109_383_56e-31;
}
