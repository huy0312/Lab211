/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0056;

/**
 *
 * @author amshu
 */
public class AdjustWorker extends Worker implements Comparable<AdjustWorker> {

    private String status;
    private String date;

    public AdjustWorker() {
    }

    public AdjustWorker(String status, String date, String code, String name, int age, double salary, String workLocation) {
        super(code, name, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int compareTo(AdjustWorker o) {
        return this.getCode().compareTo(o.getCode());
    }

}
