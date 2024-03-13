import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n+1];
        int x=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
                arr[i]++;
              if(arr[i]<10){
                for(int i1=0;i1<n;i1++){
                  System.out.print(arr[i1]+" ");
                }
                x=1;
                break;
              }
              arr[i]=0;
        }
        if(x!=1){
            arr2[0]=1;
            for(int i=0;i<arr2.length;i++){
                System.out.println(arr2[i]);
            }
        }
    }
}


