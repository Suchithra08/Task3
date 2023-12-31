import java.util.Scanner;

public class PasswordStrengthIndicator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int length = password.length();
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = !password.matches("[A-Za-z0-9]*");

        if (length > 8 && hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
            System.out.println("Password strength: Strong");
        } else if ((length > 6 && length <= 8) && (hasUppercase || hasLowercase) && hasDigit) {
            System.out.println("Password strength: Medium");
        } else {
            System.out.println("Password strength: Weak");
        }

        scanner.close();
    }
}
