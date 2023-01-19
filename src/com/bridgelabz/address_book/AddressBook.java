package com.bridgelabz.address_book;

import java.util.Scanner;

public class AddressBook {
    Contact person1 = new Contact();
        public void getContact () {


            System.out.println("Enter details : ");
            person1.getPersonDetails();
        }


    public void editPersonDetails(){

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the option to edit");
        System.out.println("1.Firstname\t 2.Lastname\t 3.Address\t 4.City\t 5.State\t 6.Zipcode\t 7.Phone number\t 8.Email\t 9.Exit");
        int choice = input1.nextInt();
        switch (choice){
            case 1 :
                System.out.println("Changing First name : ");
                person1.setFirstName(input1.next());
                break;
            case 2 :
                System.out.println("Changing last name : ");
                person1.setLastName(input1.next());
                break;
            case 3 :
                System.out.println("Changing address : ");
                person1.setAddress(input1.next());
                break;
            case 4 :
                System.out.println("Changing city : ");
                person1.setCity(input1.next());
                break;
            case 5 :
                System.out.println("Changing state : ");
                person1.setState(input1.next());
                break;
            case 6 :
                System.out.println("Changing zipcode : ");
                person1.setZipcode(input1.nextInt());
                break;
            case 7 :
                System.out.println("Changing phone number: ");
                person1.setPhoneNumber(input1.nextInt());
                break;
            case 8 :
                System.out.println("Changing email : ");
                person1.setEmail(input1.next());
                break;
            case 9 :
                System.out.println("Exiting from edit operation");
                break;
        }
    }
    @Override
    public String toString() {
        return "AddressBook{" +
                "person=" + person1 +
                '}';
    }
}

