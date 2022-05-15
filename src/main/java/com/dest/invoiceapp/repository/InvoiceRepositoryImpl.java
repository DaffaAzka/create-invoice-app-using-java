package com.dest.invoiceapp.repository;

import com.dest.invoiceapp.entity.Item;

public class InvoiceRepositoryImpl implements InvoiceRepository {

    Item[] items = new Item[10];

    @Override
    public Item[] getAllItems() {
        return items;
    }

    @Override
    public void addItem(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
    }

    @Override
    public Integer total() {
        Integer total = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                total += (items[i].price() * items[i].QTY());
            }
        }
        return total;
    }

    @Override
    public Integer totalWithTax() {
        if (total() / 30 != 3000) {
            return total() + 3000;
        } else {
            return total() + (total() / 30);
        }
    }

}
