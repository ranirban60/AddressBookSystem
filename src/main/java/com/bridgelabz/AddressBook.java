package com.bridgelabz;
import java.util.*;

public class AddressBook  {
    /**
    ArrayList constructs an empty list with an initial capacity of ten
     */
    public List<Contact> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void operation() {
        System.out.println("Enter number of contact you want to add");
        /**
        nextInt() scans the next token of the input as an int
         */
        int count = scan.nextInt();
        int contactCount = 1;
        while (contactCount <= count) {
            this.add();
            contactCount++;
        }
        boolean status = true;
        do {
            System.out.println("Enter the number according to requirement");
            System.out.println("Enter 1 to Add");
            System.out.println("Enter 2 to Edit");
            System.out.println("Enter 3 to Delete");
            System.out.println("Enter 4 to search the contact based on City");
            System.out.println("Enter 5 to search the contact based on State");
            System.out.println("Enter 6 to sort the contacts based on Name");
            System.out.println("Enter 7 to sort the contacts based on City or State or Zip");
            switch (scan.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    searchByCity();
                    break;
                case 5:
                    searchByState();
                    break;
                case 6:
                    sortByName();
                    break;
                case 7:
                    sortByCityOrStateOrZip();
                default:
                    status = false;
            }
        } while (status);
    }

    /**
     * Method to add contact
     * next() method finds and returns the next complete token from this scanner
     */
    public void add() {
        Contact contacts = new Contact();
        System.out.println("Enter the First name:");
        String firstName = scan.next();

        boolean isPresent = list.stream().anyMatch(n->n.getFirstName().equalsIgnoreCase(firstName)); //Java Streams is used to check if any duplicate
        if(isPresent) {
            System.out.println("Contact already added");
            return;
        }
        contacts.setFirstName(firstName);

        System.out.println("Enter the Last name:");
        String lastName = scan.next();
        contacts.setLastName(lastName);

        System.out.println("Enter the Address:");
        String address = scan.next();
        contacts.setAddress(address);

        System.out.println("Enter the City:");
        String city = scan.next();
        contacts.setCity(city);

        System.out.println("Enter the State:");
        String state = scan.next();
        contacts.setState(state);

        System.out.println("Enter the zip Code:");
        Integer zip = scan.nextInt();
        contacts.setZip(zip);

        System.out.println("Enter the Phone Number:");
        Long phoneNumber = scan.nextLong();
        contacts.setPhoneNumber(phoneNumber);

        System.out.println("Enter the Email");
        String email = scan.next();
        contacts.setEmail(email);

        this.list.add(contacts);
        print();
    }
    /**
     * Method to edit an existing contact
     */
    public void edit() {
        System.out.println("Enter your First name:");
        String firstName = scan.next();

        Iterator<Contact> iterator = this.list.listIterator();

        while (iterator.hasNext()) {
            Contact contacts = iterator.next();

            if (firstName.equals(contacts.getFirstName())) {
                System.out.println("Choose field you want to add:");
                System.out.println("1.Last Name\t2.Address\t3.City\t4.State\t5. Zip\t6.Phone Number\t7.Email");
                switch (scan.nextInt()) {
                    case 1:
                        System.out.println("Re-enter your Last Name");
                        contacts.setLastName(scan.next());
                        break;
                    case 2:
                        System.out.println("Re-enter your Address");
                        contacts.setAddress(scan.next());
                        break;
                    case 3:
                        System.out.println("Re-enter your City");
                        contacts.setCity(scan.next());
                        break;
                    case 4:
                        System.out.println("Re-enter your State");
                        contacts.setState(scan.next());
                        break;
                    case 5:
                        System.out.println("Re-enter your Zip");
                        contacts.setZip(scan.nextInt());
                        break;
                    case 6:
                        System.out.println("Re-enter your Phone Number");
                        contacts.setPhoneNumber(scan.nextLong());
                        break;
                    case 7:
                        System.out.println("Re-enter your Email");
                        contacts.setEmail(scan.next());
                }

            }
        }
    }
    /**
     * Method to delete an existing contact
     */
    public void delete() {
        System.out.println("Enter your First name:");
        String firstName = scan.next();

        Iterator<Contact> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Contact contacts = iterator.next();

            if (firstName.equals(contacts.getFirstName())) {
                list.remove(contacts);
            }
        }
    }
    /**
     * Method to print contact
     */
    public void print() {
        Iterator<Contact> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    /**
    Methods for searching contacts based on city and get number of contact person
     */
    public void searchByCity() {
        System.out.println("Enter the city:");
        String city = scan.next();
        list.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(city)).forEach(contacts -> System.out.println(contacts));
        long count = list.stream().filter(n -> n.getCity().equalsIgnoreCase(city)).count();
        System.out.println("Number of Persons in City " + city + ":" + count);
    }
    /**
     Methods for searching contacts based on state and get number of contact person
     */
    public void searchByState() {
        System.out.println("Enter the State:");
        String state = scan.next();
        list.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(state)).forEach(contacts -> System.out.println(contacts));
        long count = list.stream().filter(n -> n.getState().equalsIgnoreCase(state)).count();
        System.out.println("Number of Persons in State " + state + " : " + count);
    }
    public void sortByName() {
        //Use Sorted Operation for sort the contacts by Name
        list.stream().sorted(Comparator.comparing(Contact::getFirstName)).forEach(System.out::println);
        System.out.println();
    }
    public void sortByCityOrStateOrZip(){
        //Use Sorted Operation for sort the contacts by City
        list.stream().sorted(Comparator.comparing(Contact::getCity)).forEach(System.out::println);
        System.out.println();
        //Use Sorted Operation for sort the contacts by State
        list.stream().sorted(Comparator.comparing(Contact::getState)).forEach(System.out::println);
        System.out.println();
        //Use Sorted Operation for sort the contacts by Zip
        list.stream().sorted(Comparator.comparing(Contact::getZip)).forEach(System.out::println);
        System.out.println();
    }
            /**
             * The String class represents character strings
             * Overrides: toString in class Object
             */
            @Override
            public String toString () {
                return "AddressBook{" +
                        "list=" + list +
                        '}';
            }
        }
