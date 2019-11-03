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
public class Tester41841720132nining {
    public static void main(String[] args) {
        Owner1841720132nining ow = new Owner1841720132nining();
        ElectricityBill1841720132nining eBill = new ElectricityBill1841720132nining(5, "R-1");
        ow.pay(eBill);//pay for electricity bill
        System.out.println("-------------------------------");
        
        PermanenEmployee1841720132nining pEmp = new PermanenEmployee1841720132nining ("Dedik", 500);
        ow.pay(pEmp);//pay for permanent employee
        System.out.println("-------------------------------");
        
        InternshipEmployee1841720132nining iEmp = new InternshipEmployee1841720132nining("Sunarto", 5);
        ow.showMyEmployee(pEmp);//show permanent employee info
        System.out.println("-------------------------------");
        ow.showMyEmployee(iEmp);//show internship employee info
    }
}
