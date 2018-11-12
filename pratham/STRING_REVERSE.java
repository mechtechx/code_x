import java.util.Scanner;
public class STRING_REVERSE
{
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      String word = sc.nextLine();
      String reverse = new StringBuffer(word).reverse().toString();
      System.out.println("String before reverse: "+word);
      System.out.println("String after reverse: "+reverse);
   }
}