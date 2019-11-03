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
public class Tester21841720132nining {
    public static void main(String[] args) {
        PermanenEmployee1841720132nining pEmp = new PermanenEmployee1841720132nining("Dedik", 500);
        Employee1841720132nining e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("----------------------");
        System.out.println("" +pEmp.getEmployeeInfo());
    }
}
