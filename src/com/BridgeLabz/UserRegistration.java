package com.BridgeLabz;


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();

        System.out.println("Welcome to User Registration!");
        System.out.println("Enter First Name: ");
        userRegistration.nameValidation(scanner.next());
        System.out.println("Enter Last Name: ");
        userRegistration.nameValidation(scanner.next());
        System.out.println("Enter Email id: ");
        userRegistration.emaileValidation(scanner.next());
        scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        userRegistration.mobileNumberValidation(scanner.nextLine());
        System.out.println("Enter Password: ");
        userRegistration.passwordValidation(scanner.next());
        scanner.close();
    }

    public String nameValidation(String name) {
        if (Pattern.matches("[A-Z][a-z]{2}[a-z]*", name)) {
            System.out.println("Valid Name");
            return "Valid";
        } else {
            System.out.println("Invalid Name");
            return "Invalid";
        }
    }

    public String emaileValidation(String name) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
        if (Pattern.matches(regex, name)) {
            System.out.println("Valid Email Id");
            return "Valid";
        } else {
            System.out.println("Invalid Email Id");
            return "Invalid";
        }
    }

    public String mobileNumberValidation(String num) {
        if (Pattern.matches("^[1-9]{1,3}[ ]{1}[1-9]{1}[0-9]{9}$", num)) {
            System.out.println("Valid Phone Number.");
            return "Valid";
        } else {
            System.out.println("Invalid Phone Number.");
            return "Invalid";
        }
    }

    public String passwordValidation(String passwoString) {
        if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-d+=()])(?=\\S+$).{8,20}$", passwoString)) {
            System.out.println("Valid Password.");
            return "Valid";
        } else {
            System.out.println("Invalid Password.");
            return "Invalid";
        }
    }
}