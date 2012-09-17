/** Struggling with deciding when and what to use abstract methods with. Can't
 * seem to think of where that would apply.  Maybe if the data was already known
 * and was to be hard coded into the sub-class (not setting) be an acceptable 
 * approach? Using abstract methods to force future programmers to utilize the 
 * method and set the correct information? 
 */

package lab3;

/**
 * 
 * @author Robert Bath
 * @version 1.0
 */
//Super class SportsCar holds information that ALL subclasses share
public abstract class SportsCar {
    private String engineSize;
    private double horsepower;
    private double torque;
    private String model;
    private String steering;
    IAspiration aspiration;
    
    public SportsCar(){
        
    }
    
    public SportsCar(String model, String engineSize, double horsepower, double torque,
            String steering){
        this.model = model;
        this.engineSize = engineSize;
        this.horsepower = horsepower;
        this.torque = torque;
        this.steering = steering;
    }
    
    public void displayAspiration(){
        aspiration.aspiration();
    }
    public final void setModel(String model){
        //needs validation
        this.model = model;
    }
    public final String getModel(){
        return model;
    }
    public final void setEngineSize(String engineSize){
        //needs validation
        this.engineSize = engineSize;
    } 
    public final String getEngineSize(){
        return engineSize;
    }
    
    public final void setHorsePower(double horsepower){
        //needs validation
        this.horsepower = horsepower;
    }
    
    public final double getHorsePower(){
        return horsepower;
    }
    
    public final void setTorque(double torque){
        //needs validation
        this.torque = torque;
    }
    
    public final double getTorque(){
        return torque;
    }
 
    public final void setSteering(String steering){
        //needs validation
        this.steering = steering;
    }
    
    public final String getSteering(){
        return steering;
    }
    public void displayAspiration(IAspiration asp){
        aspiration = asp;
    }
}