
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
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array:");
        int length = scanner.nextInt();
        SelectionSort ss = new SelectionSort(length);
        System.out.print("Unsorted array:");
        ss.randomArr();
        ss.displayArr();
        System.out.print("Sorted array:");
        ss.selectionSort();
        ss.displayArr();
    }
}
