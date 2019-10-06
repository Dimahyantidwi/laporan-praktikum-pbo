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
public class InheritanceMain1841720132nining {

    public static void main(String[] args) {
        System.out.println("##########################################");
        Mac1841720132nining M = new Mac1841720132nining();
        M.mmerk = "Apple Mac";
        M.mkecProsesor = 100;
        M.msizeMemory = 16;
        M.mjnsProsesor = "intel core i5";
        M.mjnsBatrei = "Baterai Tanam";
        M.msecurity = "Password";
        M.tampilMac();
        System.out.println("##########################################");
        Windows1841720132nining W = new Windows1841720132nining();
        W.mmerk = "Windows 10";
        W.mkecProsesor = 150;
        W.msizeMemory = 8;
        W.mjnsProsesor = "Intel core i7";
        W.mjnsBatrei = "Baterai Lepas";
        W.mfitur = "Touchpad Gesture";
        W.tampilWindows();
        System.out.println("##########################################");
        Pc1841720132nining P = new Pc1841720132nining();
        P.mkecProsesor = 120;
        P.msizeMemory = 2000;
        P.mjnsProsesor = "Intel Core";
        P.mukuranMonitor = 27;
        P.tampilPc();
        System.out.println("##########################################");
    }
}
