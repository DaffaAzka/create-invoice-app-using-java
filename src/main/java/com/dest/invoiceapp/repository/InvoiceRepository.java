package com.dest.invoiceapp.repository;

import com.dest.invoiceapp.entity.Information;
import com.dest.invoiceapp.entity.Item;
import com.dest.invoiceapp.entity.Receiver;

public interface InvoiceRepository {

    Item[] getAllItems();
    void addItem(Item item);
    Integer total();
    Integer totalWithTax();

}
