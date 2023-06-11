//merge
public  class MergeSort
{
    void merge(int arr[],int  beg,int mid,int end)
    {
        int l=mid-beg+1;
        int b=end-mid;
        int larr []=new int[l];
        int rarr[]=new int[b];
        for(int i=0;i<l;++i)
        {
            larr[i]=arr[beg+i];
        }
        for(int j=0;j<b;++j)
        {
            rarr[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=beg;
        while(i<l && j<b)
        {
            if(larr[i]<rarr[j])
            {
                arr[k]=larr[i];
                i++;
            }
            else
            {
                arr[k]=rarr[j];
                j++;
               
            }
            k++;
        }
        while(i<l)
        {
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<b)
        {
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
    void sort(int arr[],int beg,int end)
    {
        if(beg<end)
        {
            int mid=(beg+end)/2;
            sort(arr,beg,mid);
            sort(arr,mid+1,end);
            merge(arr,beg,mid,end);
        }
    
    }
  public static void main(String args[])
  {
    int arr[]={12,34,2,45,4,5,45,39,10};
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("arr["+i+"]"+"="+arr[i]);
    }
    MergeSort ob=new MergeSort();
    ob.sort(arr,0,arr.length-1);
    System.out.println("after sort");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("arr["+i+"]"+"="+arr[i]);
    }
 }
}