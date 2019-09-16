/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET3;

/**
 *
 * @author lenovo
 */
public class KoperasiDemoning {

    public static void main(String[] args) {
        AnggotaNining donny = new AnggotaNining(111333444, "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNamaning());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjamanning());
        System.out.println("\nMeminjam uang 10000000");
        donny.pinjamning(10000000);
        System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahPinjamanning());
        System.out.println("\nMeminjam uang 4000000");
        donny.pinjamning(4000000);
        System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahPinjamanning());
        System.out.println("\nMembayar angsuran 1000000");
        donny.angsur(1000000);
        System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahPinjamanning());
        System.out.println("\nMembayar angsuran 3000000");
        donny.angsur(3000000);
        System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahPinjamanning());
    }
}
