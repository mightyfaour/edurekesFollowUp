package org.example.timbChalka.StringTutorial;

public class StringTutorials {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        StringBuffer sb = new StringBuffer("Philip");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println("Appending letters to a String : "+sb.append(" NEO"));
        System.out.println("Deleting letters to a String : "+sb.deleteCharAt(0));
        System.out.println("Deleting letters to a String : "+sb.substring(-1,3));
        System.out.println("checking capacity in a String : "+sb.capacity());
        System.out.println("Deleting letters to a String : "+sb.charAt(0));
    }
}
