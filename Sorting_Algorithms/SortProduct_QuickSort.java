package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SortProduct_QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product details: ");
            String name = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            products[i] = new Product(name, price);
        }

        quickSort(products, 0, n - 1);

        System.out.println("\nSorted Products by Price:");
        for (Product p : products) {
            System.out.println(p.product + " - " + p.price);
        }
    }

    public static void quickSort(Product[] products, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(products, low, high);
            quickSort(products, low, pivotIndex - 1);
            quickSort(products, pivotIndex + 1, high);
        }
    }

    private static int partition(Product[] products, int low, int high) {
        int pivot = products[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (products[j].price < pivot) {
                i++;
                swap(products, i, j);
            }
        }
        swap(products, i + 1, high);
        return i + 1;
    }

    private static void swap(Product[] products, int i, int j) {
        Product temp = products[i];
        products[i] = products[j];
        products[j] = temp;
    }
}

class Product {
    String product;
    int price;

    public Product(String product, int price) {
        this.product = product;
        this.price = price;
    }
}
