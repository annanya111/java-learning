public class MaxElementArray {

    // Method to find maximum element
    static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] numbers = {15, 42, 8, 99, 23};

        int maximum = findMax(numbers);

        System.out.println("Maximum element in array: " + maximum);
    }
}
