package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
public class ProductDAO {
    public static boolean existsProduct(String barcode){
        Mysql mysql=new Mysql();;
        ResultSet response;
        boolean flat=false;
        response=mysql.query("select barcode from product where barcode='"+barcode+"'");
        try{
            if(response.next())
                flat=true;
        }catch(SQLException sqle){
            System.out.print("\n error in existsProduct "+sqle.toString());
        }
        mysql.desconnection();
        return flat;
    }
    public static boolean removeProduct(String barcode){
        boolean flat=false;
        Mysql mysql=new Mysql();
        flat=mysql.update("delete from product where barcode='"+barcode+"'");
        mysql.desconnection();
        return flat;
    }
    public static boolean insert(Product product){
        /*
            insert a new product received to data base 
        */
        boolean updateOk=false;
        if(existsProduct(product.getBarcode())){
            javax.swing.JOptionPane.showMessageDialog(null,"the product exists then dont was added");
            return updateOk;
        }
        Mysql mysql=new Mysql();

        String expirationAux=null;
        Date expiration=product.getExpiration();
        Tax tax=product.getTax();
        Section section=product.getSection();
        Inventary inventary=product.getInventary();
        Wholesale wholesale=product.getWholesale();
        HalfWholesale halfWholesale=product.getHalfWholesale();
        SimpleDateFormat formatDate=new SimpleDateFormat("yyyy-MM-dd");        
        if(expiration!=null){
            expirationAux=""+formatDate.format(expiration);
        }
        updateOk=mysql.update("insert into product value('"+product.getBarcode()+"','"+product.getSaleType()+"','"+product.getName()+"',"+product.getBuyPrice()+","+product.getSalePrice()+",'"+product.getDescription()+"','"+expirationAux+"','"+product.getRouteImage()+"')");
        if(tax!=null){
            ProductApplyTaxDAO.insert(new ProductApplyTax(product.getBarcode(),tax.getName()));
            //mysql.update("insert into product_apply_tax value('"+product.getBarcode()+"','"+tax.getName()+"')");
        }
        if(section!=null){
            ProductInSectionDAO.insert(new ProductInSection(product.getBarcode(),section.getName()));
            //mysql.update("insert into product_in_section value('"+product.getBarcode()+"','"+section.getName()+"')");
        }
        if(inventary!=null){
            InventaryDAO.insert(inventary);
            //mysql.update("insert into inventary value('"+product.getBarcode()+"',"+inventary.getAmountMinimal()+","+inventary.getInStock()+")");
        }
        if(wholesale!=null){
            WholesaleDAO.insert(wholesale);
            //mysql.update("insert into wholesale value('"+product.getBarcode()+"',"+wholesale.getPrice()+","+wholesale.getFrom()+")");
        }
        if(halfWholesale!=null){
            HalfWholesaleDAO.insert(halfWholesale);
//            mysql.update("insert into half_wholesale value('"+product.getBarcode()+"',"+halfWholesale.getPrice()+","+halfWholesale.getFrom()+")");
        }
        mysql.desconnection();
        return updateOk;
    }
    public static Product getProduct(String barcode){
        Product product=null;
        Mysql mysql=new Mysql();
        ResultSet response;
        try{
            response=mysql.query("select * from product where barcode='"+barcode+"'");
            if(response.next()){
                        product=new Product(response.getString("barcode"),response.getString("saleType"),response.getString("name"),response.getFloat("buyPrice"),response.getFloat("salePrice"),response.getString("description"),response.getString("routeImage"));
                        product.setExpiration(response.getDate("expiration"));
            }else{
                return null;
            }
            response=mysql.query("select name,percent from (select tax from product_apply_tax where barcode='"+barcode+"') as temp,tax where tax=name");
            if(response.next()){
                product.setTax(new Tax(response.getString("name"),response.getInt("percent")));
            }
            response=mysql.query("select name,description,routeImage from (select section from product_in_section where barcode='"+barcode+"') as temp,section where section=name");
            if(response.next()){
                product.setSection(new Section(response.getString("name"),response.getString("description"),response.getString("routeImage")));
            }
            response=mysql.query("select * from inventary where barcode='"+barcode+"'");
            if(response.next()){
                product.setInventary(new Inventary(barcode,response.getInt("amountMinimal"),response.getInt("inStock")));
            }
            response=mysql.query("select * from wholesale where barcode='"+barcode+"'");
            if(response.next()){
                product.setWholesale(new Wholesale(barcode,response.getFloat("price"),response.getInt("fromPieces")));
            }            
            response=mysql.query("select * from half_wholesale where barcode='"+barcode+"'");
            if(response.next()){
                product.setHalfWholesale(new HalfWholesale(barcode,response.getFloat("price"),response.getInt("fromPieces")));
            }            
        }catch(SQLException sqle){
            System.out.print("error geting product "+sqle.toString());
            //JOptionPane.showMessageDialog(null,sqle.toString(),"error creating product",JOptionPane.ERROR_MESSAGE);
        }
        return product;
    }
    public static LinkedList<Product> getAllProducts(){
        LinkedList<Product> list=new LinkedList<Product>();
        Mysql mysql=new Mysql();
        ResultSet response=mysql.query("select barcode from product");
        try{
            while(response.next()){
                list.add(getProduct(response.getString("barcode")));
            }
        }catch(SQLException sqle){
            System.out.print("\nerror gettin all products "+sqle.toString());
        }
        mysql.desconnection();
        return list;
    }
}
