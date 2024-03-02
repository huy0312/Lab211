/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0065;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amshu
 */
public class Manage {

    List<Student> students = new ArrayList<>();
    Student st = new Student();
    Validate valid = new Validate();
    
  
    public void addStudent(){
      String name = valid.checkInputString("Name:");
      String className = valid.checkInputString("Class:");
      double math = valid.checkInputMark("Math:");
      double chemistry = valid.checkInputMark("Chemistry:");
      double physic = valid.checkInputMark("Physic:");
    
    }
    
}
