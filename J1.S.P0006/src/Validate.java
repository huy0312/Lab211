
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

    Scanner scanner = new Scanner(System.in);

    public int checkInputInt(String mess) {
        System.out.println(mess);
        while (true) {
            String input = scanner.nextLine();
            try {
                int i = Integer.parseInt(input);
                return i;
            } catch (Exception e) {
                System.out.println("Wrong integer input !");
            }
        }
    }
}
