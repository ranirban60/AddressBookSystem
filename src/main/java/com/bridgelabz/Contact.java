package com.bridgelabz;

public class Contact {
    private String firstName;
    private  String lastName;
    private  String address;
    private  String city;
    private  String state;
    private  int zip;
    private  long phoneNumber;
    private  String email;

    public Contact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public String toString(){
        return "AddressBook{" +
                "First Name'" + firstName + '\''+
                ",Last Name'" + lastName + '\''+
                ",Address'" + address + '\''+
                ",City'" + city + '\''+
                ",State'" + state + '\''+
                ",Zip'" + zip + '\''+
                ",Phone Number'" + phoneNumber + '\''+
                ",Email'" + email + '\''+
                '}';
    }
}
