/*    Implement a problem of maximizing Profit by trading stocks based on 
given rate per day.
  
Statement: Given an array arr[] of N positive integers which denotes 
the cost of selling and buying stock on each of the N days. The task is 
to find the maximum profit that can be earned by buying a stock on or 
selling all previously bought stocks on a particular day. 



*/ 
public class sellstock {

    public static int maximumProfit(int[] arr){

        int n = arr.length;

        int maxProfit = 0;

        for(int i = 0 ;i < n; i++){ 

            int profit = 0;

            for(int j = 0 ; j <= i; j++){

                int diff = arr[i] - arr[j];

                if(diff > 0){
                    profit += diff;
                }
            }

            maxProfit = Math.max(maxProfit , profit);
        }

        return maxProfit;
    }

    public static void main(String s[]){
        int arr[] = { 5 , 3, 2 , 6 , 4};

        System.out.println(maximumProfit(arr));

        
    }
}
