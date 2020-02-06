public class MaximumToysSolution {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int remainingCash = k;
        int index = 0;
        int numToys = 0;
        quickSort(prices, 0, prices.length-1);
        while(remainingCash >= prices[index] && index < prices.length){
            remainingCash -= prices[index];
            numToys += 1;
            index += 1;
        }
        return numToys;

    }

    static void quickSort(int[] arr, int start, int end){
        if (start <end){
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot, end);
        }
        return;
    }

    static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start;
        int temp;
        for (int j= start; j<end; j++){
            if (arr[j] <= pivot){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i += 1;
            }
        }
        temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1,12,5,111,200,1000,10};
        System.out.println(maximumToys(prices, 50));
    }
}