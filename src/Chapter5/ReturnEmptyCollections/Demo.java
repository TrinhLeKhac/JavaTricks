package Chapter5.ReturnEmptyCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    private enum Cheese {
        CHEESE_1,
        CHEESE_2,
        CHEESE_3,
        CHEESE_4;
    }
    private final List<Cheese> cheeseInStock = new ArrayList<>(List.of(new Cheese[]{Cheese.CHEESE_1, Cheese.CHEESE_2}));
    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];
    public List<Cheese> getCheeses() {
        return cheeseInStock.isEmpty() ? Collections.emptyList(): new ArrayList<>(cheeseInStock);
    }
}
