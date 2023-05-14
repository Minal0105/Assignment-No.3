import java.util.Arrays;
public class AscendingOrderOfArray {
    public static void main(String[] args) {
            // Initialize an array of integers
            int[] arr = {5, 2, 8, 3, 1, 9};

            // Sort the array in ascending order
            Arrays.sort(arr);

            // Loop through the sorted array and print the elements
            System.out.println("Sorted array in ascending order:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }


