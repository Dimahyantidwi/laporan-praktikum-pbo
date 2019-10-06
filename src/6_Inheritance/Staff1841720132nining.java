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
public class Staff1841720132nining extends Karyawan1841720132nining {

    public int mlembur, mpotongan;

    public Staff1841720132nining() {
    }

    public Staff1841720132nining(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.mlembur = lembur;
        this.mpotongan = potongan;
    }

    public void tampilDataStaff() {
        super.tampilDataKaryawan();
        System.out.println("Lembur \t\t: " + mlembur);
        System.out.println("Potongan \t: " + mpotongan);
        System.out.println("Total Gaji \t: " + (mgaji + mlembur - mpotongan));
    }
}
