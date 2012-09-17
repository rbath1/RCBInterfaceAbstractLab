/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Bob
 */
public class Startup {
    public static void main(String[] args){
        
        LotusEsprit Esprit = new LotusEsprit("Esprit", "3.5L V-8", 350, 290, "Rack & Pinion");
        Mustang SVT = new Mustang("SVT Cobra", "4.6L V-8", 380, 300, "Rack & Pinion");
        RX7 RX7 = new RX7("RX7-3rd generation", "1.3L Rotary", 290, 240, "Rack & Pinion");
        
        Esprit.setForcedInduction("Twin-Turbo");
        RX7.setForcedInduction("Twin-Turbo");
        
        System.out.println(Esprit.getModel() + "\n" + Esprit.getEngineSize() + "\n" +
                Esprit.getHorsePower() + "\n" + Esprit.getTorque() + "\n" + Esprit.getSteering() +
                "\n" + Esprit.getForcedInduction() + "\n");
        
        System.out.println(SVT.getModel() + "\n" + SVT.getEngineSize() + "\n" +
                SVT.getHorsePower() + "\n" + SVT.getTorque() + "\n" + SVT.getSteering() + "\n");
        
        System.out.println(RX7.getModel() + "\n" + RX7.getEngineSize() + "\n" +
                RX7.getHorsePower() + "\n" + RX7.getTorque() + "\n" + RX7.getSteering() +
                RX7.getForcedInduction() + "\n");
        
    }
}
