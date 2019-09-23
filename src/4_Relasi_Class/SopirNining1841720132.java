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
public class SopirNining1841720132 {
    private String mNama;
    private int mBiaya;
    public SopirNining1841720132(){   
    }
    
    public int hitungBiayaSopirNining(int hari){
        return mBiaya*hari;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public int getmBiaya() {
        return mBiaya;
    }

    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
}
