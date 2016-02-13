package modelo;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
public class TaxDAO {
    public static LinkedList<Tax> getTaxs(){
        Mysql mysql=new Mysql();
        ResultSet response=mysql.query("select * from tax");
        LinkedList <Tax>list=new LinkedList<Tax>();
        try{
            while(response.next())
                list.add(new Tax(response.getString("name"),response.getInt("percent")));
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.toString(),"error getting taxs",JOptionPane.ERROR_MESSAGE);
        }
        mysql.desconnection();
        return list;
    }
    public static Tax existsTax(String taxName){
        Tax tax=null;
        Mysql mysql=new Mysql();
        ResultSet response=mysql.query("select * from tax where name='"+taxName+"'");
        try{
            if(response.next())//ubo response
                tax=new Tax(response.getString("name"),response.getInt("percent"));
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.toString(),"error getting tax for name",JOptionPane.ERROR_MESSAGE);
        }
        mysql.desconnection();
        return tax;
    }
    public static boolean register(Tax tax){
        boolean response;
        Mysql mysql=new Mysql();
        response=mysql.update("insert into tax value('"+tax.getName()+"',"+tax.getPercent()+")");
        mysql.desconnection();
        return response;
    }
}
