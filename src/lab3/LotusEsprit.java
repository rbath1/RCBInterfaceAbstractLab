/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Robert Bath
 */
public class LotusEsprit extends SportsCar implements IForcedInduction {
    private String forcedInduction;
    
    public LotusEsprit(){
        
    }
    public LotusEsprit(String model, String engineSize, double horsepower,
            double torque, String steering){
        super(model,engineSize,horsepower,torque,steering);
    }
    @Override
    public void setForcedInduction(String forcedInduction){
        //needs validation
        this.forcedInduction = forcedInduction;
    }
    @Override
    public String getForcedInduction(){
        return forcedInduction;
    }
    
}
