import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
        System.out.print("\n");
        int[] arr2 = reverseArray2(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf(arr2[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }

        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }

    public static int[] reverseArray2(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
