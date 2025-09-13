
/* Maximum Number of tasks Done 
 * 
 * Do the maximun tasks with durations a[i] in total time t;
 * 
 * a[] = {4 , 3 , 2 , 1}; t = 7; ans = 3;
 * 
 * my approch =>  sort the array in asending order and count the tasks less than time reduce time by a[i]. until arr get finished or time < a[i]
 */
import java.util.Arrays;

public class MaximunTask {

    
    public static void main(String args[]){
            int arr[] = {8,10};

            int n = arr.length;

            System.out.println(tasks(arr , n , 100));
    }

    public static int tasks(int nums[] , int n , int  t){

        Arrays.sort(nums);
        int count = 0;
        int i = 0;

       while(i < n && t >= nums[i]){
            t -= nums[i];
            i++;
            count++;
     
       }

        return count;
    }
}
 