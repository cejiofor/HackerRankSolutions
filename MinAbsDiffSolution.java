import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;

public class MinAbsDiffSolution {
    // Complete the minimumAbsoluteDifference function in the editor below. 
    // It should return an integer that represents the minimum absolute difference between any pair of elements.

    // minimumAbsoluteDifference has the following parameter(s):
    // n: an integer that represents the length of arr
    // arr: an array of integers
    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        int diff = 0;
        int minDiff = Integer.MAX_VALUE; 
        // Convert int[] to List<Integer>
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //Sort array to check differences between indexes
        Collections.sort(arrList);

        for (int i = 0; i<arrList.size()-1; i++){
            diff = Math.abs(arrList.get(i) - arrList.get(i+1));
            if (diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }



    public static void main(String[] args) {
        System.out.println(minimumAbsoluteDifference(new int[] {-59,-36,-13,1,-53,-92,-2,-96,-54,75}));
    }
}
