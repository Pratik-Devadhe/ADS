/* Given the array of integers move all the zeros to end of the array */

import java.util.ArrayList;

public class moveAllZeros {

    public static void moveAllZero(ArrayList<Integer> nums , int nonZeroIndex){

        for(int num : nums){
            if(num != 0){
                nums.set(nonZeroIndex++ , num);
            }
        }


        while(nonZeroIndex < nums.size()){
            nums.set(nonZeroIndex++ , 0);
        }
    }

    public static void main(String s[]){
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(32);
        nums.add(0);
        nums.add(38);
        nums.add(40);
        nums.add(0);
        nums.add(34);
        nums.add(0);
        nums.add(0);
        nums.add(62);

        moveAllZero(nums , 0);

        System.out.println("Aray with All Zeros are moved to last :" + nums);
    }
    
}
