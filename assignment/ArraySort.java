//Sort Array in Java

import java.util.Arrays;
import java.util.Scanner;

class ArraySort {
	public static void main(String args[])
	{
		// int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of element : ");
       int n = sc.nextInt();   

       int arr[] = new int[n];
       System.out.println("Enter Elenemt: ");
       for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
       }

		System.out.println("The original array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
