/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptador;

/**
 *
 * @author pc 1
 */
public class cash implements Asset{
    protected double amoun;
    @Override
    public double getMarketValue(){
        return amoun;
    }
    @Override
    public double getProfit(){
        return 0;
    }
    public cash(){
        
    }
    public cash(double amoun){
        this.amoun=amoun;
    }

    public double getAmoun() {
        return amoun;
    }

    public void setAmoun(double amoun) {
        this.amoun = amoun;
    }
    
    
}
