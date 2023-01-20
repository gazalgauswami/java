//add two number using function overloading
import java.util.Scanner;

class Adder{  
    //add programme of two number
    static int add(int a,int b){return a+b;}  
    //add programme of three number
    static double add(double a,double b){return a+b;}  
}  
class SumOverLoading    {  
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        

        //call add function
        System.out.println("Sum Of Two Number:  "+Adder.add(a,b));  
        System.out.println("Sum Of Two Number:  "+Adder.add(a,b));  
    }
}