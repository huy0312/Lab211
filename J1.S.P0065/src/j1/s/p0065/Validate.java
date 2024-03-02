/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0065;

import java.util.Scanner;

/**
 *
 * @author amshu
 */
public class Validate {

    Scanner scanner = new Scanner(System.in);

    public String checkInputString(String mess) {
        System.out.println(mess);
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.err.println("Can't be empty, try again !");
            } else {
                return input;
            }
        }
    }

    public int checkInputMark(String mess) {
        System.out.println(mess);
        while (true) {
            String input = scanner.nextLine();
            try {
                int mark = Integer.parseInt(input);
                if (mark < 0) {
                    System.out.println(mess + "is greater than equal zero");
                    System.out.println(mess + ":");
                    continue;
                }
                if (mark > 0) {
                    System.out.println(mess + " less than equal ten");
                    System.out.println(mess + ":");
                    continue;
                }
                return mark;

            } catch (Exception e) {
                System.out.println(mess + " is a digit");
                System.out.println(mess + ":");
            }
        }
    }

    public boolean checkYN() {
        while (true) {
            String result = checkInputString("");
            if (result.length() == 1) {
                char resultChar = result.charAt(0);
                if (resultChar == 'y' || resultChar == 'Y') {
                    return true;
                }
                if (resultChar == 'n' || resultChar == 'N') {
                    return false;
                }
            }
            System.err.println("Re-input");
        }
    }

}
