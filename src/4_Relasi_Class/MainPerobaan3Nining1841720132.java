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
public class MainPerobaan3Nining1841720132 {
    public static void main(String [] args){
        PegawaiNining1841720132 masinis = new PegawaiNining1841720132 ("1234", "Spongebob Squarepants");
        PegawaiNining1841720132 asisten = new PegawaiNining1841720132 ("4567", "Patrick Star");
        KeretaApiNining1841720132 keretaApi = new KeretaApiNining1841720132("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
