package modelo;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
public class EmployeerDAO {
    private static Mysql mysql;
    private static Employeer employeer;
    public static LinkedList <ScheduleOfWork> getSchedule(ResultSet response){
        /*
            this method is charged to recolectar schedule of work apartir of
            result set received 
        */
        LinkedList <ScheduleOfWork> list=new LinkedList<ScheduleOfWork>();
        try{
            response.first();
            while(response.next())
                list.add(new ScheduleOfWork(response.getString("day"),response.getString("hourOfIn"),response.getString("hourOfOut")));
        }catch(SQLException sqle){
            System.out.print("error getShedule EmployeerDAO\n"+sqle.toString());
        }
        return list;
    }
    public static Employeer getWorker(String socialSecurityNumber,String password){
        /*
            this method is charget make query of data base 
            and return null if employeer not exists else return a employeer that concidio with search
        */
        employeer=null;
        try{
            mysql=new Mysql();
            ResultSet response=mysql.query("select * from employeer natural join schedule_of_work where employeer.socialSecurityNumber='"+socialSecurityNumber+"' and password=PASSWORD('"+password+"')");
            if(response.next())//was response
                employeer=new Employeer(socialSecurityNumber,response.getString("name"),response.getString("surname"),password,response.getFloat("pay"),getSchedule(response));
        }catch(SQLException sqle){
            System.out.print("error getWorker EmployeerDAO\n"+sqle.toString());
        }
        mysql.desconnection();
        return employeer;//the result set is empty
    }
}
