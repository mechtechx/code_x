import java.util.Scanner;
class TWIN_PRIME
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER :");
        int a=sc.nextInt();
        int r=0;
        r=r*10+a;
        if(isprime(a) && isprime(r))
        {
            System.out.println("IT IS A TWIN PRIME");
        }
        else
        {
            System.out.println("IT IS NOT A TWIN PRIME");
        }
    }
    public static boolean isprime(int a)
    {
        int c=0;
        for (int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}