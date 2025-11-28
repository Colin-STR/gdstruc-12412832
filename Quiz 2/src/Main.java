//import java.util.ArrayList;
//import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Player asuna = new Player(1,"Asuna",100);
        Player kumar = new Player(2,"Kumar",200);
        Player bones = new Player(3,"Bones",300);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addtoFront(asuna);
        playerLinkedList.addtoFront(kumar);
        playerLinkedList.addtoFront(bones);
        playerLinkedList.printList();

//      removeFromFront() & size()
        Player removed = playerLinkedList.removeFromFront();
        System.out.println("Removed: " + removed);
        playerLinkedList.printList();
        System.out.println("Size: " + playerLinkedList.getSize());

//       indexOf()
        System.out.println("Index of Bones: " + playerLinkedList.indexOf(bones));

//        contains()
        System.out.println("Contains Kumar? " + playerLinkedList.contains(kumar));

//        List<Player> playerList = new ArrayList<>();
//
//        playerList.add(new Player(1, "Asuna", 100));
//        playerList.add(new Player(2, "Kumar", 200));
//        playerList.add(new Player(3, "Bones", 300));
//
//        System.out.println(playersList.get(1));
//        playerList.add(2, new Player(555, "Artemis", 600));
//        playersList.remove(2);
//        System.out.println(playerList.contains(new Player(2,"Kumar", 200)));
//        System.out.println(playerList.indexOf(new Player(2, "Kumar", 200)));
//
//       for (Player p : playerList)
//       {
//            System.out.println(p);
//        }
    }
}
