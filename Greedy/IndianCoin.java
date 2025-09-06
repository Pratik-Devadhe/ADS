/*
 Coin Change (Minimum Coins)
Statement: Make value V with minimum coins.
Input coins] = (1, 2, 5, 10, 20}, V = 43
Output Coins used: 20 20 2 1

 */
import java.util.ArrayList;
import java.util.Arrays;

public class IndianCoin {
    public static void main(String args[]){
        
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

        int value = 900;

        findChange(coins , value);

    }


    
    public static void findChange(int[] coins , int value){

        int n = coins.length;

        ArrayList<Integer> usedcoins = new ArrayList<>();

        Arrays.sort(coins);
       

        for(int i = n -1 ; i >=0; i--){

            while(coins[i] <= value){
                usedcoins.add(coins[i]);
                value -= coins[i];
            }
            
        }

        System.out.println(usedcoins);
        
    }
}

