/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0005;

import java.util.Random;

/**
 *
 * @author amshu
 */
public class MergeSort {

    private int[] arr;
    private int length;

    public MergeSort() {
    }

    public MergeSort(int length) {
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

    public void mergeSort() {
        int[] tempArray = new int[length];
        mergeSortCalculator(0, length - 1, tempArray);
    }

    private void mergeSortCalculator(int low, int high, int[] tempArray) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSortCalculator(low, middle, tempArray);
            mergeSortCalculator(middle + 1, high, tempArray);
            merge(low, middle, high, tempArray);
        }
    }

    private void merge(int low, int middle, int high, int[] tempArray) {
        for (int i = low; i <= high; i++) {
            tempArray[i] = arr[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                arr[k] = tempArray[i];
                i++;
            } else {
                arr[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            arr[k] = tempArray[i];
            k++;
            i++;
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
