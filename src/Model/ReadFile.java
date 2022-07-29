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
    public void readFile() throws FileNotFoundException {
        //Odczytuje linijka po linijce z pliku źródłowego
        Scanner s = new Scanner(new File("C:/Programowanie/Task1/Words.txt"));
        //dodaje do listy wyrazy z pliku
        ArrayList<String> list = new ArrayList<>();
        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();
        //sprawdzam czy działa i wyświetlam wszystko
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
