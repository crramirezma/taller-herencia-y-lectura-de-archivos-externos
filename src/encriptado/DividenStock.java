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
public class DividenStock extends Stock {
    protected double dividends;
    @Override
    public double getMarketValue(){
        return super.getMarketValue()+dividends;
    }

    public void setDividends(double dividends) {
        this.dividends = dividends;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setCurrentPrice(double CurrentPrice) {
        this.CurrentPrice = CurrentPrice;
    }

    public double getDividends() {
        return dividends;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public String getSymbol() {
        return Symbol;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getCurrentPrice() {
        return CurrentPrice;
    }
    public DividenStock(){
        
    }
    public DividenStock(double current, String symbol,double dividends,double total, int totals){
        this.CurrentPrice=current;
        this.Symbol=symbol;
        this.dividends=dividends;
        this.totalCost=total;
        this.totalShares=totals;
    }
    
}
