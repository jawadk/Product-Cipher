package cipher;

import java.util.*;

public class Main {

    /*Initial 2 lists to take input and processing*/
    private static List<Integer> ciperList = new ArrayList<Integer>();
    private static List<Integer> complexCiperList = new ArrayList<Integer>();

    public static void main(String[] args) {

        String plainText;
        List<Integer> textTemp = new ArrayList<Integer>();

        /*Scanner is a java class which too take input from console.*/
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please enter your Plain text ... !!!");
            /*User input stored in plainText variable*/
            plainText = scanner.nextLine();
        }while (plainText.isEmpty());

        /*Encription Method*/
        textTemp = Encription.encryptPlainText(plainText, ciperList, complexCiperList);
        Common.printCipherText(textTemp);

        System.out.println("=====================");

        /*Decryption Method*/
        Decryption.decrypteCipherText(textTemp);
    }
}
