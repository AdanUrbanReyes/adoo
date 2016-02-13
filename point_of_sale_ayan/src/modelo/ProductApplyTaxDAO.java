package modelo;
public class ProductApplyTaxDAO {
    public static void insert(ProductApplyTax productApplyTax){
        Mysql mysql=new Mysql();
        mysql.update("insert into product_apply_tax value('"+productApplyTax.getBarcodeProduct()+"','"+productApplyTax.getTaxName()+"')");
        mysql.desconnection();
    }
}
