package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import vista.ManagerSections;
public class DriverManagerSections implements ActionListener,KeyListener{
    private static DriverManagerSections driverManagerSections;//patron singlenton
    private ManagerSections vistaManagerSections;
    private DriverAddProduct dap=null;
    private DriverManagerSections(){
        vistaManagerSections=new ManagerSections();
        setActionListeners();
        setKeyListeners();
        setWindowsListeners();
    }
    public static DriverManagerSections getInstance(){
        if(driverManagerSections==null)
            driverManagerSections=new DriverManagerSections();
        return driverManagerSections;
    }
    public void setWindowsListeners(){
        try{
            vistaManagerSections.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    driverManagerSections=null;
                }
            });
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,"error closing frame manager products");
        }
    }
    public void setActionListeners(){
        vistaManagerSections.add.addActionListener(this);
        vistaManagerSections.remove.addActionListener(this);
        vistaManagerSections.modify.addActionListener(this);
    }
    public void setKeyListeners(){
        vistaManagerSections.addKeyListener(this);
        vistaManagerSections.setFocusable(true);
    }
    public void setPanelAdd(){
        DriverAddSection driverAddSection=new DriverAddSection();
        vistaManagerSections.setPanel(driverAddSection.getAddSection());
    }
    public void setPanelRemove(){;
    
    }
    public void setPanelModify(){;}
    @Override
    public void actionPerformed(ActionEvent e){
        javax.swing.JButton button=(javax.swing.JButton)e.getSource();
        if(button==vistaManagerSections.add){
            setPanelAdd();
        }else{
            if(button==vistaManagerSections.remove){
                setPanelRemove();
            }else{
                if(button==vistaManagerSections.modify){
                    setPanelModify();
                }
            }
        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        int code=e.getKeyCode();
        if(code==KeyEvent.VK_F1){
            setPanelAdd();
        }else{
            if(code==KeyEvent.VK_F2){
                setPanelRemove();
            }else{
                if(code==KeyEvent.VK_F3){
                    setPanelModify();
                }
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e){;}
    @Override
    public void keyTyped(KeyEvent e){;}
}