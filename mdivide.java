import java.util.Scanner;
public class mdivide {
    static void divid(double a,double b)
    {
      Double div=a/b;
      System.out.println("Your Output :- " + div);
    }
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
    System.out.print("Enter a First number : - ");
     double c=sc.nextDouble();
     System.out.print("Enter second number :- ");
     double d =sc.nextDouble();
     divid(c,d);
    }
}
