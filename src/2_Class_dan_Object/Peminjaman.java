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
public class Peminjaman {
    private String id;
    private String namaPeminjam;
    private String namaGame;
    public int harga;
    public int sewa;
    public int hargaTotal;
    
    public void setId(String nilaiId) {
        id = nilaiId;
    }
    public void setNamaPeminjam(String nama) {
        namaPeminjam = nama;
    }
    public void setNamaGame(String namaGm) {
        namaGame = namaGm;
    }
    public int hargaTotal(int harga, int sewa) {
        hargaTotal = harga*sewa;
        return hargaTotal;
    }
    public void tampilData() {
        System.out.println("Id              : " +id);
        System.out.println("Nama Peminjam   : " +namaPeminjam);
        System.out.println("Nama Game       : " +namaGame);
        System.out.println("Harga           : " +harga);
        System.out.println("Sewa            : " +sewa);
        //System.out.println("Harga Total     : " +hargaTotal);
    }
}
