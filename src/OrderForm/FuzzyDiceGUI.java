package OrderForm;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *************************************************************
 *Comments by prof.
 *
 *************************************************************
 * File name:   FuzzyDiceGUI.java
 * @author:     Vikash Loomba
 * Created on:  February 3rd, 2015
 * @version:    1.0
 * Platform:    PC, Windows XP, Netbeans 8.0 jdk 7
 * @see javax.swing.JFrame
 * @see java.text.NumberFormat
 * @see java.io
 *************************************************************
 * <b>
 * This program calculates the total bill for the order, including tax and shipping.
 * </b>
 *************************************************************
 * Input:   Order number, customer name, address, dice quantities.
 * Output:  Total bill for order.
 *************************************************************
 * Comments by student
 *
 *************************************************************
 */
public class FuzzyDiceGUI extends javax.swing.JFrame {
    //Initialize Lists that will hold Customer Information from txt file
    List<String> nameList = new ArrayList<String>();
    List<String> addressList = new ArrayList<String>();
    List<String> cityList = new ArrayList<String>();
    List<String> stateList = new ArrayList<String>();
    List<String> zipList = new ArrayList<String>();   
    StringBuffer display = new StringBuffer();
    // Number formatter
    NumberFormat dollars = NumberFormat.getCurrencyInstance();
    /**
     * Creates new form FuzzyDiceGUI
     */
    public FuzzyDiceGUI() {
        initComponents();
        //Set icon for the form

        
        //Set the Calculate button as default
        //this.getRootPane().setDefaultButton(calculateJButton);
        //Set center the form
        this.setLocationRelativeTo(null);
        //Call a method to read customers from an external file and
        //to populate the patients combobox, but first empty it
        readCustomersFile();
        
    }
    
    
    /**Need Javadocs for this method
     * 
     */
    private void readCustomersFile() 
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerPanel = new javax.swing.JPanel();
        customerLabel = new javax.swing.JLabel();
        customerjComboBox = new javax.swing.JComboBox();
        addressLabel = new javax.swing.JLabel();
        addressFormattedTextField = new javax.swing.JFormattedTextField();
        cityLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        zipLabel = new javax.swing.JLabel();
        cityFormattedTextField = new javax.swing.JFormattedTextField();
        stateFormattedTextField = new javax.swing.JFormattedTextField();
        zipFormattedTextField = new javax.swing.JFormattedTextField();
        shippingComboBox = new javax.swing.JComboBox();
        displayPanel = new javax.swing.JPanel();
        displayJScrollPane = new javax.swing.JScrollPane();
        outJTextArea = new javax.swing.JTextArea();
        controlPanel = new javax.swing.JPanel();
        displayJButton = new javax.swing.JButton();
        newJButton = new javax.swing.JButton();
        printJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        quitJButton = new javax.swing.JButton();
        orderPanel = new javax.swing.JPanel();
        dicePanel = new javax.swing.JPanel();
        typeLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        whiteBlackCheckBox = new javax.swing.JCheckBox();
        whiteBlackAmt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        redWhiteCheckBox = new javax.swing.JCheckBox();
        redWhiteAmt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        blueBlackCheckBox = new javax.swing.JCheckBox();
        blueBlackAmt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        objectTotalPanel = new javax.swing.JPanel();
        objectjLabel = new javax.swing.JLabel();
        objectjTextField = new javax.swing.JTextField();
        totaljLabel = new javax.swing.JLabel();
        totaljTextField = new javax.swing.JTextField();
        infoPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        fuzzyDicejMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FuzzyDice Application");
        setMinimumSize(new java.awt.Dimension(420, 305));
        setPreferredSize(new java.awt.Dimension(700, 520));
        setResizable(false);

        customerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        customerLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        customerLabel.setText("Customer:");

        customerjComboBox.setToolTipText("");
        customerjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerjComboBoxActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressLabel.setText("Address:");

        addressFormattedTextField.setEditable(false);
        addressFormattedTextField.setText("Customer Address");
        addressFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFormattedTextFieldActionPerformed(evt);
            }
        });

        cityLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cityLabel.setText("City:");

        stateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stateLabel.setText("State:");

        zipLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zipLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        zipLabel.setText("Zip:");

        cityFormattedTextField.setEditable(false);
        cityFormattedTextField.setText("Customer City");

        stateFormattedTextField.setEditable(false);
        stateFormattedTextField.setText("Customer State");

        zipFormattedTextField.setEditable(false);
        zipFormattedTextField.setText("Customer State");

        shippingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UPS Ground", "Fed-Ex", "USPS" }));

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(zipLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressFormattedTextField)
                            .addComponent(cityFormattedTextField)
                            .addComponent(stateFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(zipFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(shippingComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerLabel)
                    .addComponent(customerjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateLabel)
                    .addComponent(stateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipLabel)
                    .addComponent(zipFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(shippingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        displayPanel.setPreferredSize(new java.awt.Dimension(267, 92));

        outJTextArea.setEditable(false);
        outJTextArea.setColumns(20);
        outJTextArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        outJTextArea.setRows(5);
        displayJScrollPane.setViewportView(outJTextArea);

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayJScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addComponent(displayJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        displayJButton.setBackground(new java.awt.Color(255, 255, 204));
        displayJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        displayJButton.setMnemonic('C');
        displayJButton.setText("Display Bill");
        displayJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayJButtonActionPerformed(evt);
            }
        });
        controlPanel.add(displayJButton);

        newJButton.setBackground(new java.awt.Color(255, 255, 204));
        newJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newJButton.setMnemonic('S');
        newJButton.setText("New Order");
        controlPanel.add(newJButton);

        printJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        printJButton.setText("Print Invoice");
        controlPanel.add(printJButton);

        clearJButton.setBackground(new java.awt.Color(255, 255, 204));
        clearJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearJButton.setMnemonic('r');
        clearJButton.setText("Clear");
        controlPanel.add(clearJButton);

        quitJButton.setBackground(new java.awt.Color(255, 255, 204));
        quitJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quitJButton.setMnemonic('Q');
        quitJButton.setText("Quit");
        controlPanel.add(quitJButton);

        dicePanel.setLayout(new java.awt.GridLayout(4, 3));

        typeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeLabel.setText("Type:");
        dicePanel.add(typeLabel);

        quantityLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        quantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityLabel.setText("Quantity");
        dicePanel.add(quantityLabel);

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLabel.setText("Price");
        dicePanel.add(priceLabel);

        whiteBlackCheckBox.setText("White/Black");
        dicePanel.add(whiteBlackCheckBox);

        whiteBlackAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteBlackAmtActionPerformed(evt);
            }
        });
        dicePanel.add(whiteBlackAmt);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("$6.25");
        dicePanel.add(jLabel1);

        redWhiteCheckBox.setText("Red/White");
        dicePanel.add(redWhiteCheckBox);
        dicePanel.add(redWhiteAmt);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("$5.00");
        dicePanel.add(jLabel2);

        blueBlackCheckBox.setText("Blue/Black");
        dicePanel.add(blueBlackCheckBox);
        dicePanel.add(blueBlackAmt);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("$7.50");
        dicePanel.add(jLabel3);

        objectjLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        objectjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        objectjLabel.setText("Order #");

        objectjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        objectjTextField.setText("jTextField4");

        totaljLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totaljLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totaljLabel.setText("Total:");

        totaljTextField.setEditable(false);
        totaljTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totaljTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaljTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout objectTotalPanelLayout = new javax.swing.GroupLayout(objectTotalPanel);
        objectTotalPanel.setLayout(objectTotalPanelLayout);
        objectTotalPanelLayout.setHorizontalGroup(
            objectTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(objectTotalPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(objectTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(totaljTextField))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(objectTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(objectTotalPanelLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(objectTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(objectjTextField)
                        .addComponent(objectjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        objectTotalPanelLayout.setVerticalGroup(
            objectTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, objectTotalPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totaljLabel)
                .addGap(18, 18, 18)
                .addComponent(totaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(objectTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(objectTotalPanelLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(objectjLabel)
                    .addGap(27, 27, 27)
                    .addComponent(objectjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(148, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addComponent(dicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(objectTotalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelLayout.createSequentialGroup()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(objectTotalPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Fuzzy Dice Incorporated\n123 Gamble Away St.\nEdmonds, WA 98036\n(425) 742-1122\nhttp://www.gamble.com\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jMenu1.setText("File");
        fuzzyDicejMenuBar.add(jMenu1);

        jMenu2.setText("Edit");
        fuzzyDicejMenuBar.add(jMenu2);

        setJMenuBar(fuzzyDicejMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addComponent(orderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(controlPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleName("FuzzyDiceApplication");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayJButtonActionPerformed
        String customerName = customerjComboBox.getSelectedItem().toString();
        String quantityWhite = whiteBlackAmt.getText();
        String quantityRed = redWhiteAmt.getText();
        String quantityBlue = blueBlackAmt.getText();
        double total = 0.0;
      // Display error message if no name entered or no box selected
      if ( ( customerName.equals( "" ) ) || 
           ( !whiteBlackCheckBox.isSelected() && 
           !redWhiteCheckBox.isSelected() &&
           !blueBlackCheckBox.isSelected() )
         )
      {
         // display error message
         JOptionPane.showMessageDialog( null,
            "Please select a name and check at least one item.",
            "Missing Information", JOptionPane.WARNING_MESSAGE );
      }
      else
      {
          CalculateBill set = new CalculateBill();
          total = set.totalCalculation(whiteBlackCheckBox.isSelected(), redWhiteCheckBox.isSelected(),
                  blueBlackCheckBox.isSelected(), quantityWhite, quantityRed, quantityBlue);
          totaljTextField.setText(valueOf(total));
          displayBill(customerName, total, set);
          
          
      }
        
    }//GEN-LAST:event_displayJButtonActionPerformed
    
        public void displayBill(String customerName, double total, CalculateBill set)
        {
            if (whiteBlackCheckBox.isSelected())
            {
                display.append(padSpaces("White/Black Dice: ", dollars.format(set.diceTotal(whiteBlackAmt.getText(), set.whiteBlack)) + "\n"));
            }
            if (redWhiteCheckBox.isSelected())
            {           
                display.append(padSpaces("Blue/Black Dice: ", dollars.format(set.diceTotal(redWhiteAmt.getText(), set.redWhite)) + "\n"));
            }    
            if (blueBlackCheckBox.isSelected())
            {
                display.append(padSpaces("Blue/Black Dice: ", dollars.format(set.diceTotal(blueBlackAmt.getText(), set.blueBlack)) + "\n"));
            }    
            display.append("------------------------------------------------------------\n");
            display.append(padSpaces("Total", dollars.format(total) + '\n'));
            
            outJTextArea.setText(display.toString());
            
        }
                
        //Pads the spacing in the JTextArea
            private StringBuffer padSpaces(String first, String second)
        {
            final int MAX = 35;
            StringBuffer line = new StringBuffer(first);
            //find number of spaces needed to pad the line
            int numSpaces = MAX - first.length() - second.length();
            
            //Append spaces
            for(int i = 0; i < numSpaces; i++)
            {
                line.append(" ");                 
            }
            //Append second String (price)
            line.append(second);
            return line;
        }
    private void addressFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFormattedTextFieldActionPerformed

    private void customerjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerjComboBoxActionPerformed
        // Getting the selected item
        String selectedName = (String) customerjComboBox.getSelectedItem();

            if(selectedName.equals(nameList.get(0))){
                addressFormattedTextField.setText(addressList.get(0));
                cityFormattedTextField.setText(cityList.get(0));
                stateFormattedTextField.setText(stateList.get(0));
                zipFormattedTextField.setText(zipList.get(0));
            }else if(selectedName.equals(nameList.get(1))){
                addressFormattedTextField.setText(addressList.get(1));
                cityFormattedTextField.setText(cityList.get(1));
                stateFormattedTextField.setText(stateList.get(1));
                zipFormattedTextField.setText(zipList.get(1));
            }else if(selectedName.equals(nameList.get(2))){
                addressFormattedTextField.setText(addressList.get(2));
                cityFormattedTextField.setText(cityList.get(2));
                stateFormattedTextField.setText(stateList.get(2));
                zipFormattedTextField.setText(zipList.get(2));
            }else if(selectedName.equals(nameList.get(3))){
                addressFormattedTextField.setText(addressList.get(3));
                cityFormattedTextField.setText(cityList.get(3));
                stateFormattedTextField.setText(stateList.get(3));
                zipFormattedTextField.setText(zipList.get(3));
            }else if(selectedName.equals(nameList.get(4))){
                addressFormattedTextField.setText(addressList.get(4));
                cityFormattedTextField.setText(cityList.get(4));
                stateFormattedTextField.setText(stateList.get(4));
                zipFormattedTextField.setText(zipList.get(4));
            }else{
            JOptionPane.showMessageDialog( null,
            "Please enter a name and check at least one item.",
            "Missing Information", JOptionPane.WARNING_MESSAGE );
            }
        
    }//GEN-LAST:event_customerjComboBoxActionPerformed

    private void totaljTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaljTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totaljTextFieldActionPerformed

    private void whiteBlackAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteBlackAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whiteBlackAmtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FuzzyDiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuzzyDiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuzzyDiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuzzyDiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuzzyDiceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField addressFormattedTextField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField blueBlackAmt;
    private javax.swing.JCheckBox blueBlackCheckBox;
    private javax.swing.JFormattedTextField cityFormattedTextField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JButton clearJButton;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JComboBox customerjComboBox;
    private javax.swing.JPanel dicePanel;
    private javax.swing.JButton displayJButton;
    private javax.swing.JScrollPane displayJScrollPane;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JMenuBar fuzzyDicejMenuBar;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton newJButton;
    private javax.swing.JPanel objectTotalPanel;
    private javax.swing.JLabel objectjLabel;
    private javax.swing.JTextField objectjTextField;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JTextArea outJTextArea;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton printJButton;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton quitJButton;
    private javax.swing.JTextField redWhiteAmt;
    private javax.swing.JCheckBox redWhiteCheckBox;
    private javax.swing.JComboBox shippingComboBox;
    private javax.swing.JFormattedTextField stateFormattedTextField;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel totaljLabel;
    private javax.swing.JTextField totaljTextField;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JTextField whiteBlackAmt;
    private javax.swing.JCheckBox whiteBlackCheckBox;
    private javax.swing.JFormattedTextField zipFormattedTextField;
    private javax.swing.JLabel zipLabel;
    // End of variables declaration//GEN-END:variables

}
