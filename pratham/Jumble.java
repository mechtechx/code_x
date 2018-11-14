import java.util.Scanner;
class Jumble
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("ENTER A NUMBER");
            int a=sc.nextInt();
            String no=Integer.toString(a);
            String b="";
            for(int i=0;i<=no.length()-2;i+=2)
            {
                b=b+no.charAt(i+1)+no.charAt(i);
            }
            System.out.println("THE JUMBLED NO IS :" +b);
        }
   }
