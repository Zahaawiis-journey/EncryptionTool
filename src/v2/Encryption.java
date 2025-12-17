package v2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Encryption {

    private String message;
    private String encryptionKey;
    private Random random;
    private Scanner scanner;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private String line;
    private char[] letters;
    private char[] secretLetters;

    public Encryption() {
        random = new Random();
        scanner = new Scanner(System.in);
        list = new ArrayList<>();
        shuffledList = new ArrayList<>();
        character = ' ';

        encryptMessage();
    }

    private void getKey() {
    }

    private void newKey() {

    }

    private void encryptMessage() {
        consoleMessages("Enter a message and it will be encrypted");
    }

    private void decryptMessage() {
        consoleMessages("Decrypting the message that was received");

    }

    private void sendMessage() {
    }

    private void styleConsole(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("==========");
        }
    }

    private void consoleMessages(String prompt) {
        styleConsole(5);
        System.out.println();
        System.out.println(prompt);
        styleConsole(5);
    }
}
