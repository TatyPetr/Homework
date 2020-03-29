import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class Task_5 {
    public static void main(String[] args) {
        Task_4 sort = new Task_4();
        int [] aArray = {0,1,2,3,4,5,6,7,8,9};
        int [] bArray = {0,1,2,3,4,5,6,7,8,0};
        int [] cArray = {0,1,2,3,5,5,5,7,8,0};
        int [] dArray = {1,1,1,1,1,1,1,1,1,0};

        System.out.println(Arrays.toString(aArray));
        System.out.println(Arrays.toString(bArray));
        System.out.println(Arrays.toString(cArray));
        System.out.println(Arrays.toString(dArray));
    }
}
