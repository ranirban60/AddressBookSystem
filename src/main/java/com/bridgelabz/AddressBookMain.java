package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

    public class AddressBookMain {
        ArrayList<Contact> addressBook = new ArrayList<>();
        public static void main(String[] args) {
            System.out.println("Welcome to AddressBook System");
            AddressBookMain addressBookMain = new AddressBookMain();
            addressBookMain.addContact();
        }
        //Create a new Contact Object and adds to Addressbook
        /* create a new Contact Object
         */
        public void addContact(){
            Contact contact = new Contact();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Name");
            String firstName = sc.nextLine();
            contact.setFirstName(firstName);
            System.out.println("Enter Last Name");
            String lastName = sc.nextLine();
            contact.setLastName(lastName);
            System.out.println("Enter Address");
            String address = sc.nextLine();
            contact.setAddress(address);
            System.out.println("Enter City");
            String city = sc.nextLine();
            contact.setCity(city);
            System.out.println("Enter State");
            String state = sc.nextLine();
            contact.setState(state);
            System.out.println("Enter zip");
            int zip = sc.nextInt();
            contact.setZip(zip);
            System.out.println("Enter Phone Number");
            long phoneNumber = sc.nextLong();
            contact.setPhoneNumber(phoneNumber);
            System.out.println("Enter email");
            String email = sc.next();
            contact.setEmail(email);

            addressBook.add(contact);
            System.out.println(contact);
        }
    }

