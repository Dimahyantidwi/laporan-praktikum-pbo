/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugas.relasikelaspbo;

/**
 *
 * @author lenovo
 */
public class PegawaiNiningg1841720132 {
    private String mnip;
    private String mnama;
    private String mjabatan;
    
    PegawaiNiningg1841720132() {
    }
    public void setNip(String nip) {
        this.mnip = nip;
    }
    public String getNip() {
        return mnip;
    }
    public void setNama(String nama) {
        this.mnama = nama;
    }
    public String getNama() {
        return mnama;
    }
    public void setJabatan(String jabatan) {
        this.mjabatan = jabatan;
    }
    public String getJabatan() {
        return mjabatan;
    }
    public void tampilData() {
        System.out.println("Nip: " +mnip);
        System.out.println("Nama: " +mnama);
        System.out.println("Jabatan: " +mjabatan);
        System.out.println("=======================");
    }
}
