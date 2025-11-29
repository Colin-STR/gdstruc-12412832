public class Main
{
    public static void main(String[] args)
    {
        Tree tree = new Tree();

        tree.insert(5);
        tree.insert(63);
        tree.insert(17);
        tree.insert(58);
        tree.insert(79);
        tree.insert(40);
        tree.insert(21);
        tree.insert(82);

//        tree.traverseInOrder();
//        System.out.println(tree.get(21));
        System.out.println("Min Node: " + tree.getMin());
        System.out.println("Max Node: " + tree.getMax());

        System.out.println("\nDescending traversal:");
        tree.traverseInOrderDescending();
    }
}