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
public class RekeningNining1841720132 {
    private String mnoRekening;
    private double msaldoAwal;
    private double msaldoAkhir;
    
    RekeningNining1841720132() {
    }
    public void setNoRekening(String noRekening) {
        this.mnoRekening = noRekening;
    }
    public String getNoRekening() {
        return mnoRekening;
    }
    public void setSaldoAwal(double saldo) {
        this.msaldoAwal = saldo;
    }
    public double getSaldoAwal() {
        return msaldoAwal;
    }
    public void setSaldoAkhir(double saldoAkhir) {
        this.msaldoAkhir = saldoAkhir;
    }
    public double getSaldoAkhir() {
        return msaldoAkhir;
    }
    public void tampilData() {
        System.out.println("Nomor Rekening: " +mnoRekening);
        System.out.println("Saldo Awal: " +msaldoAwal);
        System.out.println("Saldo Akhir: " +msaldoAkhir);
        System.out.println("===============================");
    }
}
