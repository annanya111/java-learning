public class ElementSearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int search = 15;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}

