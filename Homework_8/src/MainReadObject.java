import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class MainReadObject {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("student");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<StudentGenerate> listStudent = new ArrayList<>();
        try {
            while (ois.available( ) != -1) {
                StudentGenerate student = (StudentGenerate) ois.readObject( );
                listStudent.add(student);
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace( );
        }
        System.out.println(listStudent.toString());

        Collections.sort(listStudent);
        System.out.println(" ");

        FileWriter writer = new FileWriter("student");
        writer.write("Отсортированный список");
        for (StudentGenerate student:listStudent) {
            String name = student.name;
            System.out.println(name);
        }

        writer.flush();
        writer.close();

        }
        }