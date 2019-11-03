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
public class Tester11841720132nining {
    public static void main(String[] args) {
        PermanenEmployee1841720132nining pEmp = new PermanenEmployee1841720132nining("Dedik", 500);
        InternshipEmployee1841720132nining iEmp = new InternshipEmployee1841720132nining("Sunarto", 5);
        ElectricityBill1841720132nining eBill = new ElectricityBill1841720132nining(5, "A-1");
        Employee1841720132nining e;
        Payable1841720132nining p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
