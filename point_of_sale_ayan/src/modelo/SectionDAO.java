package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.LinkedList;
public class SectionDAO {
    public static LinkedList<Section> getSections(){
        /*this method is charget to make query mysql and geting all sections with all fields*/
        Mysql mysql=new Mysql();
        ResultSet response=mysql.query("select * from section");
        LinkedList<Section> list=new LinkedList<Section>();
        try{
            while(response.next())
                list.add(new Section(response.getString("name"),response.getString("description"),response.getString("routeImage")));
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.toString(),"error geting sections",JOptionPane.ERROR_MESSAGE);
            mysql.desconnection();
            return null;
        }
        mysql.desconnection();
        return list;
    }
    public static boolean register(Section section){
        Mysql mysql=new Mysql();
        boolean response=mysql.update("insert into section value('"+section.getName()+"','"+section.getDescription()+"','"+section.getRouteImage()+"')");
        mysql.desconnection();
        return response;
    }
}
