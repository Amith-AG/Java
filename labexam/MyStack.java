import java.util.Scanner;
class Stack
{
    int top;
    int msize=10;
    Stack()
    {
        top=-1;
    }
    int arr[]=new int[msize];
    void push(Scanner sc)
    {
        if(top==msize-1)
        {
            System.out.println("overflow");
         
        }
        else
        {
            System.out.println("enter the push item");
            int val=sc.nextInt();
            top=top+1;
            arr[top]=val;
            System.out.println("item pushed");

        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
         

        }
        else
        {
            top--;
            System.out.println("item popped");
         
        }
    }
    boolean display()
    {
        System.out.println("printing stack");
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);

        }
        return true;

    }
}
public class MyStack
{

    public static void main(String args[])
    {
        int choice=0;
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        while(choice!=4)
        {
            System.out.println(" enter the choice");
            System.out.println("1)push \n2)pop\n3)display\n4)exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1:s.push(sc);break;
                case 2:s.pop();break;
                case 3:s.display(); break;
                case 4:System.out.println("exiting");
                System.exit(0); break;
            
                default:
                System.out.println("invalid input");
                    break;
            }

        }
    }
}

