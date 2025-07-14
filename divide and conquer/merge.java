import java.util.ArrayList;

public class merge {

    public static void conqour(ArrayList<Integer> nums , int st , int mid ,int end){

        int merged[] = new int[end - st + 1];

        int idx1 = st;
        int idx2 = mid + 1;

        int x = 0;

        while(idx1  <= mid && idx2 <= end){

            if(nums.get(idx1) <= nums.get(idx2)){
                merged[x++] = nums.get(idx1++);
            }else{
                merged[x++] = nums.get(idx2++); 
            }
        }

        while(idx1 <= mid){
            merged[x++]= nums.get(idx1++);
        }

        while(idx2 <= end){
            merged[x++]= nums.get(idx2++);
        }

        for (int i = 0; i < merged.length; i++) {
            nums.set(st + i, merged[i]);
        }

   
}

    public static void divide(ArrayList<Integer> nums , int st  , int end){
        if(st>= end){
            return;
        }

        int mid = st + (end - st) /2;

        divide(nums, st, mid);
        divide(nums , mid +1 , end);
        conqour(nums , st , mid ,end);
    }

    public static void main(String s[]){
        // array to be sorted;

       ArrayList<Integer>  nums = new ArrayList<>();

       nums.add(40);
       nums.add(27);
       nums.add(35);
       nums.add(62);
       nums.add(69);
       nums.add(38);
       nums.add(32);
       nums.add(34);

       int n = nums.size();

       divide(nums , 0 , n-1);

       System.out.println("Sorted Array : " + nums);

    }
}
