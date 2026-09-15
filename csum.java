class test
{
    int age;
    int roll;
    String name;

    void display()
    {
        System.out.println("Name :- " + name);
        System.out.println("Age  :- " + age);
        System.out.println("Roll :- " + roll);

    }
}


public class csum {
    public static void main(String args[])
    {
      test t=new test();
       t.age=28;
       t.roll=203;
       t.name="Aman";

       t.display();
    }
}
