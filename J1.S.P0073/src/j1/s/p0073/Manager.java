/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0073;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amshu
 */
public class Manager {

    Validate valid = new Validate();
    List<Expense> el = new ArrayList<>();

    public void addExpense() {
        System.out.println("-------- Add an expense--------");
        int id;
        if (el.isEmpty()) {
            id = 1;
        } else {
            id = el.get(el.size() - 1).getId() + 1;
        }
        String date = valid.checkInputDate("Enter Date:");
        double money = valid.checkInputDouble("Enter amount of money:");
        String content = valid.checkStringInput("Enter content:");
        el.add(new Expense(id, date, money, content));
        System.out.println("Added expense successfully!");

    }

    public void displayExpense() {
        System.out.println("---------Display all expenses------------");
        if (el.isEmpty()) {
            System.err.println("There is no expense !");
        }
        double total = 0;
        System.out.printf("%-7s%-20s%-20s%-20s\n", "ID", "Date", "Amount of money", "Content");
        for (int i = 0; i < el.size(); i++) {
            System.out.printf("%-7d%-20s%-20.0f%-20s\n", el.get(i).getId(), el.get(i).getDate(),
                    el.get(i).getMoney(), el.get(i).getContent());
            total += el.get(i).getMoney();
        }
        System.out.printf("Total:%-20.0f\n", total);
    }

    public void deleteExpense() {
        System.out.println("--------Delete an expense------");
        int id = valid.checkInputId("Enter ID:");

        Expense deleteExpense = null;

        for (Expense expense : el) {
            if (expense.getId() == id) {
                deleteExpense = expense;
                break;
            }
        }
        if (deleteExpense != null) {
            el.remove(deleteExpense);
            System.out.println("Delete successfully!");
        } else {
            System.err.println("Delete an expense fail");
        }

    }
}
