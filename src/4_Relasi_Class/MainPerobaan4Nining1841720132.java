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
public class MainPerobaan4Nining1841720132 {
    public static void main(String[] args){
        PenumpangNining1841720132 p = new PenumpangNining1841720132("12345", "Mr.Krab");
        GerbongNining1841720132 gerbong = new GerbongNining1841720132("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.Info());
    }
}
