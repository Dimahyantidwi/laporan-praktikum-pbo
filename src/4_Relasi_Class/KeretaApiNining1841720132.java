/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.percobaan3.RelasiPBO;

/**
 *
 * @author lenovo
 */
public class KeretaApiNining1841720132 {
    private String mnama, mkelas;
    private PegawaiNining1841720132 mmasinis,masisten;
    
    public KeretaApiNining1841720132(String mnama, String mkelas, PegawaiNining1841720132 mmasinis, PegawaiNining1841720132 masisten){
        this.mnama = mnama;
        this.mkelas = mkelas;
        this.mmasinis = mmasinis;
        this.masisten = masisten;
    }

    public String getMnama() {
        return mnama;
    }

    public void setMnama(String mnama) {
        this.mnama = mnama;
    }

    public String getMkelas() {
        return mkelas;
    }

    public void setMkelas(String mkelas) {
        this.mkelas = mkelas;
    }

    public PegawaiNining1841720132 getMmasinis() {
        return mmasinis;
    }

    public void setMmasinis(PegawaiNining1841720132 mmasinis) {
        this.mmasinis = mmasinis;
    }

    public PegawaiNining1841720132 getMasisten() {
        return masisten;
    }

    public void setMasisten(PegawaiNining1841720132 masisten) {
        this.masisten = masisten;
    }
    
    public String info(){
        String info = "";
        info +="Nama    : "+this.mnama+"\n";
        info +="Kelas   : "+this.mkelas+"\n";
        info +="Masinis : \n"+this.mmasinis.Info()+"\n";
        info +="Asisten : \n"+this.mmasinis.Info()+"\n";
        return info;
    }
}
