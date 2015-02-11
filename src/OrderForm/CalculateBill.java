/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OrderForm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

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


    
    public double totalCalculation(boolean whiteBlackBox, boolean redWhiteBox, boolean blueBlackBox, double quantityWhite, double quantityRed, double quantityBlue)
    {
        if (whiteBlackBox)
        
            total+= (whiteBlack * quantityWhite);
        if (redWhiteBox)
            total+= (redWhite * quantityRed);
        if (blueBlackBox)
            total += (blueBlack * quantityBlue);
            return total;
    }
    
    public double diceTotals(double quantityBox, double dicePrice)
    {
        Double diceTotal = quantityBox * dicePrice;
        return diceTotal;
        
    }

    
}
