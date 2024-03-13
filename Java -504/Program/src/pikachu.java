import java.util.HashSet;
import java.util.*;
class pikachu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> s= new HashSet<>();
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
          s.add(arr[i]+" "+arr[j]);
            }
        }
        System.out.println(s);
        System.out.println(s.size());
    }
}