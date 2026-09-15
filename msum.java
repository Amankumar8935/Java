import java.util.Scanner;

public class msum {
    static void mult(double a, double b){
       double muli = a*b;
       System.out.println("Multiplication :- " + muli);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
           Double c=sc.nextDouble();
                 System.out.println("Enter a Second number");
           Double d=sc.nextDouble();
        mult(c, d);
    }
}
