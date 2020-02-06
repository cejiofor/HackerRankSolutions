import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalanceSolution {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        // Spilt 2D array into list for important and unimportant(basic) contests
        List<Integer> importantContest = new ArrayList<>();
        List<Integer> basicContest = new ArrayList<>();
        int luckBalance = 0;
        for(int i = 0; i<contests.length; i++){
            if (contests[i][1] == 1){
                importantContest.add(contests[i][0]);
            }
            else{
                basicContest.add(contests[i][0]);
            }
        }

        //Sort important contest list in descending order
        Collections.sort(importantContest, Collections.reverseOrder());
        // In decensind order, lose the highest value gmaes first, up to k times. Remove from list as contest is lost
        for (int i=0; i<k; i++){
            if (importantContest.size() > 0){
                luckBalance += importantContest.get(0);
                importantContest.remove(0);
            }
        }

        // Sum values in basic contests and add to luck balance
        luckBalance += basicContest.stream().reduce(0, (a,b) -> a+b);

        // Sum remaining important contests that are one, remove sum value from luck balance 
        luckBalance -= importantContest.stream().reduce(0, (a,b) -> a+b);
        return luckBalance;
    }

    public static void main(String[] args) {
        int test = luckBalance(5, new int[][] {{5,0},{2,0},{1,0},{8,0},{10,0},{5,0}});
        System.out.println(test);
    }
}