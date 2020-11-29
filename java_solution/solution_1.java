import java.util.ArrayList;

//plan
// * for each array set, add the passengers goin in and subtract the passengers going out
// a variable is needed to store the passenger count


public class solution_1 {
    public static int countPassengers(ArrayList<int[]> stops){
        int count = 0;
        // for each stop array in stops
        for (int[] stop : stops) {
            count += stop[0];
            count -= stop[1];
        }
        return count;
    }
    public static void main(String[] args){
    //    test cases
//     ArrayList<int[]> Stops1 = new ArrayList<int[]>();
//        Stops1.add(new int[]{5,0} );
//        Stops1.add(new int[]{5,3} );
//        Stops1.add(new int[]{6,2} );

// ArrayList<int[]> Stops2 = new ArrayList<int[]>();
//        Stops2.add(new int[]{5,0} );
//        Stops2.add(new int[]{7,4} );
//        Stops2.add(new int[]{6,5} );
//        Stops2.add(new int[]{6,3} );
       
ArrayList<int[]> Stops3 = new ArrayList<int[]>();
       Stops3.add(new int[]{4,0} );
       Stops3.add(new int[]{7,3} );
       Stops3.add(new int[]{5,3} );
       Stops3.add(new int[]{4,2} );


        //method call
        System.out.println(countPassengers(Stops3));


        //test different cases (or routes,lol... makes better sense, too lazy to refactor. Why don't you fork this repo and edit it out :wink:)
        //uncomment the case you want to try 
        //use the same case in the method call 
        // or just make your own case ...
    }
}