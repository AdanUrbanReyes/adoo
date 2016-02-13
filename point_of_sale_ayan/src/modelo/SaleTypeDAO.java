package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.LinkedList;
public class SaleTypeDAO {
    public static LinkedList <SaleType> getSalesType(){
        Mysql mysql=new Mysql();
        ResultSet response=mysql.query("select * from sale_type");
        LinkedList <SaleType> list=new LinkedList<SaleType>();
        try{
            while(response.next())//was response
                list.add(new SaleType(response.getString("name")));
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.toString(),"error geting sale types",JOptionPane.ERROR_MESSAGE);
        }
        mysql.desconnection();
        return list;        
    }
}
