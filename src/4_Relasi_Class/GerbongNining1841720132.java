/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.percobaan4.relasikelaspbo;

/**
 *
 * @author lenovo
 */
public class GerbongNining1841720132 {
    private String mkode;
    private KursiNining1841720132 arraykursi[];
    

    public String getMkode() {
        return mkode;
    }

    public void setMkode(String mkode) {
        this.mkode = mkode;
    }

    public KursiNining1841720132[] getArraykursi() {
        return arraykursi;
    }

    public void setArraykursi(KursiNining1841720132 arraykursi[], int mnomor) {
        this.arraykursi[mnomor] = arraykursi[mnomor];
    }
    
    private void initKursi(){
        for (int i = 0; i < arraykursi.length; i++){
            this.arraykursi[i] = new KursiNining1841720132(String.valueOf(i+1));
        }
    }
    
    public GerbongNining1841720132(String kode, int jumlah){
        this.mkode = kode;
        this.arraykursi = new KursiNining1841720132[jumlah];
        this.initKursi();
    }
    
    public String Info(){
        String info="";
        info += "Kode   : "+mkode+"\n";
        for (KursiNining1841720132 KursiNining1841720132 : arraykursi){
            info += KursiNining1841720132.Info();
        }
        return info;
    }
    
    public void setPenumpang(PenumpangNining1841720132 mpenumpang, int nomor){
        this.arraykursi[nomor-1].setMpenumpang(mpenumpang);
    }
}
