
//2. Create a Method to Find the Area of a Circle

package org.example.JavaClass;

public class AreaOfCircle {


    public static double circleArea(){
        double radius = 5;
        double area = Math.PI * radius * radius; // formula
        return area;
    }
    public static void main(String[] args){
        double result = circleArea(); // Storing the value which is returned
        System.out.println(result); // printing the result of area
    }

}

