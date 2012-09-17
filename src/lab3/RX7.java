/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Bob
 */
public class RX7 extends SportsCar{
    
    public RX7(){
        aspiration = new TurboCharger();
    }
    
    public RX7(String model, String engineSize, double horsepower,
            double torque, String steering){
        super(model,engineSize,horsepower,torque,steering);
        aspiration = new TurboCharger();
    }
    
//     @Override
//    public void setForcedInduction(String forcedInduction){
//         //needs validation
//        this.forcedInduction = forcedInduction;
//    }
//    @Override
//    public String getForcedInduction(){
//        return forcedInduction;
//    }
}
