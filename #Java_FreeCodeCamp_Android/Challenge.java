import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
class contact
{
    Map<String,Integer>cont=new HashMap<>();
    int choice;
    boolean flag=false;
    Scanner s=new Scanner(System.in);
    public  void show()
    {
        while(!flag)
        {
            System.out.println("1:show all contact\n2:add a new contact\n1.3:delete a contact\n4:search a contact\n5:go back to all message");
            choice=s.nextInt();
            switch(choice)
            {
                case 1:showCont();break;
                case 2:add_new();break;
                case 3:del();break;
                case 4:search();break;
                case 5:flag=true;break;
                default:System.out.println("invalid input");
            }

        }
    }
    public void showCont()
    {
        for(Map.Entry<String,Integer>entry:cont.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
    public void add_new()
    {
        System.out.println("enter the name");
        String name=s.next();
        System.out.println("enter num");
        int num=s.nextInt();
        cont.put(name, num);
    }
    public void del()
    {
        System.out.println("enter contact name that you want to delete");
        String n=s.next();
        cont.remove(n);
    }
    public void search()
    {
        System.out.println("search by name");
        String name=s.next();
        if(cont.containsKey(name))
        {
            System.out.println(name+":"+cont.get(name));
        }
        else
        {
            System.out.println("not found");
        }
    }
}
class message
{
    List<String>msg=new ArrayList<>();

    public void show()
    {

    }
}
public class Challenge
{
    public static void main(String[] args) {
        System.out.println("My greeting!!!");
        int choice;
        contact c=new contact();
        message m=new message();
        Scanner s=new Scanner(System.in);
        boolean flag=false;
        while(!flag)
        {
            System.out.println("1:Manage contact\n2:Message\n3:Quit");
            choice=s.nextInt();
            switch(choice)
            {
                case 1:c.show();break;
                case 2:m.show();break;
                case 3:flag=true;break;
                default:System.out.println("Invalid input");break;
            }
        }
    }
}
        