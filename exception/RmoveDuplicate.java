//2.Write a Java program to remove duplicate characters from a string using StringBuffer.
public class RmoveDuplicate {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Rushikesh");
        stringBuffer.delete(1,5);
        System.out.println(stringBuffer);
    }
}
