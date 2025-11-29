import java.util.*;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        CardStack deck = new CardStack();
        CardStack discardPile = new CardStack();
        CardStack playerHand = new CardStack();

        for (int i = 1; i <= 30; i++)
        {
            deck.push(new Card("Card " + i));
        }

        while (!deck.isEmpty())
        {
            System.out.println("\nPress ENTER for next turn:");
            scanner.nextLine();

            int action = random.nextInt(3);
            int amount = random.nextInt(5) + 1;

            switch (action)
            {
                case 0:
                    System.out.println("Command: DRAW " + amount + " cards");
                    for (int i = 0; i < amount; i++)
                    {
                        Card drawn = deck.pop();
                        if (drawn == null) break;
                        playerHand.push(drawn);
                    }
                    break;
                case 1:
                    System.out.println("Command: DISCARD " + amount + " cards");
                    for (int i = 0; i < amount; i++)
                    {
                        Card removed = playerHand.pop();
                        if (removed == null) break;
                        discardPile.push(removed);
                    }
                    break;
                case 2:
                    System.out.println("Command: GET " + amount + " cards from discard pile");
                    for (int i = 0; i < amount; i++)
                    {
                        Card recovered = discardPile.pop();
                        if (recovered == null) break;
                        playerHand.push(recovered);
                    }
                    break;

            }
            System.out.println("Your Hand: " + playerHand);
            System.out.println("Cards Remaining in Deck: " + deck.size());
            System.out.println("Cards in Discard Pile: " + discardPile.size());
        }
        System.out.println("The deck is empty.");
    }

}
