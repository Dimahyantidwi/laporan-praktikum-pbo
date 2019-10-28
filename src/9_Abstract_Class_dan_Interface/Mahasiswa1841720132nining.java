/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author lenovo
 */
public class Mahasiswa1841720132nining {
    public String mnama;

    public Mahasiswa1841720132nining(String nama) {
        this.mnama = nama;
    }

    public void kuliahDikampus() {
        System.out.println("Aku mahasiswa, namaku " + this.mnama);
        System.out.println("Aku berkuliah di kampus.");
    }

    void kuliahDiKampus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
