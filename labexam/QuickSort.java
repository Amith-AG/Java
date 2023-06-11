public class QuickSort
{
    public static void main(String args[])
{
    int arr[]={122,22,32,43,54,45,6,54,90};
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("arr["+i+"]="+arr[i]);
    }
    QuickSort ob=new QuickSort();
    ob.sort(arr,0,arr.length-1);
    System.out.println("after sort");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("arr["+i+"]="+arr[i]);
    }
}
void sort(int arr[],int beg,int end)
{
    if(beg<end)
    {
        int loc=partiton(arr,beg,end);
        sort(arr,beg,loc-1);
        sort(arr,loc+1,end);

    }

}
public int partiton(int arr[],int beg,int end)
{
    int left,right,temp,loc,flag;
    left=beg;
    loc=beg;
    right=end;
    flag=0;
    temp=0;
    while(flag!=1)
    {
        while(arr[loc]<arr[right] && loc!=right)
        right--;
        if(loc==right)
        flag=1;
        else if(arr[loc]>arr[right])
        {
            temp=arr[loc];
            arr[loc]=arr[right];
            arr[right]=temp;
            loc=right;
        
        }
        if(flag!=1)
        {
            while(arr[loc]>arr[left] && loc!=left)
            left++;;
            if(loc==left)
            flag=1;
            else if(arr[loc]<arr[left])
            {
                temp=arr[loc];
                arr[loc]=arr[left];
                arr[left]=temp;
                loc=left;
            }

        }
    }
    return loc;
}
}