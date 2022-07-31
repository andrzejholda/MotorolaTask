package Model;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {

    public String readFile(int line) throws FileNotFoundException {

        String word= new String();

        try {
            word = Files.readAllLines(Paths.get("C:/Programowanie/Task1/Words.txt")).get(line);

        } catch (IOException e) {
            System.out.println(e);
        }
        return word;
    }
    public int howManyLines() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:/Programowanie/Task1/Words.txt"));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();
        return lines;
    }
}