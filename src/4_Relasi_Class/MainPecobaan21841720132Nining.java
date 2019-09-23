/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.percobaan2.relasikelaspbo;

/**
 *
 * @author lenovo
 */
public class MainPecobaan21841720132Nining {
    public static void main(String[] args){
        MobilNining1841720132 m = new MobilNining1841720132();
        m.setmMerk("Avanza");
        m.setmBiaya(350000);
        SopirNining1841720132 s = new SopirNining1841720132();
        s.setmNama("John Doe");
        s.setmBiaya(200000);
        PelangganNining p = new PelangganNining();
        p.setMnama("Jane Doe");
        p.setMmobil(m);
        p.setMsopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = "+ p.hitungBiayaTotal());
            
    } 
}
