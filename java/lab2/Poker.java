package lab2;
import java.util.*;

public class Poker {
    public static String[] cards(){
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] result = new String[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                result[index] = rank + suit;
                index++;
            }
        }

        List<String> tool = Arrays.asList(result);
        Collections.shuffle(tool);
        tool.toArray(result);

        return result;
    }
    public static void main(String[] args){
        System.out.print("Введите количество игроков: ");
        Scanner scan = new Scanner(System.in);
        int players = scan.nextInt();
        String[] cards = cards();
        for (int i = 0; i < players; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                int cardIndex = i * 5 + j;
                if (cardIndex < cards.length) {
                    System.out.print(cards[cardIndex] + " ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}
