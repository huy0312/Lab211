/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0065;

/**
 *
 * @author amshu
 */
public class Student {

    private String name;
    private String className;
    private double math;
    private double physic;
    private double chemistry;
    private char type;

    public Student() {
    }

    public Student(String name, String className, double math, double physic, double chemistry, char type) {
        this.name = name;
        this.className = className;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysic() {
        return physic;
    }

    public void setPhysic(double physic) {
        this.physic = physic;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

   

}
