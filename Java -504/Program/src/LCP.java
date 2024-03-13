import java.util.*;
public class LCP {
    public static String Lcp(String[] strs){
        if(strs.length==0){
            return "";
        }
        int plen =0;
        while(true){
            if(plen<strs[0].length()){
                boolean alltrue = true;
                char ch = strs[0].charAt(plen);
                for(int i=1;i<strs.length;i++){
                     if(plen<strs[i].length() && strs[i].charAt(plen)==ch){
                        continue;
                     }
                     else{
                        alltrue= false;
                        break;
                     }
                }
                if(alltrue){
                    plen++;
                }
                else{
                    break;
                }
            }else{
                break;
            }
        }
        return strs[0].substring(0,plen);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for(int i=0;i<n;i++){
            strs[i] = sc.next();
        }
        String perfix = Lcp(strs);
        System.out.println("The longest common  prefix is : "+perfix);
    }
}
