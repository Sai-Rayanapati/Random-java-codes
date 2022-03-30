import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Stack {

    //static int lastItem=0;
    static void push(ArrayList<Integer> stack, int number)
    {
        stack.add(number);
        //lastItem=number;
        //System.out.println(stack.size());
        System.out.println("Elements: " + stack);
    }
    static void pop(ArrayList<Integer> stack)
    {
        int lastIndex=stack.size()-1;
         stack.remove(lastIndex);
        System.out.println("Elements: " + stack);
    }
    static int peek(ArrayList<Integer> stack)
    {
        int lastIndex=stack.size()-1;
        return stack.get(lastIndex);

    }

    static int search(ArrayList<Integer> stack, int number)
    {
        if(stack.contains(number))
        {
            return stack.indexOf(number);
        }
        else return (-1);
    }
    static void move(ArrayList<Integer> stack, int number)
    {
        int index=search(stack,number);
        int lastIndex=stack.size()-1;
        if(index==-1)
        {
            System.out.println("Cant move as no object");
        }
        else
            Collections.rotate(stack.subList(index,lastIndex+1),-1);
        System.out.println("Elements: "+stack);
    }



    public static void main(String[] args) {

        Scanner numberIn=new Scanner(System.in);

        ArrayList<Integer> stack= new ArrayList<Integer>();

        boolean quit=false;

        while (!quit)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter if you want to push, pop, peek, search or quit" );
            if(input.hasNext("push")||input.hasNext("Push"))
            {
                System.out.println("Enter a number you want to add");
                int number = numberIn.nextInt();
                push(stack, number);
            }
            else if(input.hasNext("pop")||input.hasNext("Pop"))
            {
                pop(stack);
            }
            else if(input.hasNext("peek")||input.hasNext("Peek"))
            {
                System.out.println(peek(stack));
            }
            else if(input.hasNext("search")||input.hasNext("Search"))
            {
                System.out.println("Enter a number you want to search");
                int search=numberIn.nextInt();
                System.out.println("The index of the number you searched is:"+search(stack,search));
            }
            else if(input.hasNext("quit")||input.hasNext("Quit"))
            {
                quit=true;
            }
            else if(input.hasNext("move")||input.hasNext("Move"))
            {
                System.out.println("Enter a number you wnat to move");
                int movenum=numberIn.nextInt();
                move(stack,movenum);
            }











        }


    }
}
