package Chapter5.Generics;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public class Generics {

    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if(c.isEmpty()) throw new IllegalArgumentException("Empty collection");

        E result = null;
        for(E e: c) {
            if(result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }

    public static <E extends Comparable<E>> Optional<E> maxOptional(Collection<E> c) {
        if(c.isEmpty()) {
            return Optional.empty();
        }
        E result = null;
        for(E e: c) {
            if(result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return Optional.of(result);
    }


}
