public class NuminString {
    public static void main(String args[]) {
        String s = "Dhina4203";
        char[] characters = s.toCharArray(); // Corrected spelling: toCharArray() instead of charArray()
        int count = 0;

        for (char ch : characters) {
            if (Character.isDigit(ch)) { // Corrected method name: isDigit() instead of toDigit()
                count++;
            }
        }

        System.out.println("Number of digits in the string: " + count); // Moved print statement inside main method
    }
}
