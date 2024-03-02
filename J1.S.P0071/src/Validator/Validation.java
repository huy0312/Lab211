/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validator;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author amshu
 */
public class Validation {

    Scanner scanner = new Scanner(System.in);

    public int checkInputInt(String mess, int min, int max) {
        System.out.print(mess);
        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);

                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an integer number: ");
            }
        }
    }

    public double checkInputDouble(String mess, double min, double max) {
        System.out.print(mess);

        while (true) {
            String input = scanner.nextLine();
            try {
                double number = Double.parseDouble(input);
                if (number % 0.5 != 0) {
                    System.out.println("Please input .5 or integer number");
                    continue;
                }
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an double number: ");
            }
        }
    }

    public String checkInputString(String mess, String regex) {
        System.out.print(mess);
        while (true) {
            String input = scanner.nextLine();
            if (!input.matches(regex)) {
                System.out.print("Please input match regex: " + regex);
                continue;
            }
            if (input.trim().isEmpty()) {
                System.out.print("Please input a non-empty string: ");
                continue;
            }
            return input;
        }
    }

    public String checkInputDate(String mess) {
        System.out.print(mess);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);

        while (true) {
            String input = scanner.nextLine();
            try {
                Date date = dateFormat.parse(input);
                Date curDate = Calendar.getInstance().getTime();
                if (curDate.compareTo(date) < 0) {
                    System.out.print("Please input date that before current date: ");
                    continue;
                }
                dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                return dateFormat.format(date);
            } catch (Exception e) {
                System.out.print("Please input valid date (dd-MM-yyyy): ");
            }
        }
    }

}
