package com.company;

public class Second {
    public static void main(String[] args) {
    int x = -42;
    int y = -15;

    int z = 2;
    int w = (x << z);
    int k = (y << z);
    int l = (x >> z);
    int o = (y >> z);

        System.out.println(~x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(~x));
        // 11111111111111111111111111010110
        // 101001

        System.out.println(~y);
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(~y));
        // 11111111111111111111111111110001
        // 1110

        System.out.println(x&y);
        System.out.println(Integer.toBinaryString(x&y));
        // 11111111111111111111111111010000

        System.out.println(x^y);
        System.out.println(Integer.toBinaryString(x^y));
        // 100111

        System.out.println(x|y);
        System.out.println(Integer.toBinaryString(x|y));
        // 11111111111111111111111111110111

        System.out.println(w);
        System.out.println(Integer.toBinaryString(w));
        // 11111111111111111111111101011000

        System.out.println(k);
        System.out.println(Integer.toBinaryString(k));
        // 11111111111111111111111111000100

        System.out.println(l);
        System.out.println(Integer.toBinaryString(l));
        // 11111111111111111111111111110101

        System.out.println(o);
        System.out.println(Integer.toBinaryString(o));
        // 11111111111111111111111111111100
}
}
