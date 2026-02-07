public class StringBasics {
    public static void main(String[] args) {

        String name = "Annanya";

        // Length of string
        System.out.println("Length: " + name.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // Character at index
        System.out.println("Character at index 2: " + name.charAt(2));

        // Check if string contains a word
        System.out.println("Contains 'nya': " + name.contains("nya"));

        // Compare strings
        String name2 = "Annanya";
        System.out.println("Strings equal: " + name.equals(name2));
    }
}
