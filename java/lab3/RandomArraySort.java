package lab3;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySort {
    public static void main(String[] args) {
        int size = 10;
        System.out.println("=== Генерация с помощью Math.random() ===");
        float[] array1 = generateWithMathRandom(size);
        System.out.println("Исходный массив: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Отсортированный массив: " + Arrays.toString(array1));
        System.out.println("\n=== Генерация с помощью класса Random ===");
        float[] array2 = generateWithRandomClass(size);
        System.out.println("Исходный массив: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Отсортированный массив: " + Arrays.toString(array2));
    }

    public static float[] generateWithMathRandom(int size) {
        float[] array = new float[size];
        for (int i = 0; i < size; i++) {
            array[i] = (float)(Math.random());
        }
        return array;
    }

    public static float[] generateWithRandomClass(int size) {
        float[] array = new float[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextFloat();
        }
        return array;
    }
}