public class DuplicateElementOfArray {
    public static void main(String[] args) {
            // Initialize an array of integers with some duplicate elements
            int[] arr = {5, 2, 8, 2, 3, 1, 9, 5};

            // Loop through the array and check for duplicate elements
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println("Duplicate element: " + arr[i]);
                    }
                }
            }
        }
    }


