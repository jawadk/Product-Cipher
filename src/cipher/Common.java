package cipher;

import java.util.Iterator;
import java.util.List;

public class Common {

    /*This is number we are using to apply Caesar Cipher*/
    static int cipherCountForEnrption = 3;

    /*This method accept 1 character like A and return its ASCII code*/
    static int convertIntoASCII(char character){
        return (int)character;
    }

    /*This method accept 1 ASCII code like '65' and return its character 'A'*/
    static char convertIntoChar(int ascii){
        return (char)ascii;
    }

    /*This method accept List<Integer> stored with ASCII code and print it in comsole*/
    static void printCipherText(List<Integer> ciperList){
        System.out.println("***********CIPHER TEXT FROM PLAIN TEXT***********");
        Iterator<Integer> iterator = ciperList.iterator();
        while (iterator.hasNext()) {
            System.out.print(Common.convertIntoChar(iterator.next()));
        }
        System.out.println("\n***********CIPHER TEXT FROM PLAIN TEXT***********\n");
    }

    /*This method is responsible to seperate each character from string like 'AYUB'
     and get their ASCII code i.e. 65, 66, 67, 68 and Apply Caesar Cipher*/
    static void convertCipherTextToPlainText(List<Integer> ciperList) {
        System.out.println("***********PLAIN TEXT FROM CIPHER TEXT***********");
        for (int i = 0; i < ciperList.size(); i++) {
            char temp = Common.convertIntoChar(ciperList.get(i)-cipherCountForEnrption);
            System.out.print(temp);
        }
        System.out.println("\n***********PLAIN TEXT FROM CIPHER TEXT***********");
    }

    /*This method is responsible to seperate each character from string like 'AYUB'
    and get their ASCII code i.e. 65, 66, 67, 68 and Apply Caesar Cipher*/
    static void convertStringIntoACCIICodes(String text, List<Integer> ciperList) {
        for (char s : text.toCharArray()) {
            int temp = Common.convertIntoASCII(s);
            ciperList.add(temp+cipherCountForEnrption);
        }
    }
}
