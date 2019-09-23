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
public class PegawaiNining1841720132 {
    private String mnip, mnama;
    public PegawaiNining1841720132(String mnip, String mnama){
        this.mnip = mnip;
        this.mnama = mnama;
    }

    public String getMnip() {
        return mnip;
    }

    public void setMnip(String mnip) {
        this.mnip = mnip;
    }

    public String getMnama() {
        return mnama;
    }

    public void setMnama(String mnama) {
        this.mnama = mnama;
    }
    
    public String Info(){
        String info="";
        info +="Nip : "+this.mnip+"\n";
        info +="Nama : "+this.mnama+"\n";
        return info;
    }
    
}
