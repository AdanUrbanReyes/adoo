package modelo;
public class WholesaleDAO {
    public static void insert(Wholesale wholesale){
        Mysql mysql=new Mysql();
        mysql.update("insert into wholesale value('"+wholesale.getBarcodeProduct()+"',"+wholesale.getPrice()+","+wholesale.getFrom()+")");
        mysql.desconnection();
    }    
}
