public class CountSwaps{
    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int firstElement = 0;
        int lastElement = 0;
        int numSwaps = 0;
        int temp =0;
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j < a.length-1; j++){
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numSwaps += 1;
                } 
            }
        }

        firstElement = a[0];
        lastElement = a[a.length-1];

        System.out.printf("Array is sorted in %d swaps.%nFirst Element: %d%nLast Element: %d", numSwaps, firstElement, lastElement);
        
    }
    public static void main(String[] args) {
        countSwaps(new int[]{3,2,1});
        countSwaps(new int[]{6,4,1,5,9});
    }
}
    