//take user input of empolyee details and show in proper formate
import java.util.Scanner;

class Employee {
    int id;
    String name;
    float sal;

}

class EmpDetail {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many employee:");
        int k = sc.nextInt();

        Employee emp[] = new Employee[k];

        for (int i = 0; i < k; i++) {
            emp[i] = new Employee();

            System.out.println("Enter " + (i + 1) + " Employee data :");

            System.out.print("Enter employee id :");
            emp[i].id = sc.nextInt();
            System.out.print("Enter employee name :");
            emp[i].name = sc.next();
            System.out.print("Enter employee salary :");
            emp[i].sal = sc.nextFloat();

        }

        System.out.println("\n\n============ All employee details are :============\n");

        for (int i = 0; i < k; i++) {
            System.out.println("Employee id :" + emp[i].id + " || Employee Name:  " + emp[i].name + " || Employee Salary:  " + emp[i].sal);

        }
    }

}