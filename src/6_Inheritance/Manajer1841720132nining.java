/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET6;

/**
 *
 * @author lenovo
 */
public class Manajer1841720132nining extends Karyawan1841720132nining{

    public int mtunjangan;

    public Manajer1841720132nining() {
    }

    public void tampilDataManager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan \t: " + mtunjangan);
        System.out.println("Total Gaji \t: " + (super.mgaji + mtunjangan));
    }
}
