/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET10;

/**
 *
 * @author lenovo
 */
public class PermanenEmployee1841720132nining extends Employee1841720132nining implements Payable1841720132nining{
    private int msalary;
    
    public PermanenEmployee1841720132nining(String name, int salary) {
        this.mname = name;
        this.msalary = salary;
    }
    public int getSalary() {
        return msalary;
    }
    
    @Override
    public int getPaymentAmount() {
        return (int) (msalary+0.5*msalary);
    }
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent employee with salary " +msalary+"\n";
        return info;
    }
}
