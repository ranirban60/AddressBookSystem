package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;//Scanner class is used to get user input

public class AddressBookMain {
    static Scanner scan = new Scanner(System.in);
   /**
   *This String class represents character strings
   */
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS BOOK ");
        HashMap<String,AddressBook> map = new HashMap<>();
        System.out.println("Enter number of address book you want to add");
        /**
        * nextInt() method scans the next token of the input as an int
        * next() method find and returns the next complete token from this scanner
         */
        int count = scan.nextInt();
        int i = 0;
        while (i < count) {
            System.out.println("Enter book name");
            String bookName = scan.next();
            AddressBook addressBook = new AddressBook();
            addressBook.operation();
            map.put(bookName, addressBook);
            i++;
        }
        System.out.println();
        System.out.println(map);
    }
    }
