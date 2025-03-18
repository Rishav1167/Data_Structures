package Sorting_Algorithms;

import java.util.Scanner;

public class SortStudentAge_CountingSort {
    public static StudentAge[] countSort(StudentAge[] inputArray, int max) {
        int N = inputArray.length;
        int[] countArray = new int[max + 1];
        StudentAge[] outputArray = new StudentAge[N];

        // Count occurrences of each age
        for (int i = 0; i < N; i++) {
            countArray[inputArray[i].age]++;
        }

        for (int i = 1; i <= max; i++) {
            countArray[i] += countArray[i - 1];
        }

        for (int i = N - 1; i >= 0; i--) {
            int age = inputArray[i].age;
            outputArray[countArray[age] - 1] = inputArray[i];
            countArray[age]--;
        }

        return outputArray;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        StudentAge[] studentAge=new StudentAge[n];
        int max=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter Student Information : ");
            String student= sc.next();
            //sc.nextLine();
            int age=sc.nextInt();
            max=Math.max(max,age);
            studentAge[i]=new StudentAge(student,age);
        }
        StudentAge[] ageArray=countSort(studentAge,max);

        for(StudentAge stu:ageArray){
            System.out.println(stu);
        }
    }
}
class StudentAge {
    String student;
    int age;

    public StudentAge(String student, int age) {
        this.student = student;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student = " + student  +" : "+
                "Age = " + age;
    }
}