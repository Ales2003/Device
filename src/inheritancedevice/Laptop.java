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
public class Laptop extends Device {

    public Laptop(double batteryCharge, double powerConsumption) {
        super(batteryCharge, powerConsumption);
    }

    @Override
    public boolean work() {
        
        System.out.println("Компьютер======================");
        while (batteryCharge>=powerConsumption) {
        System.out.print("Компьютер работает "+ (++workHours)*60+" минут >>> ");
        batteryCharge-=powerConsumption;
        ;
        }
        System.out.println();
        System.out.println("Время работы компьютера "+workHours+" часов");
        System.out.println("Компьютер нуждается в зарядке!!!");
        return false;
        
        
//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
