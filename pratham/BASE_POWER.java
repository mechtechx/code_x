import java.util.Scanner;
class BASE_POWER
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("ENTER THE BASE :");
        a=sc.nextInt();
        System.out.println("ENTER THE POWER :");
        b=sc.nextInt();
        System.out.println(Math.pow(a,b));
    }           
}