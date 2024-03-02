
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amshu
 */
public class Validate {

    private final static Scanner in = new Scanner(System.in);
    private static final String VALID_PHONE = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}"
            + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";

    //check user input string
    public static String checkInputString(String mess) {
        //loop until user input correct
        System.out.println(mess);
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    //check input int
    public static int checkInputInt(String mess, int max, int min) {
        //loop until user input correct
        System.out.println(mess);
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (Exception e) {
                System.err.println("Please input number from " + " " + min + " " + max);
                System.out.print("Enter again: ");
            }
        }
    }

    public static int checkInputId(String mess) {
        System.out.println(mess);
        while (true) {
            try {
                int id = Integer.parseInt(in.nextLine());
                return id;
            } catch (Exception e) {
                System.out.println("ID is a digit");
            }
        }
    }

    //check input phone
    public static String checkInputPhone(String mess) {
        //loop until user input correct
        System.out.println(mess);
        while (true) {
            String result = checkInputString("");
            if (result.matches(VALID_PHONE)) {
                return result;
            }
            System.err.println("Please input Phone flow\n"
                    + "• 1234567890\n"
                    + "• 123-456-7890 \n"
                    + "• 123-456-7890 x1234\n"
                    + "• 123-456-7890 ext1234\n"
                    + "• (123)-456-7890\n"
                    + "• 123.456.7890\n"
                    + "• 123 456 7890");
            System.out.print("Enter again: ");
        }
    }
}
