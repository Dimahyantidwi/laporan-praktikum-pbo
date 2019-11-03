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
public class Owner1841720132nining {
     public void pay(Payable1841720132nining p){
        System.out.println("Total payment ="+p.getPaymentAmount());
        if(p instanceof ElectricityBill1841720132nining){
            ElectricityBill1841720132nining eb=(ElectricityBill1841720132nining)p;
            System.out.println(""+eb.getBillInfo());
        }else if(p instanceof PermanenEmployee1841720132nining ){
            PermanenEmployee1841720132nining pe = (PermanenEmployee1841720132nining )p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee1841720132nining e){
        System.out.println(""+e.getEmployeeInfo());
        if(e instanceof PermanenEmployee1841720132nining )
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
