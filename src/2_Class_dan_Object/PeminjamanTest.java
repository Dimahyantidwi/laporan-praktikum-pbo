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
public class PeminjamanTest {
    public static void main(String[] args) {
        Peminjaman p1 = new Peminjaman();
        p1.setId("A123");
        p1.setNamaPeminjam("Farel");
        p1.setNamaGame("Harvest Moon Back to Nature");
        p1.harga = 25000;
        p1.sewa = 3;
        p1.tampilData();
        System.out.println("Harga Total     : " +p1.hargaTotal(25000, 3));
    }
}
