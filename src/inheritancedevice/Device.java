/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedevice;

/**
 *
 * @author Алекс1
 */
public class Device {
    protected double batteryCharge;
    protected double powerConsumption;
    protected int workHours=0;
    
    public Device(double batteryCharge, double powerConsumption) {
        this.batteryCharge = batteryCharge;
        this.powerConsumption = powerConsumption;
    }
    
    public boolean work(){
    System.out.println("Устройство ======================");
    while (batteryCharge>=powerConsumption) {
    batteryCharge-=powerConsumption;
    ++workHours;
    }
    
    System.out.println("Время работы устройства "+workHours+" часов");
    System.out.println("Устройство нуждается в зарядке");
    return false;
    }    
    
}
