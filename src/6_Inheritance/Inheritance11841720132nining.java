/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET6;

/**
 *
 * @author lenovo
 */
public class Inheritance11841720132nining {

    public static void main(String[] args) {
        //TODO code application logic here 
        Manajer1841720132nining M = new Manajer1841720132nining();
        M.mnama = "Vivin";
        M.malamat = "Jl. Vinolia";
        M.mumur = 25;
        M.mjk = "Perempuan";
        M.mgaji = 3000000;
        M.mtunjangan = 1000000;
        M.tampilDataManager();
        Staff1841720132nining S = new Staff1841720132nining();
        S.mnama = "Lestari";
        S.malamat = "Malang";
        S.mumur = 25;
        S.mjk = "Perempuan";
        S.mgaji = 2000000;
        S.mlembur = 500000;
        S.mpotongan = 250000;
        S.tampilDataStaff();
    }
}
