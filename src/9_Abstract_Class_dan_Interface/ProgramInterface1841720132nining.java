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
public class ProgramInterface1841720132nining {
    public static void main(String[] args) {
        Rektor1841720132nining pakRektor = new Rektor1841720132nining();
        
        //Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana1841720132nining sarjanaCumlaude = new Sarjana1841720132nining("Dini");
        PascaSarjana1841720132nining masterCumlaude = new PascaSarjana1841720132nining("Elok");
        
        //Rektor.beriSertifikatCumlaude(mahasiswaBiasa);
       // pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
