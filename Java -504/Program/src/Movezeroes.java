import java.util.*;
public class Movezeroes {
    public static void swap(int[] arr,int i,int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    public static int[] MoveZero(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
               i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }       
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr1 = MoveZero(arr);
        System.out.println("THe array is : ");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
