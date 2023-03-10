package SIG_Design;

import javax.swing.*;
import javax.swing.JTextField;

/**
 *
 * monica
 */
public class CreateNewInvoice extends javax.swing.JDialog {

    private javax.swing.JButton cancelInvoiceButton;
    private javax.swing.JButton createInvoiceButton;
    private javax.swing.JLabel createNewInvoiceLabel;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JLabel invoiceDateLabel;
    private javax.swing.JTextField invoiceDateTextField;
    private javax.swing.JLabel invoiceNoLabel;
    private javax.swing.JLabel invoiceNoValueLabel;
    private javax.swing.JPanel jPanel1;

    public CreateNewInvoice(SIG_Design.test appFrame) {

        Components();
        createInvoiceButton.addActionListener(appFrame.getActionsListener());
        cancelInvoiceButton.addActionListener(appFrame.getActionsListener());
    }
    public JTextField getCustomerNameTextField() {
        return customerNameTextField;
    }
    public void setCustomerNameTextField(JTextField customerNameTextField) {
        this.customerNameTextField = customerNameTextField;
    }
    public JTextField getInvoiceDateTextField() {
        return invoiceDateTextField;
    }
    public void setInvoiceDateTextField(JTextField invoiceDateTextField) {
        this.invoiceDateTextField = invoiceDateTextField;
    }
    public JLabel getInvoiceNoValueLabel() {
        return invoiceNoValueLabel;
    }
    public void setInvoiceNoValueLabel(JLabel invoiceNoValueLabel) {
        this.invoiceNoValueLabel = invoiceNoValueLabel;
    }

    private void Components() {

        jPanel1 = new javax.swing.JPanel();
        createNewInvoiceLabel = new javax.swing.JLabel();
        invoiceNoLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        invoiceNoValueLabel = new javax.swing.JLabel();
        createInvoiceButton = new javax.swing.JButton();
        cancelInvoiceButton = new javax.swing.JButton();
        customerNameTextField = new javax.swing.JTextField();
        invoiceDateTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setSize(new java.awt.Dimension(700, 300));

        jPanel1.setPreferredSize(new java.awt.Dimension(680, 250));

        createNewInvoiceLabel.setText("Create New Invoice");

        invoiceNoLabel.setText("Invoice No.");

        customerNameLabel.setText("Customer Name");

        invoiceDateLabel.setText("Invoice Date");

        createInvoiceButton.setText("Create Invoice");

        cancelInvoiceButton.setText("Cancel Invoice");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(287, 287, 287)
                                                .addComponent(createNewInvoiceLabel))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(invoiceNoLabel)
                                                                        .addComponent(invoiceDateLabel))
                                                                .addGap(60, 60, 60)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(invoiceNoValueLabel)
                                                                        .addComponent(invoiceDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(customerNameLabel)
                                                                .addGap(40, 40, 40)
                                                                .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(188, 188, 188)
                                                .addComponent(createInvoiceButton)
                                                .addGap(100, 100, 100)
                                                .addComponent(cancelInvoiceButton)))
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(createNewInvoiceLabel)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(invoiceNoLabel)
                                        .addComponent(invoiceNoValueLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(invoiceDateLabel)
                                        .addComponent(invoiceDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(customerNameLabel)
                                        .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createInvoiceButton)
                                        .addComponent(cancelInvoiceButton))
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 700, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 228, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }



}

