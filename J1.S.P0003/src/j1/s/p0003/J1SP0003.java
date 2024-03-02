/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0003;

import java.util.Scanner;

/**
 *
 * @author amshu
 */
public class J1SP0003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array:");
        int length = scanner.nextInt();
        InsertionSort is = new InsertionSort(length);
        System.out.print("Unsorted array:");
        is.randomArr();
        is.displayArr();
        is.sort();
        System.out.print("Sorted array:");
        is.displayArr();
    }

}
