package lab3;

import java.util.Arrays;
import java.util.Random;

public class Growing {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(90); // 90 = 99 - 10 + 1
        }
        System.out.println("Массив: " + Arrays.toString(array));
        boolean isIncreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}