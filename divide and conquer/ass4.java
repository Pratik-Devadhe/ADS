/*
 Power Funtion compute power using recurive halving

 */

public class ass4 {

    public static long computePow(int x , int n){

        long ans = 1;

        if(n < 0){
            n = -n;
            x = 1/x;
        }

        while(n > 0){
            int rem = n % 2;

            if(rem == 1){
                ans *= x;
            }

            x *= x; 
            n /= 2;
        }
        
        return ans;
    }
    public static void main(String s[]){
        int x  = 2 , n = 10;
        System.out.println( x + "^" + n + " = " +computePow(x, n));
    }
}
