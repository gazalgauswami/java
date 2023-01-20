//write a java programe to count letters.spaces,numbers and other special character of  an input String

import java.util.Scanner;

class CountStr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String: ");
        var str = sc.nextLine();

        char[] ch = str.toCharArray();
        int letters = 0;
        int spaces = 0 ;
        int number = 0;
        int other = 0;

        for(int i=0;i<str.length();i++){
            //count letters
            if(Character.isLetter(ch[i]))
            letters++;

            //count numbers
            else if(Character.isDigit(ch[i]))
            number++;

            //count spaces
            else if (Character.isSpaceChar(ch[i]))
            spaces++;

            //count others
            else
            other++;
        }
        System.out.println("Input: "+str);
        System.out.println("Letters: "+letters);
        System.out.println("Spaces: "+spaces);
        System.out.println("Number: "+number);
        System.out.println("Other: "+other);
    }
}