public class CardStack
{
    private cardNode top;
    private int size;

    private static class cardNode
    {
        Card card;
        cardNode next;

        cardNode(Card card)
        {
            this.card = card;
        }
    }

    public void push(Card card)
    {
        cardNode node = new cardNode(card);
        node.next = top;
        top = node;
        size++;
    }

    public Card pop()
    {
        if (top == null) return null;

        Card removed = top.card;
        top = top.next;
        size--;
        return removed;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public int getSize()
    {
        return size;
    }

    public void printStack()
    {
        cardNode current = top;
        while (current != null)
        {
            System.out.print(current.card + " | ");
            current = current.next;
        }
        System.out.println();
    }
}
