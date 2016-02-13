package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class BossDAO {
    private static Boss boss;
    private static Mysql mysql;
    public static Boss getBoss(String socialSecurityNumber,String password){
        /*
            this method is charget make query of data base 
            and return null if boss not exists else return a boss that concidio with search
        */
        boss=null;
        try{
            mysql=new Mysql();
            ResultSet response=mysql.query("select * from boss where socialSecurityNumber='"+socialSecurityNumber+"' and password=PASSWORD('"+password+"')");
            if(response.next())//was response
                boss=new Boss(socialSecurityNumber,response.getString("name"),response.getString("surname"),password);//build a boss
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.toString(),"error geting worker",JOptionPane.ERROR_MESSAGE);
        }
        mysql.desconnection();
        return boss;//the result set is empty
    }
}
