package Chapter5.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("trinhlk2");
        words.add("yippie");

        // anonymous class
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        // lambda expression
        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // Solution 3
        words.sort(Comparator.comparingInt(String::length));

        for(String w: words) {
            System.out.println(w);
        }
    }
}
