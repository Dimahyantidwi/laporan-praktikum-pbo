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
public class InternshipEmployee1841720132nining extends Employee1841720132nining{
    private int mlength;
    
    public InternshipEmployee1841720132nining(String name, int length){
        this.mlength = length;
        this.mname = name;
    }
    public int getLength(){
        return mlength;
    }
    public void setLength(int length){
        this.mlength = length;
    }
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as intership employee for "+mlength+" month/s\n";
        return info;
    }
}
