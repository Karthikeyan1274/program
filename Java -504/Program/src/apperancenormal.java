import java.util.Scanner;

public class apperancenormal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=0;i<n;i++){
        if(arr[i]>largest){
             
        }
    }    
        int hashTable[]= new int [largest + 1];
        for(int x: arr){
            hashTable[x]++;
        }
        for(int x: arr){
        if(hashTable[x]==1){
            System.out.println(x);
        }
    }
    }
    }

