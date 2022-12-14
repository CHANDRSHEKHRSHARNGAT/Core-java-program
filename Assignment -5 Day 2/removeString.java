public class removeString{
public static void main(String[] args){

String message = "I am very Happy!!";

// Find the position of the substring "very " in the message
int  substringPos = message.indexOf("very ");

// Use the substring method to create a new string without the substring "very "
String  newMessage = message.substring(0, substringPos) + 
message.substring(substringPos + 5);

System.out.println(newMessage);
    }
}
