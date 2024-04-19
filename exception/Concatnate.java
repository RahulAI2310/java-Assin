//3.Write a Java program to concatenate all elements of a string array efficiently using StringBuilder.
public class Concatnate {
    public static void main(String[] args) {

        String[] array = {"Hello", "world", "from", "StringBuilder"};
        StringBuilder sb = new StringBuilder();
        for (String element : array) {
            sb.append(element).append(" ");
        }
        String result = sb.toString().trim();
        System.out.println(result);
    }
}
