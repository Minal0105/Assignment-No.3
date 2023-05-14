public class ElementOnOddPosition {
    public static void main(String[] args) {
            // Initialize an array of integers
            int[] arr = {5, 2, 8, 3, 1, 9};

            // Loop through the array and print the elements present on odd positions
            for (int i = 1; i < arr.length; i = i + 2) {
                System.out.println("Element at odd position " + i + " is: " + arr[i]);
            }
        }
    }


