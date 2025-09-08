/* given the knapsack =>  find maximize the value with weight capacity ;can tak fractions
 * 
 * N = 3 , wt = 50 , value = [60 , 100 , 120]  weight = [10 , 20 , 30];
 * 
 * we have to find the ration of value / weight to get the maximun value in knapsack then we sort in 
 * desecnding order and calculate the value untill wt != 0;
 * 
 */

import java.util.ArrayList;

 class Item{
    int value , weight;
    double ratio;

    Item(int value , int weight){
        this.value = value;
        this.weight = weight;
        this.ratio = (double)value / weight;
    }
}

public class fractionalKnapsack {
    public static void main(String args[]){

        int n = 3;

        int wt = 50;

        int value[] = {60 , 100 , 120};
        int weight[] = {10 , 20 , 30};

        calculateValue(value , weight , wt , n);
    }

    public static void calculateValue(int value[] , int weight[] , int wt , int n){
        
       
        ArrayList<Item> items = new ArrayList<>();

        for(int i =0; i < n; i++){

            items.add(new Item(value[i] , weight[i]));
        }

        items.sort((a, b) -> Double.compare(b.ratio, a.ratio));
          

        int ans = 0;


        for(Item item : items){

            if(item.weight <= wt){
                ans += item.value;
                wt -= item.weight;
            }else{
                ans += (int)item.ratio * wt;
                break;
            }

        }

        System.out.println(ans);
        
    } 
}
