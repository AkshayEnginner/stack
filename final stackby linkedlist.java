import java.util.*;
class Node
{
    String data;
    Node next;
    
    Node(String data)
    {
        this.data = data;
        this.next = null;
    }
}
class Stack
{
    Node top = null;
    
    void push()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data");
        String k = sc.nextLine();
        Node nnode = new Node(k);
        if(top == null)
        {
            top = nnode;
        }
        else
        {
            nnode.next = top;
            top = nnode;
        }
    }
    
    void pop()
    {
        if(top == null)
        {
            System.out.println("the stack is empty");
        }
        else
        {
            top = top.next;
        }
    }
    void display()
    {
        Node temp;
        for(temp = top;temp != null ; temp = temp.next)
        {
            System.out.println(temp.data);
        }
    }
}
class main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        Stack s = new Stack();
        int l,d;
        int n = 4;
    do
    {    
       System.out.println("1 to push");
       System.out.println("2 to pop");
       System.out.println("3 to display");
       System.out.println("Enter your choice");
       d= sc.nextInt();
       switch(d)
       {
           case 1:
           {
               s.push();
               break;
           }
           case 2:
            {
                s.pop();
                break;
            }
            case 3:
            {
                s.display();
                break;
            }
       }
       System.out.println("Enter the 0 to menu again");
       System.out.println("Enter any key to exit");
       l = sc.nextInt();
       
        
    }while(l==00);
    System.out.println("exited");
    
}
}