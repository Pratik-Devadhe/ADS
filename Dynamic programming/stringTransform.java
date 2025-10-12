/*Cheak if to possible to tranform one string ot another 
 * given two strings s1 and s2 (all letters in uppercase). cheak if it is possible to convert s1 to s2 by performing following opration :
 * 1. make some lowercase letter uppercase.
 * 2.remove all lowercase letters.
 * 
 * ex.
 * 1. s1 = daBcd s2 = ABC           output = yes;
 * 2. s2 = argaju s2 = RAJ          output = yes;
 * 
 */


public class stringTransform {   
    
    public static boolean transform(String A , String B){

        int n = A.length();
        int m = B.length();

        boolean dp[][] = new boolean[n+1][m+1];

         // if the string A is  false then we can form string B so first column is true ,
         //and is the B is empty then also we can't form it form A; so first row and column oi false;
        

        dp[0][0] = true; // empty → empty

        // Base case: delete lowercase letters to make empty s2  daBcd  => t t f t t

        for (int i = 1; i <= n; i++) {
            char c = A.charAt(i - 1);
            if (Character.isLowerCase(c))
                dp[i][0] = dp[i - 1][0];
            else
                dp[i][0] = false;
        }

         for(int i =1; i<=n; i++){
            for(int j = 1; j <= m; j++){

                char ch1 = A.charAt(i-1);
                char ch2 = B.charAt(j-1);

                if(Character.toUpperCase(ch1) == ch2){
                    // valid include + exclude we can do both 

                    dp[i][j] = dp[i-1][j-1] || (dp[i-1][j] && Character.isLowerCase(ch1));

                }else if(Character.isLowerCase(ch1)){
                    // exclude 
                    dp[i][j] = dp[i-1][j];
                }else{
                    // capital letter and doesn't  match
                    dp[i][j] = false;
                }
            }
         }

        return dp[n][m];
    }

    public static void main(String a[]){        

        // greedy approch
    
        String s1 = "daBcd";
        String s2 = "ABC";

        // int n1 = s1.length();
        // int n2 = s2.length();

        // int i = 0 , j = 0;

        // while(i < n1 && j < n2){

        //     if( Character.toUpperCase(s1.charAt(i)) == s2.charAt(j)) {
        //         i++;
        //         j++;
        //     }else if(Character.isLowerCase(s1.charAt(i)) ){
        //         i++;
        //     }else{
        //         break;
        //     }

        // }

        // if(j == n2){
        //     System.out.println("YES");
        // }else{
        //     System.out.println("No");
        // }

        System.out.println(transform(s1 , s2));
    }

    
}
