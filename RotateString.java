public class RotateString {
    public static void main(String[] args) {
        String str = "hello";
        int n = 3; // number of positions to rotate
        
        // Perform the rotation
        String rotatedStr = rotate(str, n);
        System.out.println("Original String: " + str);
        System.out.println("Rotated String: " + rotatedStr);
    }

    public static String rotate(String str, int n) {
        // Ensure the rotation value is within the length of the string
        n = n % str.length();
        
        // Split and concatenate to rotate the string
        String part1 = str.substring(n); // from position n to the end
        String part2 = str.substring(0, n); // from start to position n
        
        return part1 + part2;
    }
}

