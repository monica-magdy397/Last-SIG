package SIG_Controller;

import SIG_Model.Header;
import SIG_Model.Items;
import SIG_Design.test;
import SIG_Model.ItemsTable;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;

/**
 *
 * monica
 */

import static SIG_Controller.ActionsListener.simpleDateFormat;

public class InvoiceSelectionListener implements ListSelectionListener {

    private test appFrame;
    public InvoiceSelectionListener(test appFrame) {
        this.appFrame = appFrame;
    }
    public InvoiceSelectionListener() {
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedInoviceIndex = appFrame.getTable1().getSelectedRow();
        if (selectedInoviceIndex != -1){
            Header selectedInvoice = appFrame.getHeaderArrayList().get(selectedInoviceIndex);
            ArrayList<Items> itemArrayList = selectedInvoice.getLines();
            ItemsTable itemsTable = new ItemsTable(itemArrayList);
            appFrame.setItemsArrayList(itemArrayList);
            appFrame.getTable2().setModel(itemsTable);
            appFrame.getInvoiceNumerValueLabel().setText("" + selectedInvoice.getInvoiceNumber());
            appFrame.getCustomerNameValueLabel().setText(selectedInvoice.getcustomer());
            appFrame.getInvoiceDateValueLabel().setText(simpleDateFormat.format(selectedInvoice.getInvoiceDate()));
            appFrame.getInvoiceTotalValueLabel().setText("" + selectedInvoice.getTotal());
        }
    }

}
