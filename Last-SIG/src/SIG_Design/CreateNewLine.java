package SIG_Design;

import javax.swing.*;

/**
 *
 * monica
 */

public class CreateNewLine extends javax.swing.JDialog {
    private javax.swing.JButton cancelLineButton;
    private javax.swing.JTextField countTextField;
    private javax.swing.JButton createLineButton;
    private javax.swing.JLabel createNewLineLabel;
    private javax.swing.JLabel invoiceDateLabel;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JTextField itemNameTextField;
    private javax.swing.JLabel itemPriceLabel;
    private javax.swing.JTextField itemPriceTextField;
    private javax.swing.JPanel jPanel1;

    public CreateNewLine(SIG_Design.test appFrame) {

        Components();

        createLineButton.addActionListener(appFrame.getActionsListener());
        cancelLineButton.addActionListener(appFrame.getActionsListener());
    }
    public JTextField getCountTextField() {
        return countTextField;
    }
    public void setCountTextField(JTextField countTextField) {
        this.countTextField = countTextField;
    }

    public JTextField getItemNameTextField() {
        return itemNameTextField;
    }
    public void setItemNameTextField(JTextField itemNameTextField) {
        this.itemNameTextField = itemNameTextField;
    }

    public JTextField getItemPriceTextField() {
        return itemPriceTextField;
    }
    public void setItemPriceTextField(JTextField itemPriceTextField) {
        this.itemPriceTextField = itemPriceTextField;
    }

    private void Components() {

        jPanel1 = new javax.swing.JPanel();
        createNewLineLabel = new javax.swing.JLabel();
        itemPriceLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        createLineButton = new javax.swing.JButton();
        cancelLineButton = new javax.swing.JButton();
        itemNameLabel = new javax.swing.JLabel();
        itemNameTextField = new javax.swing.JTextField();
        itemPriceTextField = new javax.swing.JTextField();
        countTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setSize(new java.awt.Dimension(700, 300));

        createNewLineLabel.setText("Create New Line");

        itemPriceLabel.setText("Item Price");

        invoiceDateLabel.setText("Count");

        createLineButton.setText("Create Line");

        cancelLineButton.setText("Cancel Line");

        itemNameLabel.setText("Item Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(287, 287, 287)
                                                .addComponent(createNewLineLabel))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(itemPriceLabel)
                                                        .addComponent(invoiceDateLabel)
                                                        .addComponent(itemNameLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(itemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(countTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(itemPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(196, 196, 196)
                                                .addComponent(createLineButton)
                                                .addGap(104, 104, 104)
                                                .addComponent(cancelLineButton)))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(createNewLineLabel)
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itemNameLabel)
                                        .addComponent(itemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itemPriceLabel)
                                        .addComponent(itemPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(invoiceDateLabel)
                                        .addComponent(countTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createLineButton)
                                        .addComponent(cancelLineButton))
                                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 700, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        pack();
    }

}
