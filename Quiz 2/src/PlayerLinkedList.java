public class PlayerLinkedList
{
    private PlayerNode head;
    private int size;

    public void addtoFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }
    public Player removeFromFront()
    {
        if (head == null)
        {
            return null;
        }

        Player removed = head.getPlayer();
        head = head.getNextPlayer();
        size--; // update size
        return removed;
    }
    public int  getSize()
    {
        return size;
    }
    public boolean contains(Player player)
    {
        PlayerNode current = head;
        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }
    public int indexOf(Player player)
    {
        PlayerNode current = head;
        int index = 0;
        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }
        return -1;
    }
    public void printList()
    {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

}
