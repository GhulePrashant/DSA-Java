package String;

import java.util.Arrays;

public class StringIntroduction {
    public static void main(String[] args) {
        String a = "prashant";
        String b = "prashant";

        System.out.println(a==b);   //true

        String c = new String("snehal");
        String d = new String("snehal");

        System.out.println(c==d);   //false

        System.out.printf("Pie : %.3f",Math.PI);

        System.out.printf("My name is %s and i do %s","prashant", "nothing");

        for (int i = 0; i < 26; i++) {
            System.out.println((char)('a'+i));
        }

    }
}
