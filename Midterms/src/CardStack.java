import java.util.LinkedList;

public class CardStack
{
    private LinkedList<Card> stack;

    public CardStack()
    {
        stack = new LinkedList<>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public Card pop()
    {
        if (!stack.isEmpty())
        {
            return stack.pop();
        }
        return null;
    }

    public Card peek()
    {
        return stack.peek();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public int size()
    {
        return stack.size();
    }

    @Override
    public String toString()
    {
        return stack.toString();
    }
}
