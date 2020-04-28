package Study;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Words {
    public static void main(String[] args) {
        String text = readAllBytesJava7("D:Война и мир.txt");
        String[] words = text.toLowerCase().split(" ");
        Map<String, Integer> data = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            word = word.replace("?", "");
            word = word.replace("!", "");
            word = word.replace(".", "");
            word = word.replace(",", "");
            word = word.replace(";", "");
            if (data.containsKey(word)) {
                data.put(word, data.get(word) + 1);
            } else {
                data.put(word, 1);
            }
        }
        List<Map.Entry<String, Integer>> sort = new ArrayList<>(data.entrySet());
        Collections.sort(sort, new NewValue());

        System.out.println("10 часто встрeчaющихся слов:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(sort.get(i));
        }
    }

    protected static String readAllBytesJava7(String filePath)
    {
        String content = "";
        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return content;
    }
}

