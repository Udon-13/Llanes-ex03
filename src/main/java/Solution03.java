/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution03 {
    /*
    prompt use for quote
    store in string
    prompt user for person
    store in string
    combine in one output
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String quote, name;
        System.out.println("What is the quote?");
        quote = input.nextLine();
        System.out.println("Who said it?");
        name = input.nextLine();

        System.out.println(name + " says, \"" + quote + "\"");
    }
}
