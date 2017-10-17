package Lesson3;

import java.util.Scanner;

public class Script {

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите строку, которую следует зашифровать");
        String str = scr.nextLine();
        System.out.println("Введите ключ");
        String key = scr.nextLine();
        String answer = scripting(str, key);
        System.out.println(answer);

        answer = scripting(answer, key);
        System.out.println(answer);

        byte a1 = 123;
        byte a32 = 12;

        a1 = (byte)(a1 ^ a32);
    }

    public static String scripting(String a, String b){
        byte[] abyte = a.getBytes();
        byte[] bbyte = b.getBytes();
        //byte[] cbyte = new byte[a.length()];


        int k = 0;
        for (int i = 0; i < a.length(); i++){
//            k %= b.length();
            abyte[i] ^= bbyte[i % b.length()];
        }
        return new String(abyte);
    }


}
