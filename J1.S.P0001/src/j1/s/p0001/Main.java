/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0001;

import java.util.Scanner;

/**
 *
 * @author amshu
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validate valid = new Validate();
        int length = valid.checkInputInt("Enter number of array:");

        BubbleSort bubbleSort = new BubbleSort(length);

        bubbleSort.randomArr();

        System.out.print("Sorted array:");
        bubbleSort.displayArr();

        System.out.print("Unsorted array:");
        bubbleSort.displayArr();

        bubbleSort.sort();

        scanner.close();
    }
}
