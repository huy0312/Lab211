/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Task;
import Validator.Validation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amshu
 */
public class Manager {

    List<Task> taskList = new ArrayList<>();
    Validation valid = new Validation();

    public String getTaskType() {
        System.out.println("Choose task type");
        System.out.println("1. Code");
        System.out.println("2. Test");
        System.out.println("3. Manage");
        System.out.println("4. Learn");
        int choice = valid.checkInputInt("Enter your choice:", 1, 4);
        String option = null;
        switch (choice) {
            case 1:
                option = "Code";
                break;
            case 2:
                option = "Test";
                break;
            case 3:
                option = "Manage";
                break;
            case 4:
                option = "Learn";
        }
        return option;
    }

    public void addTask() {
        int Id;
        if (taskList.isEmpty()) {
            Id = 1;

        } else {
            Id = taskList.get(taskList.size() - 1).getId() + 1;
        }
        String requirementName = valid.checkInputString("Enter requirement name:", "[A-Za-z0-9\\s]+");
        String taskTypeId = getTaskType();
        String date = valid.checkInputDate("Enter Date:");
        double planFrom = valid.checkInputDouble("Enter plan from: ", 0, 17);
        double planTo = valid.checkInputDouble("Enter plan to : ", planFrom + 0.5, 17.1);
        String assignee = valid.checkInputString("Enter assignee name: ", "[A-Za-z0-9\\s]+");
        String reviewer = valid.checkInputString("Enter reviewer name: ", "[A-Za-z0-9\\s]+");
        taskList.add(new Task(Id, requirementName, taskTypeId, date, planFrom, planTo, assignee, reviewer));
    }

    public void deleteTask() {
        int Id = valid.checkInputInt("Enter Id to delete:", Integer.MIN_VALUE, Integer.MAX_VALUE);
        for (Task task : taskList) {
            if (task.getId() == Id) {
                taskList.remove(task);
                System.out.println("Remove successfully!");
                return;
            }
        }System.err.println("Cant find ID ! ");
    }

    public void displayTask() {
        if (taskList.isEmpty()) {
            System.err.println("No task exist!");

        } else {
            System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Name", "Task Type", "Date", "Time", "Assign", "Reviewer");
        }
        for (Task task : taskList) {
            double time = task.getPlanTo() - task.getPlanFrom();
            System.out.printf("%-5d%-15s%-15s%-15s%-15.1f%-15s%-15s\n",
                    task.getId(),
                    task.getRequirementName(),
                    task.getTaskTypeId(),
                    task.getDate(),
                    time,
                    task.getAssignee(),
                    task.getReviewer()
            );

        }

    }

}
