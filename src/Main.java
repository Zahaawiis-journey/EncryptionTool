import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text to get encrypted");
        String test = scanner.nextLine();
        StringBuilder encrypted = encryption.encryptText(test);

        System.out.println("Showing the text converted to number");
        System.out.println("------");
        System.out.println(Arrays.toString(encryption.getInputAndConvertToNumberBeforeEncrypt(test)));
        System.out.println("------");

        System.out.println("Encrypting text:");
        System.out.println("------");
        System.out.println(encrypted);
        System.out.println("------");

        System.out.println("Showing the encryption progress");
        System.out.println("------");
        System.out.println(Arrays.toString(encryption.convertTextToNumberArray(encrypted)));
        System.out.println("------");


        System.out.println("Converting encrypted to origin number");
        System.out.println("------");
        System.out.println(Arrays.toString(encryption.convertArrayEncryptedToOriginNumber(encrypted)));
        System.out.println("------");


        System.out.println("Decrypting the message");
        System.out.println("------");
        System.out.println(encryption.convertNumberToText(encrypted));
        System.out.println("------");

    }
}