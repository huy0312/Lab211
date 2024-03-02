/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0008;

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
            String input = scanner.nextLine();
            try {
                if (input.isEmpty()) {
                    System.err.println("Content can't be empty!");
                }
            } catch (Exception e) {
                System.out.println("Wrong input!");
            }
        }
    }
}
