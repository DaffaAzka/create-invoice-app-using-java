package com.dest.invoiceapp.services;

import com.dest.invoiceapp.entity.Information;
import com.dest.invoiceapp.entity.Item;
import com.dest.invoiceapp.entity.Receiver;
import com.dest.invoiceapp.repository.InvoiceRepository;

public class InvoiceServiceImpl implements InvoiceService {

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public InvoiceRepository invoiceRepository;


    @Override
    public void addItem(String name, Integer price, Integer QTY) {
        invoiceRepository.addItem(new Item(name, price, QTY));
    }

    @Override
    public void showInformation(Information information) {

        System.out.println("INVOICE#" + information.id());
        System.out.println("Subject : " + information.subject());

        if (information.status()) {
            System.out.println("Status : Success");
        } else {
            System.out.println("Status : ---");
        }

        System.out.println("Payment : " + information.payment());

    }

    @Override
    public void showReceiver(Receiver receiver) {

        System.out.println("To : " + receiver.name());
        System.out.println("Phone Number : " + receiver.phoneNumber());
        System.out.println("Country : " + receiver.country());

    }

    @Override
    public void showList() {

        Item[] items = invoiceRepository.getAllItems();
        for (int i = 0; i < items.length; i++) {

            if (items[i] != null) {
                System.out.println("===============================");
                System.out.println((i + 1) + ". " + items[i].name() + " | " + items[i].QTY() + " | Rp." + items[i].price());
            }

        }

    }

    @Override
    public void showTotal() {
        System.out.println("Total : " + invoiceRepository.totalWithTax());
    }
}
