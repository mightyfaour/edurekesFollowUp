package org.example.TestingPack;

public class ReverseString {
    public String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            //swap character to the left and right positions
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
//        return String.valueOf(charArray);
        return new String(charArray);
    }
}
