
import com.sun.org.apache.bcel.internal.generic.LCMP;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amshu
 */
public class Manage {

    Validate valid = new Validate();
    ArrayList<Contact> lc = new ArrayList<>();

    public int Menu() {
        System.out.println("1.Add contact");
        System.out.println("2.Display all contact");
        System.out.println("3.Delete a contact");
        System.out.println("4.Exit");
        int choice = Validate.checkInputInt("Enter your choice: ", 1, 4);
        return choice;
    }

    public void addContact() {
        int id;
        if (lc.isEmpty()) {
            id = 1;
        } else {
            id = lc.get(lc.size() - 1).getId() + 1;
        }

        String firstname = Validate.checkInputString("Enter fisrt name:");
        String lastname = Validate.checkInputString("Enter last name:");
        String group = Validate.checkInputString("Enter Group:");
        String address = Validate.checkInputString("Enter Address:");
        String phone = Validate.checkInputPhone("Enter Phone:");
        lc.add(new Contact(id, firstname + lastname, group, address, phone, firstname, lastname));
        System.out.println("Add successfully !");

    }

    public void displayAllContact() {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        lc.forEach((contact) -> {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n", contact.getId(), contact.getFullName(), contact.getFirstName(), contact.getLastName(), contact.getGroup(), contact.getAddress(), contact.getPhone());
        });
    }

    public void deleteContact() {
        int id = Validate.checkInputId("Enter ID you want to delete :");

        Contact deleteContact = null;

        for (Contact contact : lc) {
            if (contact.getId() == id) {
                deleteContact = contact;
                break;
            }
        }
        if (deleteContact != null) {
            lc.remove(deleteContact);
            System.out.println("Successful");
        } else {
            System.out.println("ID not found!");
        }
    }

}
