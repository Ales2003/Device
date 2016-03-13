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
public class TVset extends Device {

    public TVset(double batteryCharge, double powerConsumption) {
        super(batteryCharge, powerConsumption);
    }

    @Override
    public boolean work() {
        System.out.println("Телевизор ======================");
        while (batteryCharge>=powerConsumption) {
        batteryCharge-=powerConsumption;
        ++workHours;
        }
    
        System.out.println("Время работы телевизора "+workHours+" часов");
        System.out.println("Телевизор нуждается в зарядке");
        return false; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
