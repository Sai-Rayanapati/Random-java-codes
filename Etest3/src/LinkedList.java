import java.util.ArrayList;

public class LinkedList
{
    private int listCount;
    private Node head;

    Node theNode= new Node();

    public LinkedList()
    {
        head = new Node();
        listCount = 0;
    }
    public void add(int data)
    {
        if(listCount==0)
        {
            head.setData(data);
        }
        else
        {
            Node tempNode=head;

            for(int index=0;index<listCount;index++)
            {
                tempNode=theNode.getNextNode();

                Node newNode=new Node(data);
                tempNode.setNextNode(newNode);
            }
        }
        listCount++;
    }

    public void insert(int pos, int data)
    {
        if(listCount+1<=pos&&pos>0)
        {
            Node tempNode=head;
            for(int index2=0;index2<pos;index2++)
            {
                tempNode=theNode.getNextNode();
                Node temp2=tempNode.getNextNode();
                Node newNode=new Node(data,temp2);
                tempNode.setNextNode(newNode);
            }
        }
        else
            System.out.println("invalid");

    }


    public static void add(ArrayList<Integer> node, int number)
    {
        node.add(number);
    }
    public static void insert(ArrayList<Integer> node, int insertNumber, int index)
    {
        node.add(index,insertNumber);
    }
    public static int get(ArrayList<Integer> node, int index)
    {
        return node.get(index);
    }
    public static void remove(ArrayList<Integer> node, int index)
    {
        node.remove(index);
    }
    public static int size(ArrayList<Integer> node)
    {
        return node.size();
    }
}