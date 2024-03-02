/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0073;

/**
 *
 * @author amshu
 */
public class J1SP0073 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=======Handy Expense program======");
        Validate valid = new Validate();
        Manager manage = new Manager();
        while (true) {
            System.out.println("1.Add an expense");
            System.out.println("2.Display all expenses");
            System.out.println("3.Delete an expense");
            System.out.println("4.Quit");
            int choice = valid.checkIntInput("Enter choice:", 1, 4);
            switch (choice) {
                case 1:
                    manage.addExpense();
                    break;
                case 2:
                    manage.displayExpense();
                    break;
                case 3:
                    manage.deleteExpense();
                    break;
                case 4:
                    return;
            }

        }

    }

}
