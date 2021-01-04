package Core;

import java.util.Scanner;

public class JavaFindMaxInArray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) System.out.println("Size should not exceed 20");
        } while (size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Property list: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
        int max = arr[0], index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("The largest property value in the list is: " + max + " , at position " + index+1);
    }
}
