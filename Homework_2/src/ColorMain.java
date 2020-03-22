import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ColorMain {


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите номер:");
        int number = in.nextInt ();

        Color Color = new Color (number);

        System.out.println(Color.getNUMBER());
        System.out.println(Color.getNAME());

    }
}
