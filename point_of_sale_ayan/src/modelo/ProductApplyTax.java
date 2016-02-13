
package modelo;
public class ProductApplyTax {
    private String barcodeProduct;
    private String taxName;

    public ProductApplyTax(String barcodeProduct, String taxName) {
        this.barcodeProduct = barcodeProduct;
        this.taxName = taxName;
    }

    public String getBarcodeProduct() {
        return barcodeProduct;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setBarcodeProduct(String barcodeProduct) {
        this.barcodeProduct = barcodeProduct;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }
    
}
