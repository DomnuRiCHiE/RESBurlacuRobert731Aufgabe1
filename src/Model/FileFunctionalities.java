package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * The file functionalities class provides functions for I/O operations on files
 */
public class FileFunctionalities {
    public static void writeToFile(List<String> logs, String filename) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(filename))) {
            logs.forEach(printWriter::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
