import java.util.Scanner;

public class cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plain text: ");
        String plain = sc.nextLine();
        System.out.print("Enter key value: ");
        int key = sc.nextInt();
        sc.nextLine(); // Consume the newline character left in the buffer
        
        String encryptText = encrypt(plain, key);
        System.out.println("Encrypted text: " + encryptText);
    }

    public static String encrypt(String plain, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plain.length(); i++) {
            char currentChar = plain.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                int offset = 'A';
                char encryptedChar = (char) ((currentChar - offset + key) % 26 + offset);
                encryptedText.append(encryptedChar);
            } else if (Character.isLowerCase(currentChar)) {
                int offset = 'a';
                char encryptedChar = (char) ((currentChar - offset + key) % 26 + offset);
                encryptedText.append(encryptedChar);
            } else {
                // If the character is not a letter, don't encrypt it
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
        
     
    }
}
