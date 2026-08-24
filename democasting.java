// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class democasting {
   public static void main(String[] args) {
      //Implicit Conversion 
      //(Byte into Int)
      //New file
    //   byte b= 89;
    //  int a=b;
    //  System.out.println(b);
     // chartaer to init
    //   char c = 's';
    //   int i = c;
    //   System.out.println(i);
    // Explicit Conversion
    // int i =24;
    // byte b=(byte)i;
    // System.out.println(b);
    // in this conversion int in range off byte so esaliy convert int to byte
    // now
    int i =300;
    byte b= (byte)i;
    System.out.println(b); // output is 44 
    // in this case is out of byte range -128 to 127 so now he covert the int
    //  to byte like this i ka value mode of 256 eg 300 % 256=44.
    // second way to conversion 
    
   }
}
