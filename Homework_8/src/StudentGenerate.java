import java.io.Serializable;
import java.util.Random;

public class StudentGenerate implements Serializable, Comparable <StudentGenerate> {
    public String name;

    public StudentGenerate () {
        char [] chars = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        int count = (1+ (int) (Math.random()* 25));

        for (int i=0; i < count; i++) {
            char a = chars [random.nextInt(chars.length )];
            randomString.append(a);
        }
        System.out.println(randomString.toString());
        this.name = randomString.toString();

    }
    public String toString () {
        String string = this.name;
        return string;
    }

    @Override
    public int compareTo(StudentGenerate o) {
        return this.name.compareTo(o.name);
    }
}
