/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nining.percobaan4;

/**
 *
 * @author lenovo
 */
import java.util.ArrayList;

public class InputData1841720132nining {
    ArrayList<Mahasiswa1841720132nining> ListMahasiswa;
    
    public InputData1841720132nining() {
        ListMahasiswa = new ArrayList();
    }
    public void isiData (String Nim, String Nama, String Alamat) {
        Mahasiswa1841720132nining mhs = new Mahasiswa1841720132nining (Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa1841720132nining> getData() {
        return ListMahasiswa;
    }
}
