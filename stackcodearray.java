import java.util.*;
class stack
{
    int n =5;
    int data[] = new int[n];
    int top = -1; 
   
    
    void push()
    {
        if(top==(n-1))
        {
            System.out.println("overflow");
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter data");
           int  i=sc.nextInt();
           top=top+1;
            data[top] = i;
            
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        else
        {
            int d = data[top];
            top = top-1;
        }
    }
    void display()
    {
        for(int j=top;j>=0;j--)
        {
          System.out.println(data[j]);
        }
    }
    
}

class stackcodearray extends stack
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        stack s = new stack();
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
       
        
    }while(l==0);
    System.out.println("exited");
    
}
}