import java.util.Scanner;
class Finder
  {
    int s=0;int h=0;
    int star(String input)
    { for(int i=0;i<input.length();i++)
      {
        if(input.charAt(i)=='*')
        {
          s++;
        }
      }
     return s;
    }
    int hash (String input)
    { for(int i=0;i<input.length();i++)
      {
        if(input.charAt(i)=='#')
        {
          h++;
        }
      }
     return h;
    }
    
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string consist of * and # only");
    String input=sc.nextLine();
    Finder f=new Finder();
    int flag=0;
    
    int s=f.star(input);
    int h=f.hash(input);
    for(int i=0;i<input.length();i++)
      {
        if(input.charAt(i)!='*'&&input.charAt(i)!='#')
        {
            flag=1;
          System.out.println("invalid input!!,the string should only contain * and #");
          break;
        }
      }
    if(flag!=1){
    if(s==h)
    {
      System.out.println("*=#");
    }
    else if(s>h)
      {
      System.out.println("* is greater than # by"+(s-h));
      }
    else if(s<h)
      {
      System.out.println("# is greater than * by"+(h-s));
      }
  }
}
  }

