import java.util.Scanner;
public class SecondLargestInArray {
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = arr[i]; // Update largest
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i]; // Update second largest
            }
        }

        // Output the result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}


