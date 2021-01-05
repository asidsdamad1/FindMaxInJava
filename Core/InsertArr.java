package Core;

import java.util.Scanner;

public class InsertArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =  {2, 5, 5, 7, -2 , 6, 8, 0};
        System.out.println("Property list: ");
        printArray(arr);
        System.out.print("\nNhập vào giá trị cần chèn: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí chèn: ");
        int index = sc.nextInt();
        printArray(insertElement(arr, x, index));
    }

    public static void printArray(int array[]) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] insertElement(int oldArray[], int element, int index) {
        int length = oldArray.length;
        int newArray[] = new int[length+1];
        System.arraycopy(oldArray, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(oldArray, index, newArray, index+1, length-index);
        return newArray;
    }
}
