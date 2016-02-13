package controlador;
import javax.swing.JOptionPane;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import vista.Login;
import modelo.EmployeerDAO;
import modelo.Employeer;
import modelo.Boss;
import modelo.BossDAO;
public class DriverOfLogin implements ActionListener,KeyListener{
    /*
        this class is driver of frame or vista login
    */
    private Login vistaLogin;//this is my frame or vista the login
    private Boss boss;
    private BossDAO bossDAO;
    private EmployeerDAO employeerDAO;
    private Employeer employeer;

    public DriverOfLogin(){
        vistaLogin=new Login();
        setActionListeners();
        setKeyListeners();
    }
    public void setActionListeners(){
        vistaLogin.enter.addActionListener(this);
        vistaLogin.goOut.addActionListener(this);    
    }
    public void setKeyListeners(){
        vistaLogin.passwordEnter.addKeyListener(this);
        vistaLogin.passwordEnter.setFocusable(true);
        vistaLogin.userEnter.addKeyListener(this);    
        vistaLogin.userEnter.setFocusable(true);
    }
    public void tryLoginAsWorker(String user,String password){
        employeerDAO=new EmployeerDAO();
        if((employeer=employeerDAO.getWorker(user, password))==null){
            vistaLogin.userNotValido();
        }else{
            vistaLogin.dispose();
            DriverOfIndex driverIndex=new DriverOfIndex();
            driverIndex.setUser(employeer);
        }
    }
    public void tryLoginAsBoss(String user,String password){
        bossDAO=new BossDAO();
        if((boss=bossDAO.getBoss(user, password))==null){
            vistaLogin.userNotValido();
        }else{
            vistaLogin.dispose();
            DriverOfIndex driverIndex=new DriverOfIndex();
            driverIndex.setUser(boss);
        }
    }
    public void validateUser(){
        /*
            in this method is charged for validar user
            geting his password and name and make connection of data base
            atrabes of employeerDAO (EmployeerDAO), for compare this values with state in data base
        */
        String user=vistaLogin.userEnter.getText();//get user typed for user
        String password=String.valueOf(vistaLogin.passwordEnter.getPassword());//get password typed for user
        String typeUser=String.valueOf(vistaLogin.typeOfUserComboBox.getSelectedItem()); //get rango of select user the a jcombobox
        if(user.equals("")||password.equals(""))
            vistaLogin.fieldsEmpty();
        else{
            if(typeUser.equals("Employeer"))
                tryLoginAsWorker(user,password);
            else{
                if(typeUser.equals("Boss"))
                    tryLoginAsBoss(user,password);
                else
                    JOptionPane.showMessageDialog(null,"the option "+typeUser+" in combo box not register","alert",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(((javax.swing.JButton)e.getSource())==vistaLogin.enter){
                validateUser();
        }else{
            if(((javax.swing.JButton)e.getSource())==vistaLogin.goOut){
                    vistaLogin.dispose();
            }
        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        int code=e.getKeyCode();
        if(KeyEvent.VK_ENTER==code)
            validateUser();
    }
    @Override
    public void keyReleased(KeyEvent e){;}    
    @Override
    public void keyTyped(KeyEvent e){;}
    public static void main(String []args){
        DriverOfLogin dl=new DriverOfLogin();
    }
}
