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
public class KoperasiDemonining {
    public static void main(String[] args){
        Anggotanining anggotanng = new Anggotanining("Iwan","Jalan Mawar");
        System.out.println("Simpanan "+anggotanng.getNamanining()+ " : Rp "+anggotanng.getSimpanannining());
        
        anggotanng.setNamanining("Iwan Setiawan");
        anggotanng.setAlamatnining("Jalan Sukarno Hatta no 10");
        anggotanng.setornining(100000);
        System.out.println("Simpanan " +anggotanng.getNamanining()+ " : Rp "+anggotanng.getSimpanannining());
        
        anggotanng.pinjam(5000);
        System.out.println("Simpanan " +anggotanng.getNamanining()+ " : Rp "+anggotanng.getSimpanannining());
    }
}
