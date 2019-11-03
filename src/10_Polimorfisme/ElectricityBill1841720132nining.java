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
public class ElectricityBill1841720132nining implements Payable1841720132nining{
    private int mkwh;
    private String mcategory;

    public ElectricityBill1841720132nining(int kwh, String category) {
        this.mkwh = kwh;
        this.mcategory = category;
    }

    public int getKwh() {
        return mkwh;
    }

    public void setKwh(int kwh) {
        this.mkwh = kwh;
    }

    public String getCategory() {
        return mcategory;
    }

    public void setCategory(String category) {
        this.mcategory = category;
    }

    @Override
    public int getPaymentAmount() {
        return mkwh * getBasePrice();
    }

    public int getBasePrice() {
        int bPrice = 0;
        switch (mcategory) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }

    public String getBillInfo() {
        return "kWH = " + mkwh + "\n"
                + "Category = " + mcategory + "(" + getBasePrice() + " per kWH)\n";
    }
    public void info() {
        System.out.print("Hallooo");
    }
}
