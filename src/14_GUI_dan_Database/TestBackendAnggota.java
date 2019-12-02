/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend1841720132nining;

import backend1841720132nining.Anggota1841720132nining;

/**
 *
 * @author ASUS
 */
public class TestBackendAnggota {
    public static void main(String[] args) {
        Anggota1841720132nining agt1 = new Anggota1841720132nining("Ica", "Jepang", "087757355754");
        Anggota1841720132nining agt2 = new Anggota1841720132nining("Mita", "Korea", "085975947857");
        Anggota1841720132nining agt3 = new Anggota1841720132nining("Nining", "Paris", "089698804036");
        
        //test insert
        agt1.save();
        agt2.save();
        agt3.save();
        
        //test update
        agt2.setAlamat("Sulawesi Selatan");
        agt2.save();
        
        //test delete
        agt3.delete();
        
        //tes select all
        for(Anggota1841720132nining k : new Anggota1841720132nining().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Alamat : " + k.getAlamat() + ", Telepon : " + k.getTelepon());
        }
        
        //test search
        for(Anggota1841720132nining a : new Anggota1841720132nining().search("Selatan")){
            System.out.println("Nama: " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }
}
