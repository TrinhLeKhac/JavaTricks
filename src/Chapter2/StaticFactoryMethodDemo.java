package Chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Date;

/**
 * Advantages of factory method:
 * 1 - Unlike constructors, factory method have names
 * 2 - No required to create a new object each time they're invoked
 * 3 - Can return an object of any subtype of their return type
 *
 * Disadvantages of factory method
 * 1 - Classes without public or protected constructors cannot be subclassed*/

public class StaticFactoryMethodDemo {

    public static void main(String[] args) {

        Boolean bool = Boolean.valueOf(true);
        Date d = Date.from(Instant.now());
        BigInteger b = BigInteger.valueOf(Integer.MAX_VALUE);

        FileStore fs;
        try {
            fs = Files.getFileStore(Paths.get("./assets/demo.txt"));
            // System.out.println(Paths.get(".").toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader br;
        try {
            br = Files.newBufferedReader(Paths.get("./assets/demo.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
