package Linear_and_Binary_Search;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        HashSet<Character> seen = new HashSet<>();// HashSet does not allow duplicates so we use it to remove duplicates
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) { // checking for duplicates and then appending in sb
                seen.add(ch);
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
