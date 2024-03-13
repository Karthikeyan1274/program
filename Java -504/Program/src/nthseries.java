import java.util.*;
public class nthseries {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int arr[]= new int [n];
        int arr1[]= new int[100];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
         arr[i]=arr[i-1]+arr[i-2];       
        }
        int count;
        int k=0;
        for(int i=2;i<100;i++){
            count=0;
            for(int j=1;j<100;j++){
                        if(i%j==0){
                            count++;
                                
                        }
                        }
                        if(count<=2){
                            arr1[k]=i;
                            k++;
                        }
            }      
            if(n%2==0){
                    System.out.println(arr1[(n-1)/2]);
            }else{
                System.out.println(arr[(n-1)/2]);
            }
            }
    }