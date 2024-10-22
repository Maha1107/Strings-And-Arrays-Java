import java.util.Scanner;
public class PrintDuplicateString {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input string from user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        System.out.println("Duplicate characters:");

        // Outer loop - pick a character
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 0;
            
            // Inner loop - check for duplicates
            for (int j = i + 1; j < input.length(); j++) {
                if (currentChar == input.charAt(j)) {
                    count++;
                }
            }
            
            // Print the character if it's duplicate
            if (count > 0) {
                System.out.println(currentChar);
            }
        }
    }
}


