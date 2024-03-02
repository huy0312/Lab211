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
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your content:");
        String input = scanner.nextLine();
        Content ct = new Content(input);
        ct.analyze();
        ct.display();

    }
}
