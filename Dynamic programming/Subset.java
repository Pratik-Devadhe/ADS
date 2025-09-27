/*
 Implement Subset Sum Problem. 
Statement Given a set of non-negative integers and a 
value sum, the task is to check if there is a subset of the 
given set whose sum is equal to the given sum.  
Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9          
Output: True 
Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 30        
Output: False 

 */


public class Subset {
    public static void main(String args[]){

        int nums[] = {3 , 34 , 4 , 12 , 5 , 2};
        int n = nums.length;
        int sum = 13;

        
        boolean dp[][] = new boolean[n + 1][sum + 1];

        for(int i = 0; i <= n; i++){            // if sum is 0 then we can have the empty subset for any set so , and is True;
            dp[i][0] = true;
        }

        // second condition is to when item are 0 then we can't achive the sum so for item = 0 we have false value( in java all value are default false)

      findSum(nums , sum , dp);

        System.out.println(dp[n][sum]);
 
    }

   

    public static void findSum(int[] nums  , int sum , boolean[][] dp){
        
        int n = nums.length;
        
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= sum; j++){

                int v = nums[i-1];

                if(j >=  v && dp[i-1][j - v] == true) {
                    dp[i][j] = true;

                }

                if(dp[i-1][j] == true)  {
                    dp[i][j] = true;
                }

            }

        }

       
    }
}
