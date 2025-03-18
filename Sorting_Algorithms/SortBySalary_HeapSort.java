package Sorting_Algorithms;

import java.util.Scanner;

public class SortBySalary_HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of applicants: ");
        int n = sc.nextInt();
        sc.nextLine();

        Applicants[] applicants = new Applicants[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter role for applicant " + (i + 1) + ": ");
            String role = sc.nextLine();
            System.out.print("Enter expected salary for applicant " + (i + 1) + ": ");
            float salary = sc.nextFloat();
            sc.nextLine();
            applicants[i] = new Applicants(role, salary);
        }

        heapSort(applicants);

        System.out.println("\nSorted Applicants by Expected Salary:");
        for (Applicants applicant : applicants) {
            System.out.println(applicant);
        }
    }

    public static void heapSort(Applicants[] arr) {
        int n = arr.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    private static void heapify(Applicants[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left].expectedSalary > arr[largest].expectedSalary) {
            largest = left;
        }

        if (right < n && arr[right].expectedSalary > arr[largest].expectedSalary) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    private static void swap(Applicants[] arr, int i, int j) {
        Applicants temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class Applicants {
    String role;
    float expectedSalary;

    public Applicants(String role, float expectedSalary) {
        this.role = role;
        this.expectedSalary = expectedSalary;
    }

    @Override
    public String toString() {
        return "Role: " + role + ", Expected Salary: " + expectedSalary;
    }
}
