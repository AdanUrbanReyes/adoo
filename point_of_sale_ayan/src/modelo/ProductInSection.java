package modelo;
public class ProductInSection {
    private String barcodeProduct;
    private String nameSection;

    public ProductInSection(String barcodeProduct, String nameSection) {
        this.barcodeProduct = barcodeProduct;
        this.nameSection = nameSection;
    }

    public String getBarcodeProduct() {
        return barcodeProduct;
    }

    public String getNameSection() {
        return nameSection;
    }

    public void setBarcodeProduct(String barcodeProduct) {
        this.barcodeProduct = barcodeProduct;
    }

    public void setNameSection(String nameSection) {
        this.nameSection = nameSection;
    }
    
}
