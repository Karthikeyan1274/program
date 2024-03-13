import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bitcount {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] =new int [N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int arr2[] = new int[N];
        for(int i=0;i<N;i++){
                arr2[i]= Integer.bitCount(arr[i]);
        }
        Map<Integer,Integer> m= new HashMap<>();
        for(int i=0;i<N;i++){
            m.put(arr[i],arr2[i]);
        }
      List<Integer> l= new ArrayList<>(m.keySet());
      Collections.sort(l,(a,b)->(m.get(a)-m.get(b)));
      System.out.println(l);
}
}
