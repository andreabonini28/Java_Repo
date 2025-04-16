import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
File file = new File ("prova.txt");

        try {
            FileWriter writer = new FileWriter("prova.txt");

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}