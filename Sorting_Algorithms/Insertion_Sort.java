package Sorting_Algorithms;

import java.util.Scanner;

public class Insertion_Sort {
    public static void insertionSort(Employee[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Employee key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].emp_Id > key.emp_Id) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee[] arr = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name, Id, and Role: ");
            String name = sc.next();
            int Id = sc.nextInt();
            String role = sc.nextLine();
            arr[i] = new Employee(name, Id , role);
        }

        insertionSort(arr);


       for(Employee emp:arr){
           System.out.println(emp);
       }
    }
}
class Employee{
    String employee;
    int emp_Id;
    String role;

    public Employee(String employee, int emp_Id, String role) {
        this.employee = employee;
        this.emp_Id = emp_Id;
        this.role = role;
    }

    @Override
    public String toString() {
        return
                "Name='" + employee + '\'' +
                ", emp_Id=" + emp_Id +
                ", role='" + role + '\''
                ;
    }
}