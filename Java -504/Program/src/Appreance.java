import java.util.Scanner;

public class Appreance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int  xor=0;
        for(int i=0;i<n;i++){
           xor= xor ^ arr[i]; 
        }
        System.out.println(xor);
    }
}
