//write a java programme to print ascii value of given character
import java.util.Scanner;

class AsciChar{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        //Enter Character
        System.out.println("Enter Character: ");
        char ch = sc.next().charAt(0);

        int ascii = ch;
        //You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The Ascii value of "+ch+" is : "+ascii);
        System.out.println("The Ascii value of "+ch+" is : "+castAscii);

    }
}