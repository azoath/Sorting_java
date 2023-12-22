import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 3, 1 };
        System.out.println(Arrays.toString(bubble_Sort(arr)));
    }

    static int[] bubble_Sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
