/* Gas Station Circuit
 * gas and cost arrays  find the statrting point to complete the circuit;
 */



public class gasStationCircuit {
    public static void main(String s[]){

        int cost[] = {3 , 4 , 5 , 1 , 2};
        int gas[] = {1 , 2, 3, 4 , 5};

        findStartPoint(cost , gas);
    }


    public static void findStartPoint(int cost[] , int gas[]){
        int totalgas = 0;
        int totalcost = 0;

        int index = 0;
        int n = gas.length;
        int path = 0;

        for(int i = 0; i < n; i++){

            path += (gas[i] - cost[i]);

            if(path < 0){
                index = i + 1;
                path = 0;
            }
            totalcost += cost[i];
            totalgas += gas[i];
        }


        if(totalcost > totalgas) {
            System.out.println(-1);
        }
        else{
            System.out.println(index);
        }
            
    } 
}
