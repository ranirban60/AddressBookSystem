/** To get number of person i.e. count by city or State
    in a  AddressBook
 */
package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;//Scanner class is used to get user input

public class AddressBookMain {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS BOOK ");
        Map<String, AddressBook> map = new HashMap<>();
        System.out.println("Enter number of address book you want to add");
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
        System.out.println(map);
    }
    }
