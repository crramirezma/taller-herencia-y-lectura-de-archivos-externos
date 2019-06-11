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
public abstract class ShareAsset implements Asset {
    protected String Symbol;
    protected double totalCost;
    protected double CurrentPrice;
    
    @Override
    public double getProfit(){
        return 0;
    }
} 
