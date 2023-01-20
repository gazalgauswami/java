//write a java programme to find large number between first to last element of array

import java.util.Scanner;

public class LargeArray{  
public static int getLargest(int[] a, int total){  
int temp;  
//loop 
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-1];  
}  
public static void main(String args[]){  
Scanner sc = new Scanner(System.in);

int a[] = new int[3];

//Take user input element of array
System.out.println("Entter element: ");

for(int i=0;i<3;i++){
    a[i]= sc.nextInt();
}
 

System.out.println("Largest : "+getLargest(a,3));
}}  