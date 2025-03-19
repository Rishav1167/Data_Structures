package Linear_and_Binary_Search;

import java.util.Scanner;

public class ReverseString_StringBuilder {

    // Approach 1: Using StringBuilder's reverse() method
    public static String reverseUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Approach 2: Using two-pointer swapping method
    public static String reverseUsingSwapping(String str) {
        StringBuilder sb = new StringBuilder(str);
        int left = 0, right = sb.length() - 1;
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        return sb.toString();
    }

    // Approach 3: Using delete and append method (Your approach)
    public static String reverseUsingDeleteAndAppend(String str) {
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        for (int i = 0; i < length; i++) {
            char lastChar = sb.charAt(sb.length() - 1); // Store last character
            sb.deleteCharAt(sb.length() - 1); // Delete last character
            sb.insert(i, lastChar); // Insert it at current position
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call different approaches
        System.out.println("Reversed using StringBuilder.reverse(): " + reverseUsingStringBuilder(input));
        System.out.println("Reversed using two-pointer swapping: " + reverseUsingSwapping(input));
        System.out.println("Reversed using delete & append: " + reverseUsingDeleteAndAppend(input));

        sc.close();
    }
}
