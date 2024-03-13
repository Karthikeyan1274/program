import java.util.Scanner;

public class consecutive {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=1;
        int m=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]-1){
                count++;
            }else{
                count=0;
            }
            m = Math.max(m,count);
        }
        System.out.println(m);
    }
}


/*class Solution {
    
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        
        int last=nums[0],size=0,max=1;
        for(int i=1;i<nums.length;i++){
            if(last+1==nums[i]){
                
                size++;
            }
             else if(last==nums[i]){
                 continue;
             }
            else{
                max=Math.max(max,size+1);
                size=0;
            }
                last=nums[i];
        } 
        return Math.max(max,size+1);
    }
} */