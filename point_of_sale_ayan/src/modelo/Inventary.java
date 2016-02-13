package modelo;
public class Inventary {
    private String barcodeProduct;
    private int amountMinimal;
    private int inStock;
    public Inventary(String barcodeProduct, int amountMinimal, int inStock) {
        this.barcodeProduct = barcodeProduct;
        this.amountMinimal = amountMinimal;
        this.inStock = inStock;
    }

    public String getBarcodeProduct() {
        return barcodeProduct;
    }

    public int getAmountMinimal() {
        return amountMinimal;
    }

    public int getInStock() {
        return inStock;
    }

    public void setBarcodeProduct(String barcodeProduct) {
        this.barcodeProduct = barcodeProduct;
    }

    public void setAmountMinimal(int amountMinimal) {
        this.amountMinimal = amountMinimal;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}