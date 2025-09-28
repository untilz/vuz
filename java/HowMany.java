import java.util.Scanner;

public class HowMany {
    public static void main(String[] args){
        System.out.println("Для завершения введите \"0\"\nВводите слова через ENTER:");
        Scanner scan = new Scanner(System.in);
        String word = ""; int digit = -1;
        while (!word.equals("0")){
            word = scan.nextLine();
            digit++;
        }
        System.out.println("Количество слов которое вы ввели: " + digit);
        scan.close();
    }
}
