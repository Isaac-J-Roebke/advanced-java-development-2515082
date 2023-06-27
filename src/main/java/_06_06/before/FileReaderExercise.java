package _06_06.before;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExercise {

    // This method should return the first line of BufferedReaderVsScanner.txt.
    String getFirstLine() {
        String firstLine = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_06/BufferedReaderVsScanner.txt"));) {
            firstLine = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return firstLine;
    }

    // This method should return all of the content of BufferedReaderVsScanner.txt
    // as a single String.
    String getWholeFile() {
        String wholeFile = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_06/BufferedReaderVsScanner.txt"));) {
            StringBuilder builder = new StringBuilder();
            reader.lines().forEach(line -> builder.append(line + " "));
            wholeFile = builder.toString();
            System.out.println(wholeFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wholeFile;
    }

}
