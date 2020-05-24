package Students;

import java.io.Serializable;

public class Student implements Serializable {
    private int name;
    private int marks;

    public Student(int name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "name -" + name +
                " marks -" + marks +
                '}';
    }
}
