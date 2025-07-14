public class Ass3B {

    public static int countZeros(int mid){
        int count = 0;

        while(mid > 0){

             mid = mid / 5;

            count += mid;

            
        }

        return count;
    }


    public static int getAns(int n){

        int st = 0;
        int end = n *5;

        while(st < end){
            int mid = (st + end ) / 2;

            if(countZeros(mid) < n){
                st = mid +1;
            }else{
                end = mid;
            }
        }

        return st;
    }





    public static void main(String s[]){
        
        int n = 50;

        System.out.println("Answer is : " + getAns(n));
    }
}
