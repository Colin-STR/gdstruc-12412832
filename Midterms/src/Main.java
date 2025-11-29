import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        CardStack deck = new CardStack();
        CardStack discardPile = new CardStack();
        CardStack playerHand = new CardStack();

        for (int i = 1; i <= 30; i++) {
            deck.push(new Card("Card " + i));
        }

        System.out.println("Game Start! Deck contains 30 cards.\n");

        while (!deck.isEmpty()) {
            int command = rand.nextInt(3);
            int x = rand.nextInt(5) + 1;

            switch (command) {
                case 0:
                    System.out.println("Command: DRAW " + x + " cards");
                    for (int i = 0; i < x; i++) {
                        Card drawn = deck.pop();
                        if (drawn == null) break;
                        playerHand.push(drawn);
                    }
                    break;
                case 1:
                    System.out.println("Command: DISCARD " + x + " cards");
                    for (int i = 0; i < x; i++) {
                        Card removed = playerHand.pop();
                        if (removed == null) break;
                        discardPile.push(removed);
                    }
                    break;
                case 2:
                    System.out.println("Command: GET " + x + " cards from discard pile");
                    for (int i = 0; i < x; i++) {
                        Card recovered = discardPile.pop();
                        if (recovered == null) break;
                        playerHand.push(recovered);
                    }
                    break;
            }

            System.out.println("Your Hand: ");
            playerHand.printStack();

            System.out.println("Deck: " + deck.getSize() + " cards remaining");
            System.out.println("Discard Pile: " + discardPile.getSize());
        }

        System.out.println("\nDeck is empty. GAME OVER!");
    }
}
