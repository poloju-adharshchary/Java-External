//1\. Write a java program to print the sum of all elements of an array.

import java.util.*;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        System.out.println("Sum of all array elements: " + sum);
    }
}