package read;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SearchMain {
    public static void main(String[] args) {
        String separator = File.separator;
        String filePath = "D:" + separator + "Война и мир.txt" ;

        EasySearch s = new EasySearch();

        System.out.println("Слово \"война\" встречается " + s.search(s.str1, s.readAllBytesJava7(s.filePath)) +" раз");
        System.out.println("Слово \"мир\" встречается " + s.search(s.str3, s.readAllBytesJava7(s.filePath)) + " раз");
        System.out.println("Слово \"и\" встречается " + s.search(s.str2, s.readAllBytesJava7(s.filePath)) + " раз");
    }
}

