import java.util.Scanner;
public class Passwords {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        if (isStrongPassword(password)) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is not strong.");
        }
    }

    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;  // Password is too short
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if ("@#$%^&+=!".contains(String.valueOf(c))) {  // Special characters
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}


    

