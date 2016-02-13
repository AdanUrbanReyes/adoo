package modelo;
import java.util.Date;
public class Product {
    private String barcode;
    private String saleType;
    private String name;
    private Float buyPrice;
    private Float salePrice;
    private String description;
    private Date expiration;    
    private String routeImage;
    private Tax tax;
    private Section section;
    private Inventary inventary;
    private Wholesale wholesale;
    private HalfWholesale halfWholesale;
    public Product(String barcode, String saleType, String name, Float buyPrice, Float salePrice, String description,String routeImage) {
        this.barcode = barcode;
        this.saleType = saleType;
        this.name = name;
        this.buyPrice = buyPrice;
        this.salePrice = salePrice;
        this.description = description;
        this.routeImage = routeImage;
    }   

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public void setInventary(Inventary inventary) {
        this.inventary = inventary;
    }

    public void setWholesale(Wholesale wholesale) {
        this.wholesale = wholesale;
    }

    public void setHalfWholesale(HalfWholesale halfWholesale) {
        this.halfWholesale = halfWholesale;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getSaleType() {
        return saleType;
    }

    public String getName() {
        return name;
    }

    public Float getBuyPrice() {
        return buyPrice;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public String getDescription() {
        return description;
    }

    public Date getExpiration() {
        return expiration;
    }

    public String getRouteImage() {
        return routeImage;
    }

    public Tax getTax() {
        return tax;
    }

    public Section getSection() {
        return section;
    }

    public Inventary getInventary() {
        return inventary;
    }

    public Wholesale getWholesale() {
        return wholesale;
    }

    public HalfWholesale getHalfWholesale() {
        return halfWholesale;
    }
    
}