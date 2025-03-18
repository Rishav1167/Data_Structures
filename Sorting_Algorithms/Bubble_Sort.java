package Sorting_Algorithms;

import java.util.Scanner;

public class Bubble_Sort {
    public static void bubbleSort(Student[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].marks > arr[j + 1].marks) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] arr = new Student[n];

        // Taking input dynamically
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name, student_id, and marks: ");
            String name = sc.next();
            int student_id = sc.nextInt();
            int marks = sc.nextInt();
            arr[i] = new Student(name, student_id, marks);
        }

        bubbleSort(arr);

        // Print sorted array
        System.out.println("\nSorted Students by Marks:");
        for (Student student : arr) {
            System.out.println(student);
        }

        sc.close();
    }
}

class Student {
    String name;
    int student_id;
    int marks;

    public Student(String name, int student_id, int marks) {
        this.name = name;
        this.student_id = student_id;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return  " Student name=" + name + ", student_id=" + student_id + ", marks=" + marks  ;
    }
}
