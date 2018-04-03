package com.aisino.to;

import com.aisino.db2.domain.VerifiedInvoice;
import com.aisino.db2.domain.VerifiedInvoiceDetail;

import java.util.List;

/**
 * Created by zhukaishengy on 2018/3/26.
 */
public class InvoiceRequest {

    private VerifiedInvoice verifiedInvoice;

    private List<VerifiedInvoiceDetail> verifiedInvoiceDetails;

    public VerifiedInvoice getVerifiedInvoice() {
        return verifiedInvoice;
    }

    public void setVerifiedInvoice(VerifiedInvoice verifiedInvoice) {
        this.verifiedInvoice = verifiedInvoice;
    }

    public List<VerifiedInvoiceDetail> getVerifiedInvoiceDetails() {
        return verifiedInvoiceDetails;
    }

    public void setVerifiedInvoiceDetails(List<VerifiedInvoiceDetail> verifiedInvoiceDetails) {
        this.verifiedInvoiceDetails = verifiedInvoiceDetails;
    }

    public InvoiceRequest(VerifiedInvoice verifiedInvoice, List<VerifiedInvoiceDetail> verifiedInvoiceDetails) {
        this.verifiedInvoice = verifiedInvoice;
        this.verifiedInvoiceDetails = verifiedInvoiceDetails;
    }

    public InvoiceRequest() {
    }
}
