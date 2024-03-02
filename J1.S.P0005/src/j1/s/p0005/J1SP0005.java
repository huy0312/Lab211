/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0005;

import java.util.Scanner;

/**
 *
 * @author amshu
 */
public class J1SP0005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array:");
        int length = scanner.nextInt();
        MergeSort ms = new MergeSort(length);
        System.out.print("Unsorted array:");
        ms.randomArr();
        ms.displayArr();
        ms.mergeSort();
        System.out.print("Sorted array:");
        ms.displayArr();
        
    }
    
}
