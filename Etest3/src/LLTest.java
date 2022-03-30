import java.util.ArrayList;

public class LLTest {
    public static void main(String[] args)
    {
        ArrayList<Integer> node=new ArrayList<Integer>();
        LinkedList list= new LinkedList();
        System.out.println("Adding numbers from 1 to 5 to the list");
        for(int index=0;index<5;index++)
        {
            list.add(node,index+1);
            System.out.println("The list: "+node);
        }
        System.out.println("We are inserting number \"8\" at index \"2\"");
        list.insert(node,8,2);
        System.out.println("The List: "+ node);

        System.out.println("Now we are using get() to get the number at index \"2\"");
        int get=list.get(node,2);
        System.out.println(get);

        System.out.println("The size of the List");
        int listSize=list.size(node);
        System.out.println("The size is: "+listSize);

        System.out.println("Removing the number from index \"2\"");
        list.remove(node,2);
        System.out.println("Now the list is "+node);
    }
}
