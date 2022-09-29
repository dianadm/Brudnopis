import coffee.shop.WhiteCoffee;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ItsAMess {

    public static void main(String[] args) {
        Path path = Paths.get("demo.txt");

        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        List<File> files = new ArrayList<>();
        files.add(new File("C:\\work\\files\\TEMP_FILES\\Book1.xlsx"));
        files.add(new File("C:\\work\\files\\TEMP_FILES\\Book2.xlsx"));

/*        for (File f :files) {
            if (f.getName().contains("Book1")) {
                files.remove(f);
                f.delete();
            }
        }*/

        files.stream().forEach(f -> { if (f.getName().contains("Book1")) {
            f.delete();
        }});

        for (File f :files) {
            System.out.println(f.getName());
        }
    }

}
