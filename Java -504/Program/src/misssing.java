import java.util.Scanner;

public class misssing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] =new int [N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
  int sum = (N * (N + 1)) / 2;
  int s2=0;
        for(int i=0;i<N;i++){
            s2 +=arr[i];
        }
        System.out.println(sum-s2);
}
}
