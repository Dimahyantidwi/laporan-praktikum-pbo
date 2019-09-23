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
public class PelangganNining {
    private String mnama;
    private MobilNining1841720132 mmobil;
    private SopirNining1841720132 msopir;
    private int hari;
    public PelangganNining(){
    }

    public String getMnama() {
        return mnama;
    }

    public void setMnama(String mnama) {
        this.mnama = mnama;
    }

    public MobilNining1841720132 getMmobil() {
        return mmobil;
    }

    public void setMmobil(MobilNining1841720132 mmobil) {
        this.mmobil = mmobil;
    }

    public SopirNining1841720132 getMsopir() {
        return msopir;
    }

    public void setMsopir(SopirNining1841720132 msopir) {
        this.msopir = msopir;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotal(){
        return mmobil.hitungbiayamobilNining(hari) + msopir.hitungBiayaSopirNining(hari);
    }
}
