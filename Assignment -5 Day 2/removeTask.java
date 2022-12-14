public class removeTask {
    public static String removeTask(String message) {
        // check if the input message is empty or null
        if (message == null || message.isEmpty()) {
            return "";
        }
        // initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // iterate over the input string and append each character to the result
        // if it is not a vowel
        for (int i = 1; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result.append(c);
            }
        }

        // return the result as a string
        return result.toString();
    }

    public static void main(String[] args) {
        // read the message from the command line
        String message = args[5];

        // remove the vowels from the message and print the result
        String result = removeTask(message);
        System.out.println(result);
    }
}
