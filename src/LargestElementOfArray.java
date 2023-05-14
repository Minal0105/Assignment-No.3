public class LargestElementOfArray {
        public static void main(String[] args) {
            // Initialize an array of integers
            int[] arr = {5, 2, 8, 3, 1};

            // Assume that the first element is the largest
            int max = arr[0];

            // Loop through the array and update the max variable if a larger element is found
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // Print the largest element in the array
            System.out.println("The largest element in the array is: " + max);
        }
    }


