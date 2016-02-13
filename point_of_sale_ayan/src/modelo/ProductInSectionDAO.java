package modelo;
public class ProductInSectionDAO {
    public static void insert(ProductInSection productInSection){
        Mysql mysql=new Mysql();
        mysql.update("insert into product_in_section value('"+productInSection.getBarcodeProduct()+"','"+productInSection.getNameSection()+"')");
        mysql.desconnection();
    }
}
