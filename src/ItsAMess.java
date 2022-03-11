import coffee.shop.WhiteCoffee;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ItsAMess {

    public static void main(String[] args) {
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
