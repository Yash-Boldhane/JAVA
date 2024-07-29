package Array;

import java.util.Scanner;

public class Arr8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        int count = 0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }

        System.out.println("Number of odd elements: " + count);


    }
}
