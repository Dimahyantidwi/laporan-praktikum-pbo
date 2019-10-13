/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET7;

/**
 *
 * @author lenovo
 */
public class MainSegitiga1841720132nining {
    public static void main(String[] args) {
        Segitiga1841720132nining sg = new Segitiga1841720132nining();
        sg.totalSudut(120);
        sg.totalSudut(45, 30);
        sg.keliling(4, 3, 2);
        sg.keliling(4, 5);
        System.out.println("Total sudut :"+sg.totalSudut(120));
        System.out.println("Total sudut :"+sg.totalSudut(45, 30));
        System.out.println("keliling :"+sg.keliling(4, 3, 2));
        System.out.println("c :"+sg.keliling(4, 5));
    }   
}
