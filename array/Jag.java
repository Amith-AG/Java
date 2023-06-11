import java.util.Scanner;

public class Jag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of jagged array's row");
        int i=sc.nextInt();
        int ary[][]=new int[i][];
        for (int r=0;r<i;r++)
        {
            System.out.println("no of column in the "+r+" row");
            ary[r]=new int[sc.nextInt()];
        }
        //enter input from the users
        for (int row=0;row<ary.length;row++)
            for (int column = 0; column<ary[row].length; column++) {
                System.out.println("ary[" + row + "][" + column + "] =");
                ary[row][column] = sc.nextInt();
            }
        //printing
        for (int ro=0;ro<ary.length;ro++)
        {
            for (int co=0;co<ary[ro].length;co++)
            {
                System.out.print(" "+ary[ro][co]);
            }
            System.out.println();
        }


    }
}
