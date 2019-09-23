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
public class PenumpangNining1841720132 {
    private String mktp, mnama;
    
    public PenumpangNining1841720132(String ktp, String nama){
        this.mktp = ktp;
        this.mnama = nama;
    }

    public String getMktp() {
        return mktp;
    }

    public void setMktp(String mktp) {
        this.mktp = mktp;
    }

    public String getMnama() {
        return mnama;
    }

    public void setMnama(String mnama) {
        this.mnama = mnama;
    }
    
    public String Info(){
        String info="";
        info+="Ktp    : "+mktp+"\n";
        info+="Nama   : "+mnama+"\n";
        return info;
    }
}
