/* Ability to Add Multiple contact
in AddressBook
*/

package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("welcome to address book program");
        Scanner input = new Scanner(System.in);
        char choice;
        IAddressBook addressBook = new AddressBook();
        do {
            System.out.println("Select your Option: \n1.Add new Contact \n2.Edit Contact \n3.Delete Contact \n4.Add Multiple Contact");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    addressBook.createContact();//Calling createContact method to create new contact
                    break;
                case 2:
                    addressBook.editContact();//Calling editContact method to edit existing contact
                    break;
                case 3:
                    addressBook.deleteContact();//Calling deleteContact method to delete a contact
                    break;
                case 4:
                    addressBook.contactList();//Calling the contactList method
                    break;
            }
            System.out.println("Are you wish to continue:  Y?N");
            choice = input.next().toUpperCase().charAt(0);
        } while (choice != 'N');
        System.out.println(addressBook);
    }
}