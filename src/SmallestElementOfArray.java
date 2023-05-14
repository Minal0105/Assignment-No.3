public class SmallestElementOfArray {
            public static void main(String[] args) {
            // Initialize an array of integers
            int[] arr = {5, 2, 8, 3, 1};

            // Assume that the first element is the smallest
            int min = arr[0];

            // Loop through the array and update the min variable if a smaller element is found
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            // Print the smallest element in the array
            System.out.println("The smallest element in the array is: " + min);
        }
    }


