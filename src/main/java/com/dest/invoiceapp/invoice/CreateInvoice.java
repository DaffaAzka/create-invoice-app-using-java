package com.dest.invoiceapp.invoice;

import com.dest.invoiceapp.entity.Information;
import com.dest.invoiceapp.entity.Payment;
import com.dest.invoiceapp.entity.Receiver;
import com.dest.invoiceapp.repository.InvoiceRepository;
import com.dest.invoiceapp.repository.InvoiceRepositoryImpl;
import com.dest.invoiceapp.services.InvoiceService;
import com.dest.invoiceapp.services.InvoiceServiceImpl;
import com.dest.invoiceapp.utils.RandomUtils;

public class CreateInvoice {

    public void createInvoice() {

        InvoiceRepository invoiceRepository = new InvoiceRepositoryImpl();
        InvoiceService invoiceService = new InvoiceServiceImpl(invoiceRepository);

//        Add Information

        Information information = new Information(RandomUtils.randomUtil(), "Pembayaran Hosting", true, Payment.CASH);

//        Add Receiver

        Receiver receiver = new Receiver("User", "08XX-XXXX-XXXX", "Country");

//        Add Items

        invoiceService.addItem("Jelly", 2500, 100);
        invoiceService.addItem("Orange", 5500, 10);
        invoiceService.addItem("Berry", 10000, 30);

//        Create Invoice

        invoiceService.showInformation(information);
        System.out.println("------------------------------");
        invoiceService.showReceiver(receiver);
        invoiceService.showList();
        System.out.println("===========================================");
        invoiceService.showTotal();

    }

}
