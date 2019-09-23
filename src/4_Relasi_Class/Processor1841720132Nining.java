/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jobsheet4.relasikelaspbo;

/**
 *
 * @author lenovo
 */
public class Processor1841720132Nining {
    private String mMerk;
    private double mCache;
    Processor1841720132Nining() {
        
    }
    
    Processor1841720132Nining(String merk, double cache){
        this.mMerk = merk;
        this.mCache = cache;
    }
    
    public String getmMerk() {
        return mMerk;
    }

    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public double getmCache() {
        return mCache;
    }

    public void setmCache(double mCache) {
        this.mCache = mCache;
    }
          
    public void info() {
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }
}
