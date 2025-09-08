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


import java.util.ArrayList;

public class Subset {
    public static void main(String args[]){

        int nums[] = {1 , 2 , 3};

        int sum = 7;

        ArrayList< ArrayList<Integer>> ans = new ArrayList<>();

        findSubset(nums , new ArrayList<>() , ans , 0);

        System.out.println(isSum(ans , sum));
 
    }

    public static boolean isSum(ArrayList<ArrayList<Integer>> ans , int sum){

        
        int n = ans.size();


        for(int i = 0; i < n; i++){
            int currsum = 0;
            for(int j = 0; j < ans.get(i).size(); j++){
                currsum += ans.get(i).get(j);
            }

            if(currsum == sum){
                return true;
            }
        }   

        return false;
    }

    public static void findSubset(int[] nums ,  ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> ans , int i){
        if(i == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        //work include
        curr.add(nums[i]);
        findSubset(nums, curr, ans, i+1);

        //backtrack

        curr.remove(curr.size() - 1);
        findSubset(nums, curr, ans, i+1);
        
    }
}
