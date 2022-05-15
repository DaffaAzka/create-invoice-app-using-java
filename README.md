# Create-Invoice-App
To create an invoice using the Java programming language and display it in the console.

## Example

```java
InvoiceRepository invoiceRepository = new InvoiceRepositoryImpl();
InvoiceService invoiceService = new InvoiceServiceImpl(invoiceRepository);

Information information = new Information(RandomUtils.randomUtil(), "Pembayaran Hosting", true, Payment.CASH);

Add Receiver

Receiver receiver = new Receiver("User", "08XX-XXXX-XXXX", "Country");

invoiceService.addItem("Jelly", 2500, 100);
invoiceService.addItem("Orange", 5500, 10);
invoiceService.addItem("Berry", 10000, 30);

invoiceService.showInformation(information);
System.out.println("------------------------------");
invoiceService.showReceiver(receiver);
invoiceService.showList();
System.out.println("===========================================");
invoiceService.showTotal();
```
Or you can see in ``` com\dest\invoiceapp\invoice\CreateInvoice.java ```

## In console
```bash
INVOICE#4734
Subject : Pembayaran Hosting
Status : Success
Payment : CASH
------------------------------
To : User
Phone Number : 08XX-XXXX-XXXX
Country : Country
===============================
1. Jelly | 100 | Rp.2500
===============================
2. Orange | 10 | Rp.5500
===============================
3. Berry | 30 | Rp.10000
===========================================
Total : 608000
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
