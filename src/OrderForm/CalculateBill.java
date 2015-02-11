/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OrderForm;



/**
 *
 * @author vikash.loomba
 */
public class CalculateBill {
    //Instance Variables and constants
        static final double 
                whiteBlack = 6.25,
                redWhite = 5.00,
                blueBlack = 7.50,
                TAX = 0.825,
                DISCOUNT = 0.7;
        
    double total = 0.0;
    
    public double totalCalculation(boolean whiteBlackBox, boolean redWhiteBox, boolean blueBlackBox, String quantityWhite, String quantityRed, String quantityBlue)
    {
        if (whiteBlackBox = true)            
            total+= (whiteBlack * Double.parseDouble(quantityWhite));
        if (redWhiteBox = true)
            total+= (redWhite * Double.parseDouble(quantityRed));
        if (blueBlackBox = true)
            total += (blueBlack * Double.parseDouble(quantityBlue));
        return total;
    }
    
    public double diceTotal(String quantityField, double dicePrice)
    {
        double quantityBox = Double.parseDouble(quantityField);
        double diceTotals = quantityBox * dicePrice;
        return diceTotals;
        
    }

    
}
