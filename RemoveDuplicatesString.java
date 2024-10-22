public class RemoveDuplicatesString {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder(); // To store the result string

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the current character

            // Check if the character is already in the result
            boolean isDuplicate = false;
            for (int j = 0; j < result.length(); j++) {
                if (currentChar == result.charAt(j)) {
                    isDuplicate = true; // Mark as duplicate
                    break; // Exit inner loop if duplicate found
                }
            }

            // If not a duplicate, append to the result
            if (!isDuplicate) {
                result.append(currentChar);
            }
        }

        return result.toString(); // Convert StringBuilder to String
    }
}
