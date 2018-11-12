import java.util.Scanner;
public class STRING_OMISSION
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A SENTENCE");
      String a = sc.nextLine();
      System.out.println("ENTER THE NUMBER FOR THE WORD U WANT TO ERASE[start=0]");
      int b=sc.nextInt();
      System.out.println(removeCharAt(a,b));
   }
   public static String removeCharAt(String s, int p) 
   {
      return s.substring(0,p) + s.substring(p+1);
   }
}