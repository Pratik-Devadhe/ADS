import java.util.ArrayList;
public class noOfZero {

     public static int findZero( ArrayList<Integer> nums , int st , int end){
            
            while(st <= end){
                int mid = (st + end) /2;

                if(nums.get(mid) == 0 && nums.get(mid -1) == 1){
                    return mid;
                }
                else if(nums.get(mid) == 0){
                    end = mid -1;
                }else{
                    st = mid + 1;
                }
            }

            return 0;

        }
    public static void main(String s[]){

       
        
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(0);
        nums.add(0);
        nums.add(0);
        nums.add(0);
        nums.add(0);
        nums.add(0);
        nums.add(0);
        nums.add(0);
        nums.add(0);
        nums.add(0);
       
        int n = nums.size();

        int firstZeroPosition = findZero(nums , 0 , n-1);

        int ans = n - firstZeroPosition;

        System.err.println("the no of zeros are :"+ ans);

      //  System.err.println("the no of zeros are :"+ firstZeroPosition);
    }
}
