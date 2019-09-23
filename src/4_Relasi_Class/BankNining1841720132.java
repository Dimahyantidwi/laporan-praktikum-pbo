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
public class BankNining1841720132 {
    private int mkodeBank;
    private String mnamaBank;
    
    BankNining1841720132() {
        
    }
    public void setKodeBank(int kodeBank){
        this.mkodeBank = kodeBank;
    }
    public int getKodeBank() {
        return mkodeBank;
    }
    public void setNamaBank(String nama) {
        this.mnamaBank = nama;
    }
    public String getNamaBank() {
        return mnamaBank;
    }
    public void tampilData() {
        System.out.println("Kode Bank: " + mkodeBank);
        System.out.println("Nama Bank: " + mnamaBank);
        System.out.println("=========================");
    }
}
