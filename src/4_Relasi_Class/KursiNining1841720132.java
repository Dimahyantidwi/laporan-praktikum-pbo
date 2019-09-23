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
public class KursiNining1841720132 {
    private String mnomor;
    private PenumpangNining1841720132 mpenumpang;
    
    public KursiNining1841720132(String nomor){
         mnomor = nomor;
    }

    public String getMnomor() {
        return mnomor;
    }

    public void setMnomor(String mnomor) {
        this.mnomor = mnomor;
    }

    public PenumpangNining1841720132 getMpenumpang() {
        return mpenumpang;
    }

    public void setMpenumpang(PenumpangNining1841720132 mpenumpang) {
        this.mpenumpang = mpenumpang;
    }
    
    public String Info(){
        String info="";
        info+="Nomer    : "+mnomor+"\n";
        if(this.mpenumpang!=null){
            info += "Penumpang  : \n"+mpenumpang.Info()+"\n";
        }
        return info;
    }
}
