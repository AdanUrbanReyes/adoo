package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InventaryDAO {
    public static void insert(Inventary inventary){
        Mysql mysql=new Mysql();
        mysql.update("insert into inventary value('"+inventary.getBarcodeProduct()+"',"+inventary.getAmountMinimal()+","+inventary.getInStock()+")");
        mysql.desconnection();
    }
    public static boolean updateInStock(String barcodeProduct,int inStock){
        boolean updateOk=false;
        Mysql mysql=new Mysql();
        updateOk=mysql.update("update inventary set inStock="+inStock+" where barcode='"+barcodeProduct+"'");
        mysql.desconnection();
        return updateOk;
    }
    public static Inventary getInventary(String barcodeProduct){
        Inventary inventary=null;
        Mysql mysql=new Mysql();
        ResultSet response=mysql.query("select * from inventary where barcode='"+barcodeProduct+"'");
        try{
            if(response.next())
                inventary=new Inventary(response.getString("barcode"),response.getInt("amountMinimal"),response.getInt("inStock"));
        }catch(SQLException sqle){
            System.out.print("\n error geting inventary"+sqle.toString());
        }
        mysql.desconnection();
        return inventary;
    }
}
