import java.util.Scanner;
public class binary{
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key value (1 - 10): ");

        int key = sc.nextInt();
        sc.close();
        
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int n = nums.length;
        int left = 0; 
        int right = n -1;

        while (left < right) {
            int mid = left  - (left - right) / 2;

            if(nums[mid] ==  key){
                System.out.println("The key is present at index : " + mid);
                break;
            }else if(nums[mid] < key){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }

        

    }
}