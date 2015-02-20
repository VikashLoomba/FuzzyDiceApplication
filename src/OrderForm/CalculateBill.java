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
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;



/**
 *
 * @author vikash.loomba
 */
public class CalculateBill {
    //Instance Variables and constants
        static final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amountsstatic final double
                //Dice Amounts
                WHITEBLACK = 6.25,
                REDWHITE = 5.00,
                BLUEBLACK = 7.50,
                //Tax and Discount Amount
                TAX = 0.0825,
                DISCOUNT = 0.07,
                //Shipping Charges
                UPSGROUND = 2.95,
                UPSTHREE = 6.95,
                UPSNEXTDAY = 15.95,
                TWENTYITEMS = 0.0;
             double SHIPPINGCHARGE = 0.0;   
             double SUBTOTAL = 0.0;
             double DISCOUNTAMT = -0.0;



    
    //JavaDocs
    List<String> nameList = new ArrayList<String>(),
                addressList = new ArrayList<String>(),
                cityList = new ArrayList<String>(),
                stateList = new ArrayList<String>(),
                zipList = new ArrayList<String>();

    // Javadocs
    public double taxAmt()
    {
        double tax = (SUBTOTAL - (DISCOUNTAMT * -1)) * TAX;
        return tax;
    }
    // Javadocs
    public double discount()
    {
        if (SUBTOTAL >= 500)
        {
            DISCOUNTAMT = SUBTOTAL * (DISCOUNT * -1);
        }
            return DISCOUNTAMT;
    }
    //JavaDocs
    public double total()
    {
        double total = SUBTOTAL + SHIPPINGCHARGE - (DISCOUNTAMT * -1);
        double tax = taxAmt();
        total += tax;
        return total;
    }
    //JavaDocs
    public double diceTotal(int quantityField, double dicePrice)
    {

            double diceTotals = quantityField * dicePrice;
            SUBTOTAL += diceTotals;
            return SUBTOTAL;
        
    }
    //JavaDocs
    public void readCustomersFile(JComboBox customerjComboBox) 
    {
        String fileName = "src/OrderForm/customers.txt",
               customers,
               customerName,
               customerAddress,
                customerCity,
                customerState,
                customerZip;
                

        try
        {
            FileReader fReader = new FileReader(fileName);
            BufferedReader inputFile = new BufferedReader(fReader);
            
            //Read first line and process
            customers = inputFile.readLine();
            
            //While the customerName is not blank
            while(customers != null) {
                //Reads up to each comma ','
                String[] info = customers.split(",");
                    customerName = info[0];
                    nameList.add(customerName);
                    customerAddress = info[1];
                    addressList.add(customerAddress);
                    customerCity = info[2];
                    cityList.add(customerCity);
                    customerState = info[3];
                    stateList.add(customerState);
                    customerZip = info[4];
                    zipList.add(customerZip);
                //Populate combobox
                customerjComboBox.addItem(customerName);
                customers = inputFile.readLine();
        }
            
            inputFile.close();

        }
        catch(FileNotFoundException exp)
        {
            exp.printStackTrace();
        }
        catch(IOException exp)
        {
            exp.printStackTrace();
        }
        
        
    }
    
    public double shippingCharge(JComboBox shippingComboBox, int quantity)
    {
        String shipType = (String) shippingComboBox.getSelectedItem();
        if (quantity >= 20)
        {
            SHIPPINGCHARGE = 0;
        }
        else if (shipType.equals("UPS Ground"))
        {
            SHIPPINGCHARGE = UPSGROUND;
        }
        else if (shipType.equals("UPS 3 Day"))
        {
            SHIPPINGCHARGE = UPSTHREE;
        }
        else if (shipType.equals("UPS Next Day"))
        {
            SHIPPINGCHARGE = UPSNEXTDAY;
        }
        return SHIPPINGCHARGE;
        
    }

}
