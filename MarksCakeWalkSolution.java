import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MarksCakeWalkSolution {

    // Complete the marcsCakewalk function below.
    static long marcsCakewalk(int[] calorie) {
        //Convert to list of integers to apply Colletions.sort() method
        List<Integer> calorieList = Arrays.stream(calorie).boxed().collect(Collectors.toList());
        // Sort in reverse order, to get min miles apply smallet power to largest calorie count
        Collections.sort(calorieList, Collections.reverseOrder());
        long milesWalked = 0;
        int cupcakeNum = 0;
        for (Integer num: calorieList){
            milesWalked += num* (long) Math.pow(2, cupcakeNum);
            cupcakeNum += 1;
        }
        return milesWalked;
    }
    public static void main(String[] args) {
        System.out.println(marcsCakewalk(new int[]{7,4,9,6}));
    }
}
