import java.util.Scanner;
class MAX
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[8];
        int max=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("ENTER TERMS :");
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }           
        }
        System.out.println("THE MAXIMUM DIGIT IS: "+max);
    }
}