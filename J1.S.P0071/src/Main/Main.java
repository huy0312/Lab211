/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Manager;
import Validator.Validation;

/**
 *
 * @author amshu
 */
public class Main {
    public static void main(String[] args) {
        Validation valid = new Validation();
        Manager manage = new Manager();
        System.out.println("====Task Managment====");
        while(true){
            System.out.println("1.Add Task");
            System.out.println("2.Delete Task");
            System.out.println("3.Show Task");
            System.out.println("4.Exit!");
            int choice = valid.checkInputInt("Enter your choice: ", 1, 4);
            switch(choice){
                case 1:
                    manage.addTask();
                    break;
                case 2:
                    manage.deleteTask();
                    break;
                case 3:
                    manage.displayTask();
                    break;
                case 4: 
                    System.exit(0);
            
            }
        
            
        
        }
    }
}
