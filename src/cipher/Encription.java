package cipher;

import java.util.Collections;
import java.util.List;

public class Encription {

    static List<Integer> encryptPlainText(String plainText, List<Integer> ciperList,  List<Integer> complexCiperList) {

        /*Passing plainText to get list of ASCII codes*/
        Common.convertStringIntoACCIICodes(plainText, ciperList);

        System.out.println("REVERSE");

        /*Collection is JAVA's non static class and Reverse() is its method
        * to convert the given list order*/
        Collections.reverse(ciperList);

        /*Normal print method*/
        Common.printCipherText(ciperList);

        int cipherTextLength = ciperList.size();

        /*SWAPPING OPERATION for Encription*/
        if ((cipherTextLength % 2) == 0) {
            for (int i = ciperList.size() - 1; i >= ciperList.size() /2; i--) {
                complexCiperList.add(Integer.parseInt(ciperList.get(i).toString()));
            }
            for (int i = 0; i < cipherTextLength / 2; i++) {
                complexCiperList.add(ciperList.get(i));
            }
        } else {
            ciperList.add(999);
            for (int i = ciperList.size()-1; i >= ciperList.size() /2; i--) {
                complexCiperList.add(Integer.parseInt(ciperList.get(i).toString()));
            }
            for (int i = 0; i <= cipherTextLength / 2; i++) {
                complexCiperList.add(ciperList.get(i));
            }
        }
        return complexCiperList;
    }
}
