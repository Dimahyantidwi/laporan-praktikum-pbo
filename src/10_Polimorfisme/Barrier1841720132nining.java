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
public class Barrier1841720132nining implements Destroyable1841720132nining {

    private int mstrength;

    public Barrier1841720132nining(int strength) {
        this.mstrength = strength;
    }

    public void setStrength(int strength) {
        this.mstrength = strength;
    }

    public int getStrength() {
        return mstrength;
    }

    public void destroy() {
    }

    @Override
    public void destroyed() {
        destroy();
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + mstrength + "\n";
    }
}
