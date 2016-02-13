package modelo;
public class HalfWholesaleDAO {
    public static void insert(HalfWholesale halfWholesale){
        Mysql mysql=new Mysql();
        mysql.update("insert into half_wholesale value('"+halfWholesale.getBarcodeProduct()+"',"+halfWholesale.getPrice()+","+halfWholesale.getFrom()+")");
        mysql.desconnection();
    }
}
