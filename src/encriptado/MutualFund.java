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
public class MutualFund extends ShareAsset{
    protected double totalShares;
    @Override
    public double getMarketValue(){
        return totalShares*super.CurrentPrice;
    }
    public MutualFund(){}
    public MutualFund(double total,double current,String symbol, double totalCost){
        this.CurrentPrice=current;
        this.Symbol=symbol;
        this.totalCost=totalCost;
        this.totalShares=total;
    }
}
