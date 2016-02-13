package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import modelo.Product;
import modelo.ProductDAO;
import vista.AddProduct;
import vista.ModifyProduct;

public class DriverModifyProduct implements ActionListener,KeyListener{
    private DriverAddProduct dap;
    private ModifyProduct vistaModifyProduct;
    private String barcode;
    public DriverModifyProduct(){
        vistaModifyProduct=new ModifyProduct();
        vistaModifyProduct.modify.setEnabled(false);        
        setActionListeners();
        setKeyListeners();
    }
    public void setBarcode(String barcode){// used for driverSearchTable to that when user found product and press enter add product to panel remove
        vistaModifyProduct.barcodeField.setText(barcode);
        trySetProduct();
    }
    public javax.swing.JPanel getModifyProductPanel(){
        return vistaModifyProduct;
    }
    public void setActionListeners(){
        vistaModifyProduct.search.addActionListener(this);
        vistaModifyProduct.modify.addActionListener(this);
    }
    public void setKeyListeners(){
        vistaModifyProduct.barcodeField.addKeyListener(this);
        vistaModifyProduct.barcodeField.setFocusable(true);
    }
    public void setImage(String route,int width,int height,AddProduct addProduct){
        javax.swing.Icon icon=new javax.swing.ImageIcon(new javax.swing.ImageIcon(route).getImage().getScaledInstance(width,height,java.awt.Image.SCALE_DEFAULT));
        addProduct.imageLabel.setIcon(icon);
    }    
    public void setProduct(Product product){
        dap=new DriverAddProduct();
        AddProduct temp=dap.getAddProductPanel();
        temp.save.hide();
        temp.barcodeField.setText(product.getBarcode());//fill fields 
        temp.saleTypeField.setSelectedItem(product.getSaleType());
        temp.nameField.setText(product.getName());
        temp.buyPriceField.setText(""+product.getBuyPrice());
        temp.salePriceField.setText(""+product.getSalePrice());
        if(product.getTax()==null){
            temp.taxField.setSelectedItem("No Tax");
        }else{
            temp.taxField.setSelectedItem(product.getTax().getName());
        }
        if(product.getSection()==null){
            temp.sectionField.setSelectedItem("No Section");
        }else{
            temp.sectionField.setSelectedItem(product.getSection().getName());
        }
        temp.descriptionField.setText(product.getDescription());
        if(product.getExpiration()!=null){
            temp.yesExpiration.doClick();//click yes expiration calling action performed 
            temp.expirationField.setText(""+new SimpleDateFormat("MM/dd/yyyy").format(product.getExpiration()));
        }
        if(product.getInventary()!=null){
            temp.yesInventary.doClick();//click yes inventary calling action performed 
            temp.minimalAmountField.setText(""+product.getInventary().getAmountMinimal());
            temp.inStockField.setText(""+product.getInventary().getInStock());
        }
        if(product.getWholesale()!=null||product.getHalfWholesale()!=null)
            temp.yesWholesales.doClick();//click yes wholesale calling action performed 
        if(product.getWholesale()!=null){
            temp.activateWholesale.doClick();////click activate wholesale calling action performed 
            temp.priceWholesaleField.setText(""+product.getWholesale().getPrice());
            temp.fromWholesaleField.setText(""+product.getWholesale().getFrom());
        }
        if(product.getHalfWholesale()!=null){
            temp.activateHalfWholesale.doClick();//click yes half wholesale calling action performed 
            temp.priceHalfWholesaleField.setText(""+product.getHalfWholesale().getPrice());
            temp.fromHalfWholesaleField.setText(""+product.getHalfWholesale().getFrom());
        }
        if(product.getRouteImage()!=null){
            setImage(product.getRouteImage(),600,400,temp);
        }            
    }
    public boolean trySetProduct(){
        vistaModifyProduct.tabbedPane.removeAll();
        vistaModifyProduct.modify.setEnabled(false);
        String barcode=vistaModifyProduct.barcodeField.getText();
        if(barcode.equals("")){
            javax.swing.JOptionPane.showMessageDialog(null,"please enter barcode to search product");
            return false;
        }
        Product product=ProductDAO.getProduct(barcode);
        if(product==null){
            javax.swing.JOptionPane.showMessageDialog(null,"product not founded");
            return false;
        }
        setProduct(product);
        vistaModifyProduct.modify.setEnabled(true);
        vistaModifyProduct.tabbedPane.add(dap.getAddProductPanel());
        this.barcode=barcode;
        return true;        
    }
    public void openSearchTable(){
        DriverSearchTable dst=DriverSearchTable.getInstance();
        dst.setDriverModifyProduct(this);
    }
    public void modifyProduct(){
        if(javax.swing.JOptionPane.showConfirmDialog(null,"are sure modify product "+barcode)==javax.swing.JOptionPane.YES_NO_CANCEL_OPTION){
            return;
        }
        ProductDAO.removeProduct(barcode);
        dap.getAddProductPanel().save.doClick();
        vistaModifyProduct.modify.setEnabled(false);
        vistaModifyProduct.tabbedPane.removeAll();        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Object object=e.getSource();
        javax.swing.JButton button;
        if(object instanceof javax.swing.JButton){
            button=(javax.swing.JButton)object;
            if(button==vistaModifyProduct.search){
                openSearchTable();
            }else{
                if(button==vistaModifyProduct.modify){
                    modifyProduct();
                }
            }
        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        Object object=e.getSource();
        int code=e.getKeyCode();
        javax.swing.JTextField textField;
        if(object instanceof javax.swing.JTextField){
            textField=(javax.swing.JTextField)object;
            if(textField==vistaModifyProduct.barcodeField){
                if(code==KeyEvent.VK_ENTER){
                    trySetProduct();
                }
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e){;}
    @Override
    public void keyTyped(KeyEvent e){;}    
}
