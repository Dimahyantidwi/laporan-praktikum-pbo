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
public class StaffTetap1841720132nining extends Staff1841720132nining {

    public String mgolongan;
    public int masuransi;

    public StaffTetap1841720132nining() {
    }

    public StaffTetap1841720132nining(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.mgolongan = golongan;
        this.masuransi = asuransi;
    }

    public void tampilStaffTetap() {
        System.out.println("=============================== Data Staff Tetap ===============================");
        super.tampilDataStaff();
        System.out.println("Golongan \t: " + mgolongan);
        System.out.println("Jumlah Asuransi : " + masuransi);
        System.out.println("Gaji Bersih \t: " + (mgaji + mlembur - mpotongan - masuransi));
    }
}
