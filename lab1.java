package lab1;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        int b = 0;
        int[] arr = new int[] {5,4,515,23,62,41,67,8,3,64,63,73,457,55,73,7,2,65};
        for (int i=0; i < 18; i++) {
            b+=arr[i];
        }
        System.out.println("sum = " + b);
        System.out.println("sred = " + b/18 + "\n ---------------------------------------");
        main_1(args);
    }
    public static void  main_1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        int[] new_arr = new int[n];
        for (int i = 0; i < n; i++) {
            new_arr[i] = scanner.nextInt();
        }
        int i = 0; int sum = 0;
        int max = -10000;
        int min = 10000;
        do {
            sum += new_arr[i];
            if (new_arr[i] < min) {
                min = new_arr[i];
            }
            if (new_arr[i] > max) {
                max = new_arr[i];
            }
            i++;
        } while (i < n);
        System.out.println("Максимальное значение: " + max
                + "\nМинимальное значение: " + min
                + "\nСумма элементов массива: " + sum
                + "\n ---------------------------------------");
        main_2(args);
    }
    public static void main_2(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ":" + args[i]);
        }
        System.out.println("\n ---------------------------------------");
        main_3(args);
    }
    public static void main_3(String[] args){
        System.out.println("1");
        for (int i = 2; i <= 10; i++){
            System.out.println("1/" + i);
        }
        System.out.println("\n ---------------------------------------");
        main_4(args);
    }
    public static int factorial(int number){
        int rezult = 1;
        for (int i = 1; i <= number; i++){
            rezult *= i;
        }
        return rezult;
    }
    public static void main_4(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int num = scan.nextInt();
        System.out.println("\nФакториал заданного числа: " + factorial(num));
        scan.close();
    }
}
