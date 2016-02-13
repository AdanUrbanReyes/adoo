package controlador;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import vista.Index;
import modelo.Boss;
import modelo.Employeer;
public class DriverOfIndex implements ActionListener,KeyListener{
    private Index vistaIndex;
    private Boss boss;
    private Employeer employeer;

    public DriverOfIndex(){
        vistaIndex=new Index();
        setActionListeners();
        setKeyListener();
    }
    public void setActionListeners(){
        vistaIndex.salesButton.addActionListener(this);
        vistaIndex.productsButton.addActionListener(this);
        vistaIndex.providersButton.addActionListener(this);
        vistaIndex.clientsButton.addActionListener(this);
        vistaIndex.configurationButton.addActionListener(this);
        vistaIndex.goOutButton.addActionListener(this);
        vistaIndex.stocktakingButton.addActionListener(this);    
    }
    public void setKeyListener(){
        vistaIndex.addKeyListener(this);
        vistaIndex.setFocusable(true);
    
    }
    public void setUser(Employeer employeer){
        this.employeer=employeer;
        vistaIndex.putTextInWelcom("Welcome "+employeer.getName()+" "+employeer.getSurname());
    }
    public void setUser(Boss boss){
        this.boss=boss;
        vistaIndex.putTextInWelcom("Welcome "+boss.getName()+" "+boss.getSurname());
    }
    public void openFrameLogin(){
        vistaIndex.dispose();
        DriverOfLogin dl=new DriverOfLogin();
    }
    public void openFrameProducts(){
        DriverManagerProducts driverManagerProducts=DriverManagerProducts.getInstance();
    }
    public void openFrameSale(){
        DriverSale driverSale=DriverSale.getInstance();
        driverSale.setBoss(boss);
        driverSale.setEmployeer(employeer);
    }
    public void openManagerSectionsProduct(){
        DriverManagerSections driverManagerSections=DriverManagerSections.getInstance();
    }
    public void openManagerTaxsProduct(){
        DriverManagerTaxs driverManagerTax=DriverManagerTaxs.getInstance();
    }
    public void openInventoryControl(){
        DriverInventoryControl driverInventoryControl=DriverInventoryControl.getInstance();
        
    }
    public void actionPerformed(ActionEvent e){
        JButton button=(JButton)e.getSource();
        if(button==vistaIndex.salesButton){
            openFrameSale();
        }else{
            if(button==vistaIndex.productsButton){
                openFrameProducts();
            }else{
                if(button==vistaIndex.providersButton){
                    openManagerSectionsProduct();
                }else{
                    if(button==vistaIndex.stocktakingButton){
                        openInventoryControl();
                    }else{
                        if(button==vistaIndex.clientsButton){
                            openManagerTaxsProduct();
                        }else{
                            if(button==vistaIndex.goOutButton){
                                System.out.print("\ngo out");
                                openFrameLogin();
                            }else{
                                if(button==vistaIndex.configurationButton){
                                    System.out.print("\nconfiguration");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        int code=e.getKeyCode();
        if(KeyEvent.VK_F1==code){
            openFrameSale();
        }else{
            if(KeyEvent.VK_F2==code){
                openFrameProducts();
            }else{
                if(KeyEvent.VK_F3==code){
                    openManagerSectionsProduct();
                }else{
                    if(KeyEvent.VK_F4==code){
                        openInventoryControl();
                    }else{
                        if(KeyEvent.VK_F5==code){
                            openManagerTaxsProduct();
                        }else{
                            if(KeyEvent.VK_ESCAPE==code){
                                System.out.print("\ngo out");
                                openFrameLogin();
                            }else{
                                if(KeyEvent.VK_C==code){
                                    System.out.print("\nkey configuration");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e){;}
    @Override
    public void keyTyped(KeyEvent e){;}
}
