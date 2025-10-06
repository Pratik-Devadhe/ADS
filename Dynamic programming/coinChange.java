/*
 you are given infinite no. of coins ,  find the no. of ways to add it upto sum you can use any combination of coins
   
 */


public class coinChange {
    public static void main(String s[]){
        int sum = 5;

        int nums[] = {1 , 2 , 5};

        System.out.println(countWays1(sum , nums));
        // System.out.println(countWays(sum , nums));
    }

    // public static int countWays(int sum , int nums[]) {

    //     int n = nums.length;

    //     // initalize the dp to store the no. of ways for sum;
    //     int dp[] = new int[sum + 1];

    //     dp[0] = 1;  // if sum == 0; no. of ways = 1;



    //     for(int i = 0; i < n; i++){
            
    //         int coin = nums[i];    
    //          // add the current coin to each sums that uses this coin
        
    //         for(int j = coin; j <= sum; j++){
    //             dp[j] += dp[j - coin];  
    //         }

    //     }

    //     return dp[sum];
    // }

    public static int countWays1(int sum , int coins[]) {
        
        int n = coins.length;

        int dp[][] =  new int[n+1][sum+1];

        // if the sum is 0 no. of ways =1;

        for(int i =0; i <= n; i++){
            dp[i][0] = 1;

        }

        // for the remainging one

        for(int i =1; i <= n; i++){

            for(int j= 1; j<= sum; j++){

                if(j >= coins[i-1]){
                    dp[i][j] = dp[i][j - coins[i-1]] + dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }

            }
        }

        return dp[n][sum];

    }
}
