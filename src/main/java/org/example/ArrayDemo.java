package org.example;

//Crete an arrayhaving many characters.
//write a program to copy element from created array to another array
//and also write a program to delete an elemt from an array.


public class ArrayDemo {
    int []a = new int[]{};
    public static void main(String[] args) {
        // Creating an array of characters
        char[] source = {'H', 'A', 'P', 'P', 'Y', 'L', 'E', 'A', 'R', 'N', 'I', 'N', 'G'};
        char[] destination = new char[7];

        // Copying elements from one array to another
        System.arraycopy(source, 0, destination, 1, 5);
        System.out.println(new String(destination));
        System.out.println("The length of the source is " + source.length);

        // Deleting element from an array
        int flag = 3; // Index of the element to be deleted
        for (int i = flag; i < source.length - 1; i++) {
            source[i] = source[i + 1];
        }
//        source[source.length - 1] = '\0'; // Set the last element as null character

        System.out.println(new String(source));
    }

}
