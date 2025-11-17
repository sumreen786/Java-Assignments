
//Create a Method That Returns the Bigger Number

package org.example.JavaClass;

public class BiggestNumber {

    public static int isBiggestNum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int result = isBiggestNum(20, 2);

        System.out.println(result + " is the Biggest Number");

    }
}
