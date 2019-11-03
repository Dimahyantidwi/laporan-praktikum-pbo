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
public class Zombie1841720132nining implements Destroyable1841720132nining{

    protected int mhealth;
    protected int mlevel;

    public void heal() {
    }

    public void destroyed() {
    }

    public String getZombieInfo() {
        return "Health = " + mhealth + "\n" + "Level = "
                + mlevel;
    }
}
