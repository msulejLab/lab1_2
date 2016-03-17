package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public abstract class InvoiceFactory {
    public static Invoice getInvoice(Id invoiceId, ClientData client) {
        return new Invoice(invoiceId, client);
    }
}
