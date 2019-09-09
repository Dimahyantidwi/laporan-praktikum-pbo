/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET2;

/**
 *
 * @author lenovo
 */
public class LingkaranTest {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        l1.phi = 3.14;
        l1.r = 20;
        l1.hitungLuasLingkaran();
        l1.hitungKelilingLingkaran();
        l1.tampilData();
    }
}
