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
                //Dice Amounts
                whiteBlack = 6.25,
                redWhite = 5.00,
                blueBlack = 7.50,
                //Tax and Discount Amount
                TAX = 0.0825,
                DISCOUNT = 0.07,
                //Shipping Charges
                UPSGround = 2.95,
                UPSThree = 6.95,
                UPSNextDay = 15.95,
                TwentyItems = 0.0;
             double shippingCharge = 0.0;   
             double subtotal = 0.0;
             double discountAmt = -0.0;



    
    //JavaDocs
    List<String> nameList = new ArrayList<String>(),
                addressList = new ArrayList<String>(),
                cityList = new ArrayList<String>(),
                stateList = new ArrayList<String>(),
                zipList = new ArrayList<String>();

    // Javadocs
    public double taxAmt()
    {
        double tax = (subtotal - (discountAmt * -1)) * TAX;
        return tax;
    }
    // Javadocs
    public double discount()
    {
        if (subtotal > 500)
        {
            discountAmt = subtotal * (DISCOUNT * -1);
        }
            return discountAmt;
    }
    //JavaDocs
    public double total()
    {
        double total = subtotal + shippingCharge - (discountAmt * -1);
        double tax = taxAmt();
        total += tax;
        return total;
    }
    //JavaDocs
    public double diceTotal(int quantityField, double dicePrice)
    {
        if (quantityField != 0)
        {
            double diceTotals = quantityField * dicePrice;
            subtotal += diceTotals;
            return subtotal;
        }
        else return 0;
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
        if (quantity > 20)
        {
            shippingCharge = 0;
        }
        else if (shipType.equals("UPS Ground"))
        {
            shippingCharge += UPSGround;
        }
        else if (shipType.equals("UPS 3 Day"))
        {
            shippingCharge += UPSThree;
        }
        else if (shipType.equals("UPS Next Day"))
        {
            shippingCharge += UPSNextDay;
        }
        return shippingCharge;
        
    }

}
