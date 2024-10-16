public class Stack
{
    //pointer to first node
    private Node first;

    private class Node
    {
        private String item;
        private Node next;
    }

    //returns if first is pointing to anything
    private boolean isEmpty()
    {
        return first == null;
    }

    //insert node to the front
    public void push (String item)
    {
        Node second = first;
        first = new Node();
        first.item = item;
        first.next = second;
    }

    //remove object first is pointing to and return the item stored inside
    public String pop()
    {
        String item = first.item;
        first = first.next;
        return item;
    }

    //return value stored at first pointer
    public String peek()
    {
        return first.item;
    }
}          
