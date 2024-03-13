import java.util.Scanner;

public class palindrome {
      public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 =  sc.next();
            StringBuilder sb= new StringBuilder(s1);
           String n= sb.reverse().toString();
            
            if(n.equals(s1)){
                System.out.println(" Palindromee");
            }else{
                System.out.println(" NotPalindrome");
            }

}
}

// public class Solution {
//     public int isPalindrome(String A) {
//         A=A.replaceAll("[^A-z0-9]","");
//         A=A.toLowerCase();
//         StringBuilder sb = new StringBuilder(A);
//        String n= sb.reverse().toString();
//        if(n.equals(A)){
//           return 1;      
//        }else{
//            return 0;
//        }
//     }
// }
