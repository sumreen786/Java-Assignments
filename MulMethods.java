
//Call methods under different method with different types and see how it behaves
package org.example.JavaClass;


public class MulMethods {


    public static int number() {
        return 8;
    }

    public static String message() {
        return "Sumreen" + " Banu";
    }

    public static void multiple() {
        int num = number();
        String str = message();

        System.out.println("Number: " + num);
        System.out.println("String: " + str);

    }



    public static void main(String[] args) {
        multiple();
    }
}
