package com.company;

public class Main {

    public static void main(String[] args) {
	int x = 42;
	int y = 15;

	int z = 2;
	int w = (x << z);
	int k = (y << z);
	int l = (x >> z);
	int o = (y >> z);

        System.out.println(~x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(~x));
        // 101010
        // 11111111111111111111111111010101

        System.out.println(~y);
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(~y));
        // 1111
        // 11111111111111111111111111110000

        System.out.println(x&y);
        System.out.println(Integer.toBinaryString(x&y));
        // 1010

        System.out.println(x^y);
        System.out.println(Integer.toBinaryString(x^y));
        // 100101

        System.out.println(x|y);
        System.out.println(Integer.toBinaryString(x|y));
        // 101111

        System.out.println(w);
        System.out.println(Integer.toBinaryString(w));
        // 10101000

        System.out.println(k);
        System.out.println(Integer.toBinaryString(k));
        // 111100

        System.out.println(l);
        System.out.println(Integer.toBinaryString(l));
        // 1010

        System.out.println(o);
        System.out.println(Integer.toBinaryString(o));
        // 11
    }
}
