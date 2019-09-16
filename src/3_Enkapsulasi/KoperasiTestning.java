/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET3;
import java.util.Scanner;
public class KoperasiTestning {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nomor KTP: ");
        int noKTP = sc.nextInt();
        System.out.print("Masukkan Nama: ");
        String nama = s.nextLine();
        System.out.println("Masukkan Limit Peminjaman: ");
        int limitPinjaman = sc.nextInt();
        AnggotaNining a1 = new AnggotaNining(noKTP, nama, limitPinjaman);
        int pilihan;
        do {
            System.out.println("1. Pinjam");
            System.out.println("2. Angsur");
            System.out.println("3. Lihat jumlah Pinjaman");
            System.out.println("4. Cetak Data");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah pinjaman : ");
                    int pinjam = sc.nextInt();
                    a1.pinjamning(pinjam);
                    break;
                case 2:
                    System.out.print("Masukkan angsuran : ");
                    int angsur = sc.nextInt();
                    a1.angsur(angsur);
                    break;

                case 3:
                    System.out.print("Sisa Pinjaman: " + a1.getJumlahPinjamanning());
                    break;
                case 4:
                    System.out.println("Nama : " + a1.getNamaning());
                    System.out.println("No KTP : " + a1.getNoKTPning());
                    System.out.println("Limit Peminjaman : " + a1.getLimitPinjamanning());
                    System.out.println("Sisa Pinjaman : " + a1.getJumlahPinjamanning());
            }
        } while (pilihan != 5);
    }
}
