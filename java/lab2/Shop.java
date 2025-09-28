package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args){
        List<String> assortment = new ArrayList<>(Arrays.asList(args));
        Scanner scan = new Scanner(System.in);
        int choose;

        do {
            System.out.print(
                            "╔══════════════════════════════╗\n" +
                            "║         МЕНЮ УПРАВЛЕНИЯ      ║\n" +
                            "╠══════════════════════════════╣\n" +
                            "║ 1.Задать текущий ассортимент ║\n" +
                            "║ 2.Добавить компьютер         ║\n" +
                            "║ 3.Удалить компьютер          ║\n" +
                            "║ 4.Поиск компьютера           ║\n" +
                            "║ 5.Вывод текущего ассортимента║\n" +
                            "║ 0. Выход                     ║\n" +
                            "╚══════════════════════════════╝\n" +
                            "Выберите действие: ");

            choose = scan.nextInt();
            scan.nextLine();

            switch (choose){
                case 1:
                    assortment = setAssortment(scan);
                    break;
                case 2:
                    assortment = addComputer(assortment, scan);
                    break;
                case 3:
                    assortment = removeComputer(assortment, scan);
                    break;
                case 4:
                    searchComputer(assortment, scan);
                    break;
                case 5:
                    printAssortment(assortment);
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Неверная команда");
            }
        } while (choose != 0);

        scan.close();
    }

    public static List<String> setAssortment(Scanner scan) {
        System.out.println("Для завершения введите \"0\"\nВводите названия через ENTER:");
        List<String> newAssortment = new ArrayList<>();
        String word;

        while (true){
            word = scan.nextLine();
            if (word.equals("0")) {
                break;
            }
            newAssortment.add(word);
        }
        System.out.println("Ассортимент обновлен");
        return newAssortment;
    }

    public static List<String> addComputer(List<String> assortment, Scanner scan) {
        System.out.print("Введите название компьютера: ");
        String computer = scan.nextLine();
        assortment.add(computer);
        System.out.println("Компьютер добавлен");
        return assortment;
    }

    public static List<String> removeComputer(List<String> assortment, Scanner scan) {
        System.out.print("Введите название компьютера для удаления: ");
        String computer = scan.nextLine();
        if (assortment.remove(computer)) {
            System.out.println("Компьютер удален");
        } else {
            System.out.println("Компьютер не найден");
        }
        return assortment;
    }

    public static void searchComputer(List<String> assortment, Scanner scan) {
        System.out.print("Введите название компьютера для поиска: ");
        String computer = scan.nextLine();
        int index = assortment.indexOf(computer);
        if (index != -1) {
            System.out.println("Компьютер найден. Номер в списке: " + (index + 1));
        } else {
            System.out.println("Компьютер не найден");
        }
    }

    public static void printAssortment(List<String> assortment) {
        System.out.println("Текущий ассортимент:");
        for (String computer : assortment) {
            System.out.println("- " + computer);
        }
    }
}