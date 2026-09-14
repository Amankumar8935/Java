import java.util.*;

class new2
{

    Double age;
    Double roll;
    String name;

    void show(){
        System.out.println("Your Name :- " + name);
         System.out.println("Your Age :- " + age);
          System.out.println("Your Roll :- " + roll);
    }
}


public class comult {
    public static void main(String args[])
    {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter Your Age");
                double a = sc.nextDouble();
        System.out.println("Enter Your Roll");
          Double b=sc.nextDouble();

        System.out.println("Enter your Name ");
           String s = sc.next();

           new2 obj = new new2();
             obj.age=a;
             obj.roll=b;
             obj.name=s;
             obj.show();
    }
}
