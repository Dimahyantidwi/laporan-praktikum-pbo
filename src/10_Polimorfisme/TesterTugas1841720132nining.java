/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET10;

/**
 *
 * @author lenovo
 */
public class TesterTugas1841720132nining {

    public static void main(String[] args) {
        WalkingZombie1841720132nining wz = new WalkingZombie1841720132nining(100, 1);
        JumpingZombie1841720132nining jz = new JumpingZombie1841720132nining(100, 2);
        Barrier1841720132nining b = new Barrier1841720132nining(100);
        Plant1841720132nining p = new Plant1841720132nining();
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
    }

}
