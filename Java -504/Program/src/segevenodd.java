import java.util.*;

public class Segevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Separate even and odd numbers
        int[] arr2 = new int[n];
        int indexEven = 0;

        int[] arr3 = new int[n];
        int indexOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[indexEven] = arr[i];
                indexEven++;
            } else {
                arr3[indexOdd] = arr[i];
                indexOdd++;
            }
        }
      Arrays.sort(arr2,0,indexEven);
      Arrays.sort(arr3,0,indexOdd);
        // Combine even and odd numbers in the desired order
        int[] arr4 = new int[n];
        for (int i = 0; i < indexEven; i++) {
            arr4[i] = arr2[i];
        }

        for (int i = 0; i < indexOdd; i++) {
            arr4[indexEven + i] = arr3[i];
        }

        // Print the combined array
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
    }
}
