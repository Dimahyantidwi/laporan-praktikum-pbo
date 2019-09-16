/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetternining;

/**
 *
 * @author lenovo
 */
public class Anggotanining {
    private String mnama;
    private String malamat;
    private float msimpanan;
    
    Anggotanining(String mnama, String malamat){
        this.mnama = mnama;
        this.malamat = malamat;
        this.msimpanan = 0;
    }
    
    public void setNamanining(String mnama){
        this.mnama = mnama;
    }
    public void setAlamatnining(String malamat){
        this.malamat = malamat;
    }
    public String getNamanining(){
        return mnama;
    }
    public String getAlamatnining(){
        return malamat;
    }
    public float getSimpanannining(){
        return msimpanan;
    }
    public void setornining(float uang){
        msimpanan += uang;
    }
    public void pinjam(float uang){
        msimpanan -= uang;
    }
}
