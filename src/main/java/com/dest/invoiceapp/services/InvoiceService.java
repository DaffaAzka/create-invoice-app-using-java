package com.dest.invoiceapp.services;

import com.dest.invoiceapp.entity.Information;
import com.dest.invoiceapp.entity.Receiver;

public interface InvoiceService {

    void addItem(String name, Integer price, Integer QTY);
    void showInformation(Information information);
    void showReceiver(Receiver receiver);
    void showList();
    void showTotal();

}
