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
public class WalkingZombie1841720132nining extends Zombie1841720132nining {

    public WalkingZombie1841720132nining(int health, int level) {
        this.mhealth = health;
        this.mlevel = level;
    }

    public void heal() {
        if (mlevel == 1) {
            mhealth = mhealth + (mhealth * 20 / 100);
        } else if (mlevel == 2) {
            mhealth = mhealth + (mhealth * 30 / 100);
        } else if (mlevel == 3) {
            mhealth = mhealth + (mhealth * 40 / 100);
        }
    }

    public void destroyed() {
        mhealth = mhealth - (mhealth * 2 / 100);

    }

    @Override
    public String getZombieInfo() {
        String info = "Walking Zombie Data = \n";
        info += super.getZombieInfo() + "\n";
        return info;
    }
}
