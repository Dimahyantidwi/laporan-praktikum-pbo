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
public class Karyawan1841720132nining {

    public String mnama, malamat, mjk;
    public int mumur, mgaji;

    public Karyawan1841720132nining() {
    }

    public Karyawan1841720132nining(String nama, String alamat, String jk, int umur, int gaji) {
        this.mnama = nama;
        this.malamat = alamat;
        this.mjk = jk;
        this.mumur = umur;
        this.mgaji = gaji;
    }

    public void tampilDataKaryawan() {
        System.out.println("Nama \t\t: " + mnama);
        System.out.println("Alamat \t\t: " + malamat);
        System.out.println("Jenis Kelamin \t: " + mjk);
        System.out.println("Umur \t\t: " + mumur);
        System.out.println("Gaji \t\t: " + mgaji);
    }
}

