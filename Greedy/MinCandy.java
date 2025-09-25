/*Candy Distrubution : 
 * 
 * 
 *  Distrubute the candy in a such way that the person having maximum score get more candy than neighbor
 */

public class MinCandy {

    public static void main(String  args[]){
        int rating[] = {1 , 0 , 2};
        int n = rating.length;

        int ans[] = new int[n];

        for(int i =0 ; i< n; i++){
            ans[i] = 1;
        }

        minCandy(rating , ans , n);

        int count = 0;

        for(int i = 0; i < n ; i++){
            count += ans[i];
        }

        System.out.println(count);
    }
    
    public static void minCandy(int rating[] , int ans[] , int n){
        
        // left to right;

        for(int i = 1; i < n; i++){
            if(rating[i] > rating[i-1]){
                ans[i] = ans[i-1] +1;
            }
        }

        // right to left

        for(int i = n-2; i>= 0; i--){
            if(rating[i] > rating[i+1]){

                ans[i] = Math.max(ans[i] , ans[i+1]+1); 

            }
        }
    }
}
