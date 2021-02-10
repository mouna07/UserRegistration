package com.BridgeLabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String firstName;

        System.out.println("Welcome to User Registration!");
        System.out.println("Enter First Name: ");
        firstName = scanner.next();
        if (Pattern.matches("[A-Z][a-z]{2}[a-z]*", firstName)) {
            System.out.println("Valid First Name");
        } else {
            System.out.println("Invalid First Name");
        }

    }
}
