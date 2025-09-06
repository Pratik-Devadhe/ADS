/*
Implement a problem of activity selection problem with K persons.

Statement: Given two arrays S[] and E[] of size N denoting starting and closing time of the shops and an integer value K denoting the number of people, the task is to find out the maximum number of shops they can visit in total if they visit each shop optimally based on the following conditions:

• A shop can be visited by only one person

• A person cannot visit another shop if its timing collide with it Input: S[]= {1, 8, 3, 2, 6), E[]= (5, 10, 6, 5, 9), K = 2 Output: 4

Input: S[] = {1, 2, 3), E[] = (3, 4, 5), K=2

Output: 3
 */
import java.util.Arrays;
public class activityselction {

    public static int selection(int[][] mat , int n , int k){

        int count = 0;
        int lastend = mat[0][2];
        mat[0][0] = 1;
        count++;
            for(int i = 1; i < n; i++){
                    
                if(lastend <= mat[i][1] && mat[i][0] == 0)  {
                    count++;
                    mat[i][0] = 1;
                    lastend = mat[i][2];
                }
                
            }

             for(int i = 0; i < n; i++){

                for(int j = 0; j  < n ; j++){

                    System.out.print(mat[i][j] + " ");
                }

            System.out.println();
        }
            

        return count;
    }
    
    public static void main(String s[]){

        int[] a = { 1 , 2 , 3};
        int[] e = {3 , 4 , 5};

        int n = a.length;

        int[][] mat = new int[n][3];

        for(int i= 0; i < n; i++){
            mat[i][0] = 0;
            mat[i][1] = a[i];
            mat[i][2] = e[i];
        }

        Arrays.sort(mat, (x, y) -> Integer.compare(x[2], y[2]));

        System.out.println(selection(mat , n , 2));   
        
        // for(int i = 0; i < n; i++){
        //     for(int j =0; j  <3 ; j++){
        //         System.out.print(mat[i][j] + " ");
        //     }
        //     System.out.println();
        // }

    }
}
