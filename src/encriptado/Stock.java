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
public class Stock extends ShareAsset{
    protected int totalShares;
    @Override
    public double getMarketValue(){
        return totalShares*super.CurrentPrice;
    }
}
