package cipher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Decryption {

    static void decrypteCipherText(List<Integer> ciperList){

        /*Tempepory list for processing*/
        List<Integer> tempList = new ArrayList<Integer>();
        System.out.println("Sorting for decoding");

        /*SWAPPING OPERATION for Decryption*/
        if (ciperList.get(0) == 999) {
            for (int i = ciperList.size() /2; i <= ciperList.size()-1 ; i++) {
                tempList.add(Integer.parseInt(ciperList.get(i).toString()));
            }
            for (int i = (ciperList.size() /2)-1 ; i >= 0; i--) {
                tempList.add(ciperList.get(i));
            }
            tempList.remove(ciperList.size()-1);
        }else {
            for (int i = ciperList.size()/2; i <= ciperList.size()-1; i++) {
                tempList.add(Integer.parseInt(ciperList.get(i).toString()));
            }
            for (int i = (ciperList.size() /2)-1; i >= 0; i--) {
                tempList.add(ciperList.get(i));
            }
        }
        /*Collection is JAVA's non static class and Reverse() is its method
         * to convert the given list order*/
        Collections.reverse(tempList);

        /*This method is responsible to seperate each character from string like 'AYUB'
         and get their ASCII code i.e. 65, 66, 67, 68 and Apply Caesar Cipher*/
        Common.convertCipherTextToPlainText(tempList);
    }
}
