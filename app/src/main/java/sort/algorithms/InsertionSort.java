package sort.algorithms;

public class InsertionSort {

    public void sort(int[] array) {
        for (int i =0; i < array.length; i++) {
            int current = array[i];
            int j = i-1;
            while (j >=0 && array[j] >= current) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    public static void main(String[] args) {
        InsertionSort test = new InsertionSort();
        int[] array = {6,409,342,653,8694,3143,7345,4};
        test.sort(array);
    }
}
