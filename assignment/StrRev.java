//Write a programe to reversr a String

import java.util.Scanner;
import java.io.*;

// class StrRev{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter String: ");
//         var str = sc.nextLine();
//         char ch;
//         String nstr=" ";

//        System.out.println("Input: "+str);

//        for(int i=0;i<str.length();i++){
//             ch=str.charAt(i);
//             nstr=ch+nstr;
//        }
//         System.out.println("Output: "+nstr);

//     }
// }

// Java program to reverse a
// string
public class StrRev
{
    public static void main(String[] args)
    {

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        var str = sc.nextLine();

        String s[] =str.split(" ");
        
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--)
        {
            ans += s[i] + " ";
        }
        System.out.println("Reversed String:");
        System.out.println(ans.substring(0,
                           ans.length() - 1));
    }
}