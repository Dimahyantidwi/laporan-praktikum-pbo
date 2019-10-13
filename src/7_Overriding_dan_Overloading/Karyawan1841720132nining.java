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
public class Karyawan1841720132nining {
    /**
     * @param args the command line arguments
     */
  //  public static void main(Strin[] args {
        // TODO code application logic here
    private String mnama;
    private String mnip;
    private String mgolongan;
    private double mgaji;
    
    public void setNama(String nama)
    {
        this.mnama=nama;
    }
    public void setNip(String nip)
    {
        this.mnip=nip;
    }
    public void setGolongan(String golongan)
    {
        this.mgolongan=golongan;
        
        switch(golongan.charAt(0)){
            case '1':this.mgaji=5000000;
                break;
            case '2':this.mgaji=3000000;
                break;
            case '3':this.mgaji=2000000;
                break;
            case '4':this.mgaji=1000000;
                break;
            case '5':this.mgaji=750000;
                break;
        }
    }
    public void setGaji(double gaji)
    {
        this.mgaji=gaji;
    }
    public String getNama()
    {
        return mnama;
    }
    public String getNip()
    {
        return mnip;
    }
    public String getGolongan()
    {
        return mgolongan;
    }
    public double getGaji()
    {
        return mgaji;
    }
}
