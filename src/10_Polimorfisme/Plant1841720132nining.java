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
public class Plant1841720132nining {

    public void doDestroy(Destroyable1841720132nining d) {
        if (d instanceof WalkingZombie1841720132nining) {
            WalkingZombie1841720132nining wz = (WalkingZombie1841720132nining) d;
            wz.destroyed();
        } else if (d instanceof JumpingZombie1841720132nining) {
            JumpingZombie1841720132nining jz = (JumpingZombie1841720132nining) d;
            jz.destroyed();
        }
    }
}
