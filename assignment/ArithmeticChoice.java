import java.util.Scanner;

// Write a programme to do plus , multypli , division and substraction

class ArithmeticChoice{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter 1.Addition 2.Subsraction 3.Multiply 4.Division 5.Remainder ");
        int n = sc.nextInt();

        switch(n){
            //case for adddition
            case 1:
                System.out.println("Enter First Number: ");
                int f = sc.nextInt();
                System.out.println("Enter Second Number: ");
                int s = sc.nextInt();
                int Sum = f+s;
                System.out.println("Addition : "+Sum);
                break;
            // case for subsstraction    
            case 2:
                System.out.println("Enter First Number: ");
                 f = sc.nextInt();
                System.out.println("Enter Second Number: ");
                 s = sc.nextInt();
                int sub = f-s;
                System.out.println("Substraction: "+sub);
                break;
            //case for multiplication
            case 3:
                System.out.println("Enter First Number: ");
                 f = sc.nextInt();
                System.out.println("Enter Second Number: ");
                 s = sc.nextInt();
                int mul=f*s;
                System.out.println("Multiplication: "+mul);
                break;
            //case for division
            case 4:
                System.out.println("Enter First Number: ");
                 f = sc.nextInt();
                System.out.println("Enter Second Number: ");
                s = sc.nextInt();
                int div = f/s;
                System.out.println("Division: "+div);
                break;
            //case for reminder    
            case 5:
                System.out.println("Enter First Number: ");
                f = sc.nextInt();
                System.out.println("Enter Second Number: ");
                s = sc.nextInt();
                int rem= f%s;
                System.out.println("Reminder: "+rem);
                break;
            default:
                System.out.println("You Have Wrong Choice");             


                

        }
    }
}