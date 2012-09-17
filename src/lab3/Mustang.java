/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Bob
 */
public class Mustang extends SportsCar {
    
    public Mustang(){
        aspiration = new NaturalAspiration();
    }
    
    public Mustang(String model, String engineSize, double horsepower,
            double torque, String steering){
        super(model,engineSize,horsepower,torque,steering);
        aspiration = new NaturalAspiration();
    }
    
}
