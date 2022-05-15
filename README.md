# Create-Invoice-App
To create an invoice using the Java programming language and display it in the console.

## Create Invoice

```java
package com.dest.invoiceapp.invoice;

# add information
Information information = new Information(RandomUtils.randomUtil(), "Pembayaran Hosting", true, Payment.CASH);

# add receiver
Receiver receiver = new Receiver("User", "08XX-XXXX-XXXX", "Country");

# add item
invoiceService.addItem("Jelly", 2500, 100);
```

## Example
You can see in ``` com\dest\invoiceapp\invoice\CreateInvoice.java ```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
