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
public class NasabahNining1841720132 {
    private String mnama;
    private String mnoRekening;
    private String mktp;
    private double msaldo;
    
    NasabahNining1841720132() {
    }
    public void setNama(String nama) {
        this.mnama = nama;
    }
    public void setNoRekening(String noRekening) {
        this.mnoRekening = noRekening;
    }
    public String getNoRekening() {
        return mnoRekening;
    }
    public void setKtp(String ktp) {
        this.mktp = ktp;
    }
    public String getKtp() {
        return mktp;
    }
    public void setSaldo(int saldo) {
        this.msaldo =  saldo;
    }
     public double getSaldo() {
        return msaldo;
    }
    public String getNama() {
        return mnama;
    }
    public void tampilData() {
        System.out.println("Nama: " +mnama);
        System.out.println("Nomor Rekening: " +mnoRekening);
        System.out.println("KTP: " +mktp);
        System.out.println("Saldo: " +msaldo);
        System.out.println("=================================");
    }
}
