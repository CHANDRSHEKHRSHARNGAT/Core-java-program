public class whitespace {
    public static void main(String[] args) {
String originalString = "This is a string ";
String modifiedString = originalString.trim().replaceAll("\\s+", "");
System.out.println(modifiedString);
    }
}
