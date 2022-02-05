package Chapter2.AvoidCreatingUnnecessaryObjects;

import java.util.regex.Pattern;

/**
 * Reuse a single object instead of creating a new functionally equivalent object each time it is needed
 * An object can be reused if it is immutable
 *
 * String s = new String("ABC"); => don't do THIS
 *
 * We can avoid creating unnecessary objects by using static factory method in preference to constructors
 * Boolean.valueOf(String) is preferable to the constructor Boolean(String)
 *
 * */
public class RomanNumerals {

    // this method is not suitable for repeated use in performance-critical situations
    static boolean isRomanNumeralV1(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // to implement the performance, explicitly compile the regular expression into a Pattern instance
    // as a part of class initialization, cache it and reuse the same instance for repeating
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    static boolean isRomanNumeralV2(String s) {
        return ROMAN.matcher(s).matches();
    }
}
