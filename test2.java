class student
{
    int age;
    int roll;
    String name;
    void marks()
    {
        System.out.println("Name  : -" + name);
   System.out.println("Age  : -" + age); 
 System.out.println("Rollno  : -" + roll);

    } 
}


public class test2 {
    public static void main(String[] args) {
        student obj=new student();
        
        obj.name="Golu";
        obj.age=26;
        obj.roll=103;
        

        obj.marks();

    }
}
