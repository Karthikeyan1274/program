import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];      
            }
        }
            for(int i=0;i<n;i++){
            if(arr[i]<ssmallest && arr[i]!=smallest){
                    ssmallest=arr[i];
            }
        }
 
        System.out.println(ssmallest);
    }
}
