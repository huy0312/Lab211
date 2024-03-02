
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validate valid = new Validate();

        int length = valid.checkInputInt("Enter number of array:");

        BinarySearch binary = new BinarySearch(length);
        binary.randomArr();
        binary.displayArr();

        int key = valid.checkInputInt("Enter search value:");
        binary.setKey(key);

        binary.displaySearchIndex();

    }
}
