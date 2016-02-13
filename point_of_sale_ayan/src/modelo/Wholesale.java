package modelo;
public class Wholesale {
    private String barcodeProduct;
    private Float price;
    private int from;

    public Wholesale(String barcodeProduct, Float price, int from) {
        this.barcodeProduct = barcodeProduct;
        this.price = price;
        this.from = from;
    }

    public String getBarcodeProduct() {
        return barcodeProduct;
    }

    public Float getPrice() {
        return price;
    }

    public int getFrom() {
        return from;
    }

    public void setBarcodeProduct(String barcodeProduct) {
        this.barcodeProduct = barcodeProduct;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setFrom(int from) {
        this.from = from;
    }
    
}
