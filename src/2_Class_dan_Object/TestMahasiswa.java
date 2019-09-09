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
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        
        mhs2.nim = 102;
        mhs2.nama = "Ningsih";
        mhs2.alamat = "Jl. Kembang Turi No 15C";
        mhs2.kelas = "2C";
        mhs2.tampilBiodata();
        
        mhs3.nim = 103;
        mhs3.nama = "Dwi";
        mhs3.alamat = "Jl. Anggrek No 8B";
        mhs3.kelas = "2F";
        mhs3.tampilBiodata();
    }
}
