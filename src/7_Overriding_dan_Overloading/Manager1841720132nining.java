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
public class Manager1841720132nining extends Karyawan1841720132nining {

    private double mtunjangan;
    private String mbagian;
    private Staff1841720132nining st[];

    public void setTunjangan(double tunjangan) {
        this.mtunjangan = tunjangan;
    }

    public double getTunjangan() {
        return mtunjangan;
    }

    public void setBagian(String bagian) {
        this.mbagian = bagian;
    }

    public String getBagian() {
        return mbagian;
    }

    public void setStaff(Staff1841720132nining st[]) {
        this.st = st;
    }

    public void viewStaff() {
        int i;
        System.out.println("--------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("--------------------");
    }

    public void lihatInfo() {
        System.out.println("Manager     : " + this.getBagian());
        System.out.println("NIP         : " + this.getNip());
        System.out.println("Nama        : " + this.getNama());
        System.out.println("Golongan    : " + this.getGolongan());
        System.out.printf("Tunjangan   : %.0f\n", this.getTunjangan());
        System.out.printf("Gaji        : %.0f\n", this.getGaji());
        System.out.println("Bagian      : " + this.getBagian());
        System.out.println("");
        this.viewStaff();
    }

    public double getGaji() {
        return super.getGaji() + mtunjangan;
    }
}
