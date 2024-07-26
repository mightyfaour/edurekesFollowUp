package org.example.timbChalka;

class StaticTest {

    // non-static method
    int multiply(int a, int b){
        return a * b;
    }

    // static method
//    static int add(int a, int b){
//        return a + b;
//    }
}

class StaticTest2 {

//    // non-static method
//    int multiply(int a, int b){
//        return a * b;
//    }

    // static method
    static int add(int a, int b){
        return a + b;
    }
}
public class Method_2 {

    public static void main( String[] args ) {
        String name = "Phil";
        String name2 = new String("Phil");
        String name3 = new String(name);

        System.out.println(name2.substring("Ph".length()));

        // create an instance of the StaticTest class
        StaticTest st = new StaticTest();

        // call the nonstatic method
        System.out.println(" 2 * 2 = " + st.multiply(2,2));

        // call the static method
        System.out.println(" 2 + 3 = " + StaticTest2.add(2,3));
    }
}