package read;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasySearch implements ISearchEngine {
    String separator = File.separator;
    String filePath = "D:"+separator+"Война и мир.txt";

    String str1 = " Война ";
    String str2 = " И ";
    String str3 = " Мир ";

    @Override
    public int search(String strings, String word) {
        word = word.toUpperCase();
        strings = strings.toUpperCase();

        int a = word.indexOf(strings);
        int count = 0;
        while (a >= 0){
            count ++;
            a = word.indexOf(strings, a + 1);
            }
        return count ;
    }

        protected static String readAllBytesJava7(String filePath){
            String content = " ";
            try {
                content = new String(Files.readAllBytes(Paths.get(filePath)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return content;
        }
}
