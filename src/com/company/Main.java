package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {


            Scanner kb = new Scanner(System.in);
            System.out.println("what type of int are you using(o, h,b,d)? ");
            String type = kb.next();
            System.out.println("what number are you converting? ");
            String num = kb.next();
            String t2 = "";
            int x = 0;
            int j = 0;
            if (type.equals("o")) {
                x = Integer.parseInt(num, 8);
            }
            if (type.equals("h")) {
                x = Integer.parseInt(num, 16);
            }
            if (type.equals("b")) {
                x = Integer.parseInt(num, 2);
            }
            if (type.equals("d")) {
                System.out.println("what are you converting to(o,h,b)? ");
                type = kb.next();
                ++j;
                if (type.equals("o")) {
                    x = Integer.parseInt(num, 10);
                    t2 = Integer.toString(x, 8);

                }
                if (type.equals("h")) {
                    x = Integer.parseInt(num, 10);
                    t2 = Integer.toString(x, 16);

                }
                if (type.equals("b")) {
                    x = Integer.parseInt(num, 10);
                    t2 = Integer.toString(x, 2);

                }

            }
            if (j == 0) {
                System.out.println(x);
            } else {
                System.out.println(t2);
            }
        }

    }
}
