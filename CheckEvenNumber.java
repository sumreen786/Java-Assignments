//Write a Method to Check if a Number is Even

package org.example.JavaClass;

public class CheckEvenNumber {

    public static boolean isEven() {
        int number = 4;
        return number % 2 == 0;
    }
    public static void main(String[] args){
        if(isEven()){
            System.out.println( " Even");
    }        else   {
            System.out.println( "Odd");
        }

    }}
