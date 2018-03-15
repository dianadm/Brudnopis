package knowledge.sixth;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {

    public static void test() throws IOException {
//        throw new IOException();
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
