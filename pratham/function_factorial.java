import java.util.Scanner;
class function_factorial
{
    public static void main(String args[])
    {
        //declaration of the variable
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int a=sc.nextInt();
        System.out.println(factorial(a));
    }
       //taking out the factorial for the given output
    public static int factorial(int a)
    {
        int pro=1;
        for(int i=a;i>0;i--)
        {
            pro=pro*i;
        }
        return pro;//returning to void main
    }
}