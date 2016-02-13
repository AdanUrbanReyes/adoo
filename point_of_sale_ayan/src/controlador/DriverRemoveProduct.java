package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import modelo.Product;
import modelo.ProductDAO;
import vista.AddProduct;
import vista.RemoveProduct;

public class DriverRemoveProduct implements ActionListener,KeyListener{
    private AddProduct vistaAddProduct;
    private RemoveProduct vistaRemoveProduct;
    private String barcode;//barcode product to remove
    public DriverRemoveProduct(){
        vistaRemoveProduct=new RemoveProduct();
        vistaRemoveProduct.remove.setEnabled(false);
        setActionListeners();
        setKeyListeners();
    }
    public void setBarcode(String barcode){// used for driverSearchTable to that when user found product and press enter add product to panel remove
        vistaRemoveProduct.barcodeField.setText(barcode);
        trySetProduct();
    }
    public javax.swing.JPanel getRemoveProductPanel(){
        return vistaRemoveProduct;
    }
    public void setActionListeners(){
        vistaRemoveProduct.search.addActionListener(this);
        vistaRemoveProduct.remove.addActionListener(this);
    }
    public void setKeyListeners(){
        vistaRemoveProduct.barcodeField.addKeyListener(this);
        vistaRemoveProduct.barcodeField.setFocusable(true);
    }
    public void setImage(String route,int width,int height){
        javax.swing.Icon icon=new javax.swing.ImageIcon(new javax.swing.ImageIcon(route).getImage().getScaledInstance(width,height,java.awt.Image.SCALE_DEFAULT));
        vistaAddProduct.imageLabel.setIcon(icon);
    }
    public void changePanelAddProductToRemove(){
        vistaAddProduct.loadImage.hide();
        vistaAddProduct.save.hide();
        vistaAddProduct.haveExpirationLabel.hide();
        vistaAddProduct.yesExpiration.hide();
        vistaAddProduct.noExpiration.hide();
        vistaAddProduct.formatExpirationLabel.hide();
        vistaAddProduct.expirationDateLabel.setText("Expiration: ");
        vistaAddProduct.manageInventaryLabel.hide();
        vistaAddProduct.yesInventary.hide();
        vistaAddProduct.noInventary.hide();
        vistaAddProduct.manageWholesalesLabel.hide();
        vistaAddProduct.yesWholesales.hide();
        vistaAddProduct.noWholesales.hide();
        vistaAddProduct.activateWholesale.hide();
        vistaAddProduct.activateHalfWholesale.hide();
        vistaAddProduct.priceWholesaleLabel.setText("Price Wholesale: ");
        vistaAddProduct.priceHalfWholesaleField.setText("Price Half Wholesale:");
        vistaAddProduct.fromWholesaleLabel.setText("from Wholesale:");
        vistaAddProduct.fromHalfWholesaleField.setText("from Half Wholesale:");    
    }
    public void setProduct(Product product){
        vistaAddProduct=new AddProduct();//first intance vista product
        changePanelAddProductToRemove();//then change modify a little panel 
        vistaAddProduct.barcodeField.setText(product.getBarcode());//fill fields 
        vistaAddProduct.saleTypeField.addItem(product.getSaleType());
        vistaAddProduct.nameField.setText(product.getName());
        vistaAddProduct.buyPriceField.setText(""+product.getBuyPrice());
        vistaAddProduct.salePriceField.setText(""+product.getSalePrice());
        if(product.getTax()==null){
            vistaAddProduct.taxField.addItem("No Tax");
        }else{
            vistaAddProduct.taxField.addItem(product.getTax().getName());
        }
        if(product.getSection()==null){
            vistaAddProduct.sectionField.addItem("No Section");
        }else{
            vistaAddProduct.sectionField.addItem(product.getSection().getName());
        }
        vistaAddProduct.descriptionField.setText(product.getDescription());
        if(product.getExpiration()==null){
            vistaAddProduct.expirationDateLabel.hide();
            vistaAddProduct.expirationField.hide();
        }else{
            vistaAddProduct.expirationField.setText(""+new SimpleDateFormat("MM/dd/yyyy").format(product.getExpiration()));
        }
        if(product.getInventary()==null){
            vistaAddProduct.minimalAmountLabel.hide();
            vistaAddProduct.minimalAmountField.hide();
            vistaAddProduct.inStockLabel.hide();
            vistaAddProduct.inStockField.hide();
        }else{
            vistaAddProduct.minimalAmountField.setText(""+product.getInventary().getAmountMinimal());
            vistaAddProduct.inStockField.setText(""+product.getInventary().getInStock());
        }
        if(product.getWholesale()==null){
            vistaAddProduct.priceWholesaleLabel.hide();
            vistaAddProduct.priceWholesaleField.hide();
            vistaAddProduct.fromWholesaleLabel.hide();
            vistaAddProduct.fromWholesaleField.hide();
        }else{            
            vistaAddProduct.priceWholesaleField.setText(""+product.getWholesale().getPrice());
            vistaAddProduct.fromWholesaleField.setText(""+product.getWholesale().getFrom());
        }
        if(product.getHalfWholesale()==null){
            vistaAddProduct.priceHalfWholesaleLabel.hide();
            vistaAddProduct.priceHalfWholesaleField.hide();
            vistaAddProduct.fromHalfWholesaleLabel.hide();
            vistaAddProduct.fromHalfWholesaleField.hide();
        }else{
            vistaAddProduct.priceHalfWholesaleField.setText(""+product.getHalfWholesale().getPrice());
            vistaAddProduct.fromHalfWholesaleField.setText(""+product.getHalfWholesale().getFrom());
        }
        if(product.getRouteImage()!=null){
            setImage(product.getRouteImage(),600,400);
        }    
    }
    public boolean trySetProduct(){
        vistaRemoveProduct.tabbedPane.removeAll();
        vistaRemoveProduct.remove.setEnabled(false);
        String barcode=vistaRemoveProduct.barcodeField.getText();
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
        vistaRemoveProduct.remove.setEnabled(true);
        vistaRemoveProduct.tabbedPane.add(vistaAddProduct);
        this.barcode=barcode;
        return true;
    }
    public void openSearchTable(){
        DriverSearchTable dst=DriverSearchTable.getInstance();
        dst.setDriverRemoveProduct(this);
    }
    public void removeProduct(){
        if(javax.swing.JOptionPane.showConfirmDialog(null,"are sure remove product "+barcode)==javax.swing.JOptionPane.YES_NO_CANCEL_OPTION)
            return;
        ProductDAO.removeProduct(barcode);
        javax.swing.JOptionPane.showMessageDialog(null,"product removed succefull");
        vistaRemoveProduct.remove.setEnabled(false);
        vistaRemoveProduct.tabbedPane.removeAll();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Object object=e.getSource();
        javax.swing.JButton button;
        if(object instanceof javax.swing.JButton){
            button=(javax.swing.JButton)object;
            if(button==vistaRemoveProduct.search){
                openSearchTable();
            }else{
                if(button==vistaRemoveProduct.remove){
                    removeProduct();
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
            if(textField==vistaRemoveProduct.barcodeField){
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