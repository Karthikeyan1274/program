import java.util.*;
public class tzero {
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();
  int fact = 1;
  for (int i = 1; i <= n; i++) {
    fact = fact*i;
  }
  System.out.println(fact);
  int sum = 0;
  if(n < 5){
    System.out.println(0);
  }
  while(n>=5){
   sum = sum +n/5;
   n=n/5;
  }
  System.out.println(sum);
 
}
}

