import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {

        int[] deck = new int[52];
        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.DIAMONDS, Suit.CLUBS};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //initialize deck of cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        //shuffle cards
        for (int i = 0; i < deck.length; i++) {

            //generate random index
            int index = new Random().nextInt(deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for (int i = 0; i < 4; i++) {
            Suit suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];

            System.out.println("card nr " + deck[i + 1] + ": " + rank + " of "
                    + suit.name().substring(0,1).concat(suit.name().substring(1).toLowerCase()));
        }
    }
}