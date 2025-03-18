package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SortExamScore_SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Exam[] students = new Exam[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter exam percentage: ");
            float percentage = sc.nextFloat();
            sc.nextLine();
            students[i] = new Exam(name, percentage);
        }

        selectionSort(students);

        System.out.println("\nSorted Exam Scores:");
        for (Exam student : students) {
            System.out.println(student);
        }
    }

    public static void selectionSort(Exam[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].percentage < students[minIndex].percentage) {
                    minIndex = j;
                }
            }
            swap(students, i, minIndex);
        }
    }

    private static void swap(Exam[] students, int i, int j) {
        Exam temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
}

class Exam {
    String student;
    float percentage;

    public Exam(String student, float percentage) {
        this.student = student;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student: " + student + ", Percentage: " + percentage;
    }
}
