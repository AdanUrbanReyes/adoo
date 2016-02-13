package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import vista.ManagerSections;
import vista.ManagerTax;

public class DriverManagerTaxs implements ActionListener,KeyListener{
    private static DriverManagerTaxs driverManagerTaxs;//patron singlenton
    private ManagerTax vistaManagerTax;
    private DriverAddProduct dap=null;
    private DriverManagerTaxs(){
        vistaManagerTax=new ManagerTax();
        setActionListeners();
        setKeyListeners();
        setWindowsListeners();
    }
    public static DriverManagerTaxs getInstance(){//patron singlenton
        if(driverManagerTaxs==null)
            driverManagerTaxs=new DriverManagerTaxs();
        return driverManagerTaxs;
    }
    public void setWindowsListeners(){
        try{
            vistaManagerTax.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    driverManagerTaxs=null;
                }
            });
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,"error closing frame manager products");
        }
    }
    public void setActionListeners(){
        vistaManagerTax.add.addActionListener(this);
        vistaManagerTax.remove.addActionListener(this);
        vistaManagerTax.modify.addActionListener(this);
    }
    public void setKeyListeners(){
        vistaManagerTax.addKeyListener(this);
        vistaManagerTax.setFocusable(true);
    }
    public void setPanelAdd(){
        DriverAddTax driverAddTax=new DriverAddTax();
        vistaManagerTax.setPanel(driverAddTax.getAddTax());
    }
    public void setPanelRemove(){
;
    }
    public void setPanelModify(){;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        javax.swing.JButton button=(javax.swing.JButton)e.getSource();
        if(button==vistaManagerTax.add){
            setPanelAdd();
        }else{
            if(button==vistaManagerTax.remove){
                setPanelRemove();
            }else{
                if(button==vistaManagerTax.modify){
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