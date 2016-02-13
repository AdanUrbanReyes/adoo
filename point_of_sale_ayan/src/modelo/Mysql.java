package modelo;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Mysql {
    private String server="127.0.0.1";
    private String user="root";
    //private String password="61636163";
    //private String password="root";
    private String password="ayani13711?";
    private String dataBase="point_of_sale_ayan";
    private Connection connection;
    private ResultSet response;
    private PreparedStatement query;
    public Mysql(){
        try{
            Class.forName("com.mysql.jdbc.Driver");        
            connection=DriverManager.getConnection("jdbc:mysql://"+server,user,password);
            createDataBase();
            //System.out.print("\nconnection succefull to mysql data base "+dataBase);
        }catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null,cnfe.toString(),"error connecting mysql",JOptionPane.ERROR_MESSAGE);
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.toString(),"error connecting mysql",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void createDataBase(){
        //update("create schema if not exists point_of_sale_ayan");
        update("use point_of_sale_ayan");
        /*update("create table if not exists boss(socialSecurityNumber char(18) not null,name char(23) not null, surname char(23) not null,password char(41) not null, primary key(socialSecurityNumber))");
        update("create table if not exists employeer(socialSecurityNumber char(18) not null,name char(23) not null,surname char(23) not null,password char(41) not null,pay float not null,primary key(socialSecurityNumber))");
        update("create table if not exists schedule_of_work(socialSecurityNumber char(18) not null,day char(9) not null,hourOfIn char(5) not null,hourOfOut char(5) not null,primary key(day,hourOfIn,hourOfOut), foreign key(socialSecurityNumber) references employeer(socialSecurityNumber) on update cascade on delete cascade)");
        update("insert ignore into boss value('UARA931229','Ayan','Urban',PASSWORD('ayani'))");
        update("insert ignore into employeer value('RPA931117','Alejandra','Rios',PASSWORD('alizita'),100)");
        update("insert into schedule_of_work value('RPA931117','Monday','9:00','16:00')");
        update("create table if not exists sale_type(name char(27) not null,primary key(name))");
        update("create table if not exists tax(name char(27) not null,percent int not null,primary key(name))");
        update("create table if not exists section(name char(27) not null,description text,routeImage text,primary key(name))");
        update("create table if not exists product(barcode char(18) not null,saleType char(18) not null,name char(27) not null,buyPrice float not null,salePrice float not null,description text,expiration date,routeImage text,primary key(barcode),foreign key(saleType) references sale_type(name) on update cascade on delete cascade)");
        update("create table if not exists product_apply_tax(barcode char(18) not null,tax char(27) not null,primary key(barcode), foreign key(barcode) references product(barcode) on update cascade on delete cascade,foreign key(tax) references tax(name) on update cascade on delete cascade)");
        update("create table if not exists product_in_section(barcode char(18) not null,section char(27) not null, primary key(barcode),foreign key(barcode) references product(barcode) on update cascade on delete cascade, foreign key(section) references section(name) on update cascade on delete cascade)");
        update("create table if not exists inventary(barcode char(18) not null,amountMinimal int not null,inStock int not null,primary key(barcode), foreign key(barcode) references product(barcode) on update cascade on delete cascade)");
        update("create table if not exists wholesale(barcode char(18) not null, price float not null,fromPieces int not null,primary key(barcode),foreign key(barcode) references product(barcode) on update cascade on delete cascade)");
        update("create table if not exists half_wholesale(barcode char(18) not null,price float not null,fromPieces int not null,primary key(barcode),foreign key(barcode) references product(barcode) on update cascade on delete cascade)");
        update("create table if not exists salesEmployeer(socialSecurityNumber char(18) not null,barcode char(18) not null,dateSale date not null,amountSaled int not null,primary key(socialSecurityNumber,barcode,dateSale),foreign key(socialSecurityNumber) references employeer(socialSecurityNumber) on update cascade on delete cascade, foreign key(barcode) references product(barcode) on update cascade on delete cascade)");
        update("create table if not exists salesBoss(socialSecurityNumber char(18) not null,barcode char(18) not null,dateSale date not null,amountSaled int not null,primary key(socialSecurityNumber,barcode,dateSale),foreign key(socialSecurityNumber) references boss(socialSecurityNumber) on update cascade on delete cascade, foreign key(barcode) references product(barcode) on update cascade on delete cascade)");
        update("insert ignore into tax values('No Tax',0),('IVA',16)");
        update("insert ignore into section value('No Section',null,null)");
        update("insert ignore into sale_type values ('Pieces'),('Liter'),('Weigth')");*/
    }
    public boolean update(String update){
        try{
            query=connection.prepareStatement(update);
            query.executeUpdate();
            return true;
        }catch(SQLException sqle){
            System.out.print("error in update \n"+sqle.toString());
            //JOptionPane.showMessageDialog(null,sqle.toString(),"error connection to data base"+dataBase,JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    public ResultSet query(String query){
        try{
            this.query=connection.prepareStatement(query);
            response=this.query.executeQuery();
        }catch(SQLException sqle){
            System.out.print("\nerror executing query "+sqle.toString());
            //JOptionPane.showMessageDialog(null,"error in query "+query+"\n"+sqle.toString(),"error making query",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return response;
    }
    public void desconnection(){
        try{
            if(query!=null)
                query.close();
            if(response!=null)
                response.close();
            if(connection!=null)
                connection.close();
//            System.out.print("\n the connection close succefull");
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.toString(),"error closing connection",JOptionPane.ERROR_MESSAGE);
        }
    }
}
