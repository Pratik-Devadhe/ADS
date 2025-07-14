/*Implement a problem of smallest number with at 
least n trailing zeroes in factorial. 
Statement: Given a number n. The task is to find the 
smallest number whose factorial contains at least n 
trailing zeroes.  */

public class Ass3 {
    
    public static long trailingZeros(long ans){
        long count = 0;

        while(ans > 0){
            long rem = ans % 10;
            if(rem == 0){
                count++;
            }else{
               return count;
            }

            ans = ans / 10;
       }

       return 0;

    }

    public static long findAns(long n , long i , long ans){
        
        // base case 
        if(n == trailingZeros(ans)){
            return i-1;
        }

        // calculate  factorial 
        ans = ans * i;

        // recursion 
        return findAns(n , i + 1 , ans);
    }
    public static void main(String s[]){
        long  n  = 4;

        System.out.println("factorial with trailing " + n +" zeros : " + findAns(n , 1 , 2));
       
    }
}
