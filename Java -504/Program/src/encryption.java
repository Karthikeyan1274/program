import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] ch = s.toCharArray();
       System.out.println("String stored in char array: " + new String(ch));
        for(int i=0;i<ch.length;i++){
            char c = ch[i];
           if(c == 'a' && i%2==0){
               ch[i]='b';
           }
           else if(c == 'a' && i%2 != 0){
               ch[i] = 'z';
           }    
           else  if(c == 'z' && i%2==0){
               ch[i]='a';
           }
           else  if(c == 'z' && i%2!=0){
               ch[i]='y';
           }
           else  if(c == 'A'){
               ch[i]='Z';
           }
           else if(c == 'Z'){
               ch[i] = 'A';
           }
            else if(c == ' '){
               ch[i] = ' ';
           }
            else if(i%2==0){
                c = (char)(c+1);
                ch[i] = c;
            }
            else{
                c = (char)(c-1);
                ch[i] = c;
            }
            System.out.print(ch[i]+" ");
        }
    }
} 
