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
    
    @Override
    public void setForcedInduction(String forcedInduction){
        this.forcedInduction = forcedInduction;
    }
    @Override
    public String getForcedInduction(){
        return forcedInduction;
    }
    
}
