import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayQueue queue = new ArrayQueue(5);

        int totalPlayersCreated = 0;
        int gamesCompleted = 0;

        System.out.println("MATCHMAKING SYSTEM");;
        System.out.println("Press ENTER each turn to continue.\n");

        while (gamesCompleted < 10)
        {
            scanner.nextLine();
            int playersJoining = random.nextInt(7) + 1;
            System.out.println(playersJoining + " players joined the matchmaking queue!");

            for (int i = 0; i < playersJoining; i++)
            {
                totalPlayersCreated++;
                Player p = new Player(totalPlayersCreated, "Player" + totalPlayersCreated, random.nextInt(100) + 1);
                queue.add(p);
            }
            System.out.println("\nCurrent Queue (" + queue.size() + " players):");
            queue.printQueue();
            if (queue.size() >= 5)
            {
                System.out.println("\nMATCH FOUND!");

                for (int i = 0; i < 5; i++)
                {
                    Player matched = queue.remove();
                    System.out.println(" - " + matched);
                }

                gamesCompleted++;
                System.out.println("Game #" + gamesCompleted + " has started!");
            }

            System.out.println("\nRemaining players in queue: " + queue.size());
        }
        System.out.println("\n10 games have been successfully created!");
    }
}
