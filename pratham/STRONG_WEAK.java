import java.util.*;
class STRONG_WEAK
{
    public static void main(String args[])
    {
        String pssw;
        int i;
        int c=0,p=0;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER PASSWORD");
        pssw=in.next();
        if(pssw.length()>=8)
        {
            for(i=0;i<pssw.length();i++)
            {
                char x=pssw.charAt(i);
                if(Character.isLetter(x))
                {
                   p=1; 
                }
                if(Character.isDigit(x))
                {
                    c=1;
                }
            }
            if(c==1)
            {
                System.out.println("STRONG");
            }
            else
            {
                System.out.println("WEAK");
            }
        }
        else
        {
            System.out.println("HAVE ATLEAST 8 CHARECTERS");
        }
    }
}