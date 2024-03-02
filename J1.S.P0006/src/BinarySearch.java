
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amshu
 */
public class BinarySearch {

    private int[] arr;
    private int length;
    private int key;

    public BinarySearch(int length) {
        this.length = length;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public BinarySearch() {
    }

    public int[] randomArr() {
        arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(length);
        }
        Arrays.sort(arr); // Sort the array for binary search
        return arr;
    }

    public int searchIndex() {
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public void displayArr() {
        System.out.print("Sorted array:[");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
            if (i != length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void displaySearchIndex() {
        int index = searchIndex();
        if (index != -1) {
            System.out.println("Found" + " " + key + " " + "at index:" + " " + index);
        } else {
            System.out.println("Index not found !");
        }
    }
}
