/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend1841720132nining;

/**
 *
 * @author lenovo
 */
import backend1841720132nining.*;
public class TestBackend1841720132nining {
    
    public static void main(String[] args) {
        Kategori1841720132nining kat1 = new Kategori1841720132nining("Novel", "Koleksi buku novel");
        Kategori1841720132nining kat2 = new Kategori1841720132nining("Referensi", "Buku referensi ilmiah");
        Kategori1841720132nining kat3 = new Kategori1841720132nining("Komik", "Komik anak-anak");
        
        //test insert
        kat1.save();
        kat2.save();
        kat3.save();
        
        //test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();
        
        //test delete
        kat3.delete();
        
        //test select all
        for(Kategori1841720132nining k : new Kategori1841720132nining().getAll()){
            System.out.println("Nama: "+k.getNama()+", Ket: "+k.getKeterangan());
        }
        
        //test search
        for(Kategori1841720132nining k : new Kategori1841720132nining().search("ilmiah")){
            System.out.println("Nama: "+k.getNama()+", Ket: "+k.getKeterangan());
        }
    }
}
