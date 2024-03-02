/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0003;

import java.util.Random;

/**
 *
 * @author amshu
 */
public class InsertionSort {

    private int[] arr;
    private int length;

    public InsertionSort() {
    }

    public InsertionSort(int length) {
        this.length = length;
    }

    public int[] randomArr() {
        arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(length);
        }
        return arr;
    }

    public void sort() {
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void displayArr() {
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
            if (i != length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
