// write a java programme to reverse a word

import java.util.Scanner;
import java.io.*;

class RevWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        var str = sc.nextLine();
        char ch;
        String nstr=" ";

       System.out.println("Input: "+str);

       for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            nstr=ch+nstr;
       }
        System.out.println("Output: "+nstr);

    }
}