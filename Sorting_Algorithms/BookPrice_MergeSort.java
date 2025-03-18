package Sorting_Algorithms;

import java.util.Scanner;

public class BookPrice_MergeSort {
    public static void mergeSort(Book[] bookstore, int left , int right){
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(bookstore, left, mid);
            mergeSort(bookstore, mid + 1, right);


            merge(bookstore, left, mid, right);
        }
    }
    public static void merge(Book[] bookstore ,int left ,int mid,int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;


        Book[] leftArr = new Book[n1];
        Book[] rightArr = new Book[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = bookstore[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = bookstore[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i].price <= rightArr[j].price) {
                bookstore[k] = leftArr[i];
                i++;
            } else {
                bookstore[k] = rightArr[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            bookstore[k] = leftArr[i];
            i++;
            k++;
        }


        while (j < n2) {
            bookstore[k] = rightArr[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        Book[] bookStore= new Book[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter book details");
            String title =sc.next();
            int price= sc.nextInt();
            String author=sc.next();
            bookStore[i]=new Book(title , price , author);
        }
        mergeSort(bookStore , 0 , n-1);
        for(Book book:bookStore){
            System.out.println(book);
        }
    }
}
class Book{
    String title;
    int price;
    String author;

    public Book(String title, int price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author ;
    }
}
