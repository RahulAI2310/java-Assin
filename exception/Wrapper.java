//1.Write a Java program that compares two wrapper objects for equality and demonstrates when to use equals() instead of == (try with Integer or Float classes)
public class Wrapper {
    public static void main(String[] args) {
        try{
            Integer i1 =  Integer.parseInt("10");
            Integer i2 =  Integer.parseInt("10");
            Integer i3 = 10;

            Float f1 =  Float.parseFloat("20.5");
            Float f2 =  Float.parseFloat("20.5");
            Float f3 = 20.5f;

            System.out.println("Using '==' operator:");
            System.out.println("i1 == i2: " + (i1 == i2));
            System.out.println("i1 == i3: " + (i1 == i3));
            System.out.println("f1 == f2: " + (f1 == f2));
            System.out.println("f1 == f3: " + (f1 == f3));

            System.out.println("\nUsing .equals() method:");
            System.out.println("i1.equals(i2): " + i1.equals(i2));
            System.out.println("i3.equals(i1): " + i3.equals(i1));
            System.out.println("f1.equals(f2): " + f1.equals(f2));
            System.out.println("f3.equals(f2): " + f3.equals(f2));
        }catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
