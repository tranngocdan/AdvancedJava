/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/08/2016
 * @version 1
 * --------------------------------
 * create class soldier
 */
public class Soldier {
    private String name;
    private int power;
    private String weapon;

    public Soldier() {
    }

    public Soldier(String name, int power, String weapon) {
        this.name = name;
        this.power = power;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    public void fight(){
        this.setPower(this.getPower()-1);
    }
}
