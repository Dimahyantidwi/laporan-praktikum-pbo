/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET7;

/**
 *
 * @author lenovo
 */
public class Staff1841720132nining extends Karyawan1841720132nining{
    private int mlembur;
    private double mgajilembur;
    
    public void setLembur(int lembur)
    {
        this.mlembur=lembur;
    }
    public int getLembur()
    {
        return mlembur;
    }
    public void setGajiLembur(double gajiLembur)
    {
        this.mgajilembur=gajiLembur;
    }
    public double getGajiLembur()
    {
        return mgajilembur;
    }
    public double getGaji(int lembur, double gajiLembur)
    {
        return super.getGaji()+lembur*gajiLembur;
    }
    public double getGaji()
    {
        return super.getGaji()+mlembur*mgajilembur;
    }
    public void lihatInfo()
    {
        System.out.println("NIP :"+this.getNip());
        System.out.println("Nama    :"+this.getNama());
        System.out.println("Golongan    :"+this.getGolongan());
        System.out.println("Jml Lembur  :"+this.getLembur());
        System.out.printf("Gaji Lembur :%.0f\n", this.getGajiLembur());
        System.out.printf("Gaji :%.0f\n", this.getGaji());
    }
}
