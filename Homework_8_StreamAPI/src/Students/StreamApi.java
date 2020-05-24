package Students;

import java.io.*;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class StreamApi {

        public static void main(String[] args) throws IOException {
            ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("student"));
            Random random = new Random( );
            Comparator<Student> comparator = Comparator.comparing(Student :: getMarks);

            long count = Stream
                            .generate(() -> new Student(random.nextInt(30), random.nextInt(10)))
                            .limit(1000)
                            .sorted (comparator)
                            .filter(val -> val.getMarks >= 7)
                            .peek (System.out::print)
                            .forEach(val -> {
                                try {
                                    object.writeObject(val);
                                } catch (IOException e) {
                                    e.printStackTrace( );
                                }
                            });
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student"))) {
                int i = -1;
                while (( i = ois.available( ) ) != -1) {
                    Student student = (Student) ois.readObject( );
                    System.out.println(student);
                }
            } catch (EOFException | ClassNotFoundException e) {
            }
        }
}

