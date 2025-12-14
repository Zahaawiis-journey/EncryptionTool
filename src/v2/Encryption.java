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

        newKey();
    }

    private void getKey() {
    }

    private void newKey() {
    }

    private void encryptMessage() {
    }

    private void decryptMessage() {

    }

    private void sendMessage() {
    }
}
