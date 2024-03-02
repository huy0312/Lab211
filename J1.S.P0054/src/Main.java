/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amshu
 */
public class Main {

    public static void main(String[] args) {
        Manage manage = new Manage();
        manage.lc.add(new Contact(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        manage.lc.add(new Contact(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        manage.lc.add(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
        while (true) {
            System.out.println("=====Contact Program=====");
            int choice = manage.Menu();
            switch (choice) {
                case 1:
                    manage.addContact();
                    break;
                case 2:
                    manage.displayAllContact();
                    break;
                case 3:
                    manage.deleteContact();
                    break;
                case 4:
                    return;
            }

        }
    }
}
