import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7, 4}; 
        swapMinMax(array);
        System.out.println("Отриманий масив після заміни місцями найбільшого та найменшого елементів:");
        System.out.println(Arrays.toString(array));
    }

    public static void swapMinMax(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }

        int minIndex = 0;
        int maxIndex = 0;


        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            } else if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }


        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
    }
}
