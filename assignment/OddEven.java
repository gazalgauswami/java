//Odd Even number in java 
import java.util.Scanner;

class OddEven{
    public static void main(String args[]){

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        if (n%2==0)
        {
            //print 1 if number is even
            System.out.println("1");
            }
        else
        {
            //print 0 if number is odd
            System.out.println("0");}

    }
}