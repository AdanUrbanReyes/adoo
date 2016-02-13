package modelo;

import java.text.SimpleDateFormat;

public class SalesDAO {
    public static boolean insertSale(Sales sale){
        Mysql mysql=new Mysql();
        boolean updateOk=false;
        String table=null;
        String curp=null;
        SimpleDateFormat formatDate=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
        if(sale.getBoss()!=null){
            table="salesBoss";
            curp=sale.getBoss().getSocialSecurityNumber();
        }
        if(sale.getEmployeer()!=null){
            table="salesEmployeer";
            curp=sale.getEmployeer().getCurp();
        }
        mysql.update("insert into "+table+" value('"+curp+"','"+sale.getBarcodeProduc()+"','"+formatDate.format(sale.getDate())+"',"+sale.getAmountSale()+")");
        mysql.desconnection();
        return updateOk;
    }
}
