package controlador;
import vista.ManagerProducts;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class DriverManagerProducts implements ActionListener,KeyListener{
    private static DriverManagerProducts driverManagerProducts;
    private ManagerProducts vistaManagerProducts;
    private DriverAddProduct dap=null;
    private DriverManagerProducts(){
        vistaManagerProducts=new ManagerProducts();
        setActionListeners();
        setKeyListeners();
        setWindowsListeners();
    }
    public static DriverManagerProducts getInstance(){
        if(driverManagerProducts==null)
            driverManagerProducts=new DriverManagerProducts();
        return driverManagerProducts;
    }
    public void setWindowsListeners(){
        try{
            vistaManagerProducts.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    driverManagerProducts=null;
                }
            });
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,"error closing frame manager products");
        }
    }
    public void setActionListeners(){
        vistaManagerProducts.addProductButton.addActionListener(this);
        vistaManagerProducts.removeProductButton.addActionListener(this);
        vistaManagerProducts.modifyProductButton.addActionListener(this);
    }
    public void setKeyListeners(){
        vistaManagerProducts.addKeyListener(this);
        vistaManagerProducts.setFocusable(true);
    }
    public void setPanelAdd(){
        DriverAddProduct dap=new DriverAddProduct();
        vistaManagerProducts.setPanel(dap.getAddProductPanel());
    }
    public void setPanelRemove(){
        DriverRemoveProduct drp=new DriverRemoveProduct();
        vistaManagerProducts.setPanel(drp.getRemoveProductPanel());
    }
    public void setPanelModify(){
        DriverModifyProduct driverManagerProducts=new DriverModifyProduct();
        vistaManagerProducts.setPanel(driverManagerProducts.getModifyProductPanel());
    }
    @Override
    public void actionPerformed(ActionEvent e){
        javax.swing.JButton button=(javax.swing.JButton)e.getSource();
        if(button==vistaManagerProducts.addProductButton){
            setPanelAdd();
        }else{
            if(button==vistaManagerProducts.removeProductButton){
                setPanelRemove();
            }else{
                if(button==vistaManagerProducts.modifyProductButton){
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
