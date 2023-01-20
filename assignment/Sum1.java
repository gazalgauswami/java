//sum of two number
import java.util.Scanner;

class Sum1{
    public static void main(String args[]){
        int a,b,sum;
        Scanner sc = new Scanner(System.in);

        //take user input
        System.out.println("Enter First Number: ");
        a = sc.nextInt();

        //take user input
        System.out.println("Enter Second Number: ");
        b= sc.nextInt();

        sum=a+b;

        System.out.println("Sum : "+sum);
    }
}