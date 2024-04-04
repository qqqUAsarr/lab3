public class Main {
    // Завдання 1
    public static void swapMinMax(int[] array) {
        if (array.length < 2) {
            System.out.println("Масив повинен містити щонайменше два елементи");
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