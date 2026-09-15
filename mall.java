import java.util.Scanner;

class mall
{   
    int a,b,sum,mult,div,sub;
    public static void main(String args[]) 
    {
      mall obj = new mall();
      obj.inputa();
      obj.process();
      obj.outputd();
    }

    void inputa()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:- ");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
    }

    void process()
    {
        sum=a+b;
        mult=a*b;
        div=a/b;
        sub=a-b;        
    }

    void outputd()
    {
        System.out.println("Sum :- "+ sum);
        System.out.println("Multiplication :- "+ mult);
        System.out.println("Division :- "+ div);
        System.out.println("Subtraction :- "+ sub);
    }
}