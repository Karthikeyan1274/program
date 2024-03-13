import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 =  sc.next();
        String s2 = sc.next();

        s1.replaceAll(" ", "");
        s2.replaceAll(" ", "");
         s1.toLowerCase();
         s2.toLowerCase();
         char c1[]=s1.toCharArray();
         char c2[]=s2.toCharArray();
         Arrays.sort(c1);
         Arrays.sort(c2);
         if(Arrays.equals(c1,c2)){
            System.out.println("anagaram");
         }else{
            System.out.println("Not Anagram");
         }
    }
}
