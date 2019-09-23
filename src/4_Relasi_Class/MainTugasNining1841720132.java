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
public class MainTugasNining1841720132 {
    public static void main(String[] args) {
        BankNining1841720132 b = new BankNining1841720132();
        b.setKodeBank(1002);
        b.setNamaBank("Bank BPRS");
        b.tampilData();
        
        PegawaiNining1841720132 p = new PegawaiNining1841720132();
        p.setNama("Ningsih"); 
        p.setNama("Lestari");
        p.setNip("123456");
        p.setJabatan("Teller");
        p.tampilData();
        
        NasabahNining1841720132 m = new NasabahNining1841720132();
        m.setNama("Dimahyanti dwi");
        m.setNoRekening("1841720132"); 
        m.setKtp("132145167899"); 
        m.setSaldo(3500000);
        m.tampilData();
        
        RekeningNining1841720132 s = new RekeningNining1841720132();
        s.setNoRekening("1122334455");
        s.setSaldoAwal(5000000);
        s.setSaldoAkhir(3000000);
        s.tampilData();
        
    }
}
