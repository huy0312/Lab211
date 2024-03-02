/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0073;

import java.util.Scanner;

/**
 *
 * @author amshu
 */
public class Validate {

    Scanner scanner = new Scanner(System.in);
    private static final String DATE_VALID = "^\\d{1}|[0-3]{1}\\d{1}-[a-zA-Z]{3}-\\d{4}$";

    public int checkIntInput(String mess, int min, int max) {
        System.out.println(mess);
        while (true) {
            try {
                String input = scanner.nextLine();
                int i = Integer.parseInt(input);
                if (i < min || i > max) {
                    System.out.println("Wrong input, please enter from" + " " + min + " " + "to" + " " + max);
                }
                return i;
            } catch (Exception e) {
                System.err.println("Re-input!");
            }

        }
    }

    public int checkInputId(String mess) {
        System.out.println(mess);
        while (true) {
            try {
                String input = scanner.nextLine();
                int id = Integer.parseInt(input);
                return id;
            } catch (Exception e) {
                System.out.println("ID is a digit");
            }
        }
    }

    public String checkInputDate(String mess) {
        System.out.println(mess);
        while (true) {
            try {
                String result = scanner.nextLine().trim();
                if (result.matches(DATE_VALID)) {
                    return result;
                } else {
                    System.err.println("Re-input");
                }
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    public double checkInputDouble(String mess) {
        System.out.println(mess);
        while (true) {
            try {
                String input = scanner.nextLine();
                double i = Double.parseDouble(input);
                return i;

            } catch (Exception e) {
                System.err.println("Re-input !");
            }
        }
    }

    public String checkStringInput(String mess) {
        System.out.println(mess);
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.length() == 0) {
                System.err.println("Can't be empty");
            } else {
                return input;
            }
        }
    }

}
