package lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива (натуральное число больше 0): ");
        int n = scanner.nextInt();
        int[] firstArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            firstArray[i] = random.nextInt(n + 1);
        }
        System.out.println(Arrays.toString(firstArray));
        int evenCount = 0;
        for (int num : firstArray) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        if (evenCount > 0) {
            int[] secondArray = new int[evenCount];
            int index = 0;

            for (int num : firstArray) {
                if (num % 2 == 0) {
                    secondArray[index] = num;
                    index++;
                }
            }
            System.out.println("Четные элементы: " + Arrays.toString(secondArray));
        } else {
            System.out.println("В первом массиве нет четных элементов.");
        }

        scanner.close();
    }
}