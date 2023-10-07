/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Scanner;
import model.Contact;

/**
 *
 * @author MSII
 */
public class Library {
    Validation validator = new Validation();

    // tự động tăng ID
    public int generateNextContactId(ArrayList<Contact> lc) {
        int lastContactId = 0;
        for (Contact contact : lc) {
            if (contact.getContactId() > lastContactId) {
                lastContactId = contact.getContactId();
            }
        }
        return lastContactId + 1;
    }

    // Phương thức tạo contact
    public void createContact(ArrayList<Contact> lc) {
        int contactId = generateNextContactId(lc); //tạo id mới
        System.out.print("Enter first name: ");
        String firstName = validator.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = validator.checkInputString();
        System.out.print("Enter group: ");
        String group = validator.checkInputString();
        System.out.print("Enter address: ");
        String address = validator.checkInputString();
        System.out.print("Enter phone: ");
        String phone = validator.checkInputPhone();
        lc.add(new Contact(contactId, firstName + " " + lastName, group, address, phone, firstName, lastName));
        System.err.println("Add successful.");
    }

    //allow user display all contact
    public void printAllContact(ArrayList<Contact> lc) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        //print infomation of contact from first to last list contact
        for (Contact contact : lc) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    //allow user delete contact
    public  void deleteContactd(ArrayList<Contact> lc) {
        System.out.print("Enter id: ");
        int idDelete = validator.checkInputInt();
        Contact contactDelete = getContactById(lc, idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            lc.remove(contactDelete);
        }
        System.err.println("Delete successful.");
    }

    //get contact by id
    public  Contact getContactById(ArrayList<Contact> lc, int idDelete) {
        for (Contact contact : lc) {
            if (contact.getContactId() == idDelete) {
                return contact;
            }
        }
        return null;
    }
    
    

}

