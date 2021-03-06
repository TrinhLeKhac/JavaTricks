package Chapter3.Comparable;

import java.util.Comparator;

public class PhoneNumber implements Comparable<PhoneNumber>{
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if(val < 0 || val > max) throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public int compareTo(PhoneNumber pn) {
        int result = Short.compare(areaCode, pn.areaCode);
        if(result == 0) {
            result = Short.compare(prefix, pn.prefix);
            if(result == 0) {
                result = Short.compare(lineNum, pn.lineNum);
            }
        }
        return result;
    }

    private static final Comparator<PhoneNumber> COMPARATOR =
            Comparator.comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt(pn -> pn.prefix)
                    .thenComparingInt(pn -> pn.lineNum);

    public int compareToV2(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }
}
