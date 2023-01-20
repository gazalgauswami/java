//Do some of each singale integer of whole number
//eg. input: 25 output=7

import java.util.Scanner;
class SumOfInt{
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number:  ");
    int n = sc.nextInt();

    int digist , sum = 0;

    while(n>0){
        digist= n%10;
        sum= sum+digist;
        n=n/10;
    }
    //print sum
    System.out.println("The Sum is: "+sum);
}
}


