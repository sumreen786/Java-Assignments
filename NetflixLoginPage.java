


//1. Automate this use case - Verify customer should be able to login successfully with correct UN and PW for Netflix Steps
//a. Open https://www.netflix.com/in/
//b. Click on Sign In
//c. Enter User Name and Password
//d. Click on Sign in button
//A class contains variables and methods, and I want to use a Class to create them for the Netflix login use case and call them in the main() method.

package org.example.JavaClass;

public class NetflixLoginPage {


    public static void openNetflixURL(){
        System.out.println("Open https://www.netflix.com/in/");
    }
    public static void signInNetflix(){
        System.out.println("Click On SignIn Button..");
    }
    public static void userCredtials(){
        System.out.println("Enter UserName and Password.");
    }
    public static void clickOnSignIn(){
        System.out.println("Click on signIn Button to Login.");
    }

public static void main(String[] args){

        openNetflixURL();
        signInNetflix();
        userCredtials();
        clickOnSignIn();
}
}
