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
public class StaffHarian1841720132nining extends Staff1841720132nining {

    public int mjmlJamKerja;

    public StaffHarian1841720132nining() {
    }

    public StaffHarian1841720132nining(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.mjmlJamKerja = jmlJamKerja;
    }

    public void tampilStaffharian() {
        System.out.println("======================== Data Staff Harian ========================");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja : " + mjmlJamKerja);
        System.out.println("Gaji Bersih \t: " + (mgaji * mjmlJamKerja + mlembur - mpotongan));
    }
}
