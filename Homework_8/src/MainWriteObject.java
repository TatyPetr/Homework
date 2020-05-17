import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainWriteObject {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("student");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i <= 100_000; i++) {
                StudentGenerate student = new StudentGenerate();
                oos.writeObject(student);
            }
            oos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
