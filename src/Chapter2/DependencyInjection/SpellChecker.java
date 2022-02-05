package Chapter2.DependencyInjection;

import java.util.Objects;

/**
 * Do not use a singleton or static utility class to implement a class that depends on underlying resources
 * Instead, pass the resources or factories to create them into the constructor(static factory or builder)
 * This calls dependency injection, will greatly enhance for flexibility, reusability and testability
 * */

public class SpellChecker {
    private static class Lexion {
    }
    private final Lexion dictionary;

    public SpellChecker(Lexion dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }
}
