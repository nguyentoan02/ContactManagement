/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;
/**
 *
 * @author MSII
 */

import java.util.ArrayList;
import model.Contact;
import common.Library;
import view.Menu;

public class Manager extends Menu<String> {

    private ArrayList<Contact> contactList;
    private Library library; 

    public Manager(ArrayList<Contact> contactList) {
        super("Contact Management Menu", new String[] { "Add a contact", "Display all contacts", "Delete a contact", "Exit" });
        this.contactList = contactList;
        this.library = new Library(); 
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                library.createContact(contactList); 
                break;
            case 2:
                library.printAllContact(contactList);
                break;
            case 3:
                library.deleteContactd(contactList); 
                break;
            case 4:
                System.out.println("Exiting the program.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }
}


