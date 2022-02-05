package Chapter2.ResourceClose;

import java.io.*;

public class ResourceCloseDemo {

    // Using try-catch and finally close
    static String firstLineOfFileV1(String path, String defaultVal) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine(); // can throw exceptions
        } finally {
            br.close(); // can throw exceptions
        }
        // In case: 2 statements throws exceptions, tracking exception is tracking 2nd exception, 1st exception ignore
    }

    // If you write a class that represents a resource that must be
    //closed, your class should implement AutoCloseable interface

    // Using try-with-resources
    static String firstLineOfFileV2(String path, String defaultVal) throws IOException {
        try(
                BufferedReader br = new BufferedReader(new FileReader(path))
        ) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

    private static final int BUFFER_SIZE = 16;
    // Using try-catch-finally
    static void copyV1(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }}
        finally {
            in.close();
        }}

    // try-with-resources
    static void copyV2(String src, String dst) throws IOException {
        try (
                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dst)
        ) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }

    // Always use try-with-resources in preference to try-finally when working with resources that must be closed.
    // The resulting code is shorter and clearer, and the exceptions that it generates are more useful
}
