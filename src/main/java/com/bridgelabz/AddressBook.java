package com.bridgelabz;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class AddressBook implements IAddressBook {
    static Scanner input = new Scanner(System.in);
    ArrayList<Contact> contact = new ArrayList<>();

    @Override
    public void createContact() {//This method is calling for new contact
        Contact personDetails = new Contact();
        System.out.println("Enter Your First Name: ");
        String firstName = input.next();
        if(!contact.isEmpty()) {
            boolean isPresent = contact.stream().findFirst().equals(firstName);
            System.out.println("Contact already added");
            return;
        }
        personDetails.setFirstName(firstName);
        System.out.println("Enter Your Last Name: ");
        personDetails.setLastName(input.next());
        System.out.println("Enter Your Address: ");
        personDetails.setAddress(input.next());
        System.out.println("Enter Your City: ");
        personDetails.setCity(input.next());
        System.out.println("Enter Your State: ");
        personDetails.setState(input.next());
        System.out.println("Enter Your Zip code: ");
        personDetails.setZip(input.nextInt());
        System.out.println("Enter Your Email Id: ");
        personDetails.setEmail(input.next());
        System.out.println("Enter Your Mobile Number: ");
        personDetails.setPhoneNumber(input.nextLong());
        contact.add(personDetails);
        System.out.println("contact added successfully");
    }

    @Override
    public void editContact() {//This method is called for edit a existing contact
        System.out.println("\nEnter First Name of person You want to edit :- ");
        String firstName = input.next();
        String userChoice;

        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getFirstName().equals(firstName)) {
                do {
                    System.out.print("\nSelect option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
                    int choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter new first name : ");
                            contact.get(i).setFirstName(input.next());
                            System.out.println("First name is updated.");
                            break;
                        case 2:
                            System.out.print("Enter new last name : ");
                            contact.get(i).setLastName(input.next());
                            System.out.println("Last name is updated.");
                            break;
                        case 3:
                            System.out.print("Enter new address :");
                            contact.get(i).setAddress(input.next());
                            System.out.println("Address is updated.");
                            break;
                        case 4:
                            System.out.print("Enter new city : ");
                            contact.get(i).setCity(input.next());
                            System.out.println("City is updated.");
                            break;
                        case 5:
                            System.out.print("Enter new state : ");
                            contact.get(i).setState(input.next());
                            System.out.println("State is updated.");
                            break;
                        case 6:
                            System.out.print("Enter new zip code : ");
                            contact.get(i).setZip(input.nextInt());
                            System.out.println("Zip code is updated.");
                            break;
                        case 7:
                            System.out.print("Enter new phone number : ");
                            contact.get(i).setPhoneNumber(input.nextLong());
                            System.out.println("Phone number is updated.");
                            break;
                        case 8:
                            System.out.print("Enter new email : ");
                            contact.get(i).setEmail(input.next());
                            System.out.println("Email is updated.");
                            break;
                    }
                    System.out.println("Are you wish to edit other Address fields: Y?N");
                    userChoice = input.next();
                } while (userChoice.toUpperCase().equals("Y"));
                return;
            }
        }
        System.out.println("Please enter the correct first name");
    }

    @Override
    public void deleteContact() {//This method is called for delete a contact
        if (contact.isEmpty()) {
            System.out.println("address book is empty");
        }
        System.out.println("\nEnter First Name of person You want to delete :- ");
        String firstName = input.next();
        String userChoice;

        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getFirstName().equals(firstName)) {
                do {
                    contact.remove(i);
                    System.out.println("contact deleted");
                    System.out.println("Are you wish to delete other Address fields: Y?N");
                    userChoice = input.next();
                } while (userChoice.toUpperCase().equals("Y"));
                return;
            }
        }
        System.out.println("Please enter the correct first name");
    }

    @Override
    public void contactList() { //Add multiple person in Address Book
        if (contact.isEmpty()) {
            System.out.println("Your address book is empty.");
            return;
        }
        System.out.println("\n Address Book:");
        for (Contact person : contact) {
            System.out.println("Contact \n" + person.getFirstName());
        }
   }
   @Override
   public void readContact() { //To read Contact from AddressBook
       if (contact.isEmpty()) {
           System.out.println("Your address book is empty.");
           return;
       }
       System.out.println("\n Address Book:");
       for (Contact person : contact) {
           System.out.println("Contact \n" + person.getFirstName());
       }
   }
    @Override
    public String toString() {
        return "AddressBook{" +
                "contact =" + contact +
                '}';
    }
}