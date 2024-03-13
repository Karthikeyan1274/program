import java.util.Scanner;

public class biconocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int arr[] = new int[b];
        for(int i=0;i<a;i++){
                if(i==a-1){
                        arr[i]=1;
                }else{
                    arr[i]=0;
                }
        }      
        for(int i=a;i<b;i++){
            for(int j=1;j<=a;j++){
                arr[i]=arr[i]+arr[i-j];
            }
        }
        for(int i=0;i<b;i++){
             System.out.println(arr[i]);
         }
    }
}

