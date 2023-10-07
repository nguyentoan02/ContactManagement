/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSII
 */
import controller.Manager;
import model.Contact;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Contact> contactList = new ArrayList<>();
        Manager manager = new Manager(contactList);

        while (true) {
            manager.run();
        }
    }
}

