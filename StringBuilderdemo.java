public class StringBuilderdemo {
    public static void main(String[] args) {

        // Using String (Immutable)
        String str = "Java";
        str = str + " Prep";
        System.out.println("String: " + str);

        // Using StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Prep");
        System.out.println("StringBuilder: " + sb);
    }
}
