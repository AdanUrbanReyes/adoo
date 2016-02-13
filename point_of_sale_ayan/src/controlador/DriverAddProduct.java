package controlador;
import vista.AddProduct;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;
import java.util.LinkedList;
import modelo.HalfWholesale;
import modelo.Inventary;
import modelo.Product;
import modelo.ProductApplyTax;
import modelo.ProductDAO;
import modelo.SaleType;
import modelo.SaleTypeDAO;
import modelo.Section;
import modelo.SectionDAO;
import modelo.Tax;
import modelo.TaxDAO;
import modelo.Wholesale;
public class DriverAddProduct implements ActionListener,KeyListener{
    private AddProduct vistaAddProduct;
    private String routeImage="src/imagenes/productSinImage.gif";
    public DriverAddProduct(){
        vistaAddProduct=new AddProduct();
        setImage(routeImage,600,400);
        setActionListeners();
        setKeyListeners();
        loadSaleTypes();
        loadSections();
        loadTax();
        restartFields();
    }
    public AddProduct getAddProductPanel(){
        return vistaAddProduct;
    }
    public void setActionListeners(){
        vistaAddProduct.save.addActionListener(this);
        vistaAddProduct.loadImage.addActionListener(this);
        vistaAddProduct.yesExpiration.addActionListener(this);
        vistaAddProduct.noExpiration.addActionListener(this);
        vistaAddProduct.yesInventary.addActionListener(this);
        vistaAddProduct.noInventary.addActionListener(this);
        vistaAddProduct.yesWholesales.addActionListener(this);
        vistaAddProduct.noWholesales.addActionListener(this);
        vistaAddProduct.activateWholesale.addActionListener(this);
        vistaAddProduct.activateHalfWholesale.addActionListener(this);
    }    
    public void setKeyListeners(){;}
        public void loadTax(){
        LinkedList <Tax> list=TaxDAO.getTaxs();
        int i;
        vistaAddProduct.taxField.removeAllItems();
        for(i=0;i<list.size();i++)
            vistaAddProduct.taxField.addItem(list.get(i).getName());
    }
    public void loadSections(){
        LinkedList <Section> list=SectionDAO.getSections();
        int i;
        vistaAddProduct.sectionField.removeAllItems();
        for(i=0;i<list.size();i++)
            vistaAddProduct.sectionField.addItem(list.get(i).getName());
    }
    public void loadSaleTypes(){
        LinkedList <SaleType> list=SaleTypeDAO.getSalesType();
        int i;
        vistaAddProduct.saleTypeField.removeAllItems();
        for(i=0;i<list.size();i++)
            vistaAddProduct.saleTypeField.addItem(list.get(i).getName());
    }
    public void des_activateExpiration(boolean flat){
        vistaAddProduct.formatExpirationLabel.setEnabled(flat);
        vistaAddProduct.expirationDateLabel.setEnabled(flat);
        vistaAddProduct.expirationField.setEnabled(flat);
    }
    public void des_activateInventary(boolean flat){
        vistaAddProduct.minimalAmountLabel.setEnabled(flat);
        vistaAddProduct.minimalAmountField.setEnabled(flat);
        vistaAddProduct.inStockLabel.setEnabled(flat);
        vistaAddProduct.inStockField.setEnabled(flat);
    }
    public void des_activateWholesale(boolean flat){//push or not push checkbox wholesale
        vistaAddProduct.priceWholesaleLabel.setEnabled(flat);
        vistaAddProduct.priceWholesaleField.setEnabled(flat);
        vistaAddProduct.fromWholesaleLabel.setEnabled(flat);
        vistaAddProduct.fromWholesaleField.setEnabled(flat);
    }
    public void des_activateHalfWholesale(boolean flat){//push or not push checkbox half wholesale
        vistaAddProduct.priceHalfWholesaleLabel.setEnabled(flat);
        vistaAddProduct.priceHalfWholesaleField.setEnabled(flat);
        vistaAddProduct.fromHalfWholesaleLabel.setEnabled(flat);
        vistaAddProduct.fromHalfWholesaleField.setEnabled(flat);        
    }    
    public void des_activateWholesales(boolean flat){
        vistaAddProduct.activateWholesale.setEnabled(flat);
        vistaAddProduct.activateHalfWholesale.setEnabled(flat);
        if(!flat){
            des_activateWholesale(flat);
            des_activateHalfWholesale(flat);        
        }
        vistaAddProduct.activateWholesale.setSelected(false);
        vistaAddProduct.activateHalfWholesale.setSelected(false);        
    }
    public void restartFields(){
        vistaAddProduct.barcodeField.setText("");
        //saleTypeField.setSelectedIndex(0);
        vistaAddProduct.nameField.setText("");
        vistaAddProduct.buyPriceField.setText("0");
        vistaAddProduct.salePriceField.setText("0");
        vistaAddProduct.taxField.setSelectedIndex(0);
        vistaAddProduct.sectionField.setSelectedIndex(0);
        vistaAddProduct.descriptionField.setText("");
        
        des_activateExpiration(false);
        vistaAddProduct.yesExpiration.setSelected(false);
        vistaAddProduct.noExpiration.setSelected(false);
        vistaAddProduct.expirationField.setText("12/31/9999");
        
        des_activateInventary(false);
        vistaAddProduct.yesInventary.setSelected(false);
        vistaAddProduct.noInventary.setSelected(false);
        vistaAddProduct.minimalAmountField.setText("0");
        vistaAddProduct.inStockField.setText("0");
        
        des_activateWholesales(false);
        vistaAddProduct.yesWholesales.setSelected(false);
        vistaAddProduct.noWholesales.setSelected(false);
        
        vistaAddProduct.priceWholesaleField.setText("0");
        vistaAddProduct.fromWholesaleField.setText("0");
        vistaAddProduct.priceHalfWholesaleField.setText("0");
        vistaAddProduct.fromHalfWholesaleField.setText("0");
    }    
    public File selectImage(){
        javax.swing.JFileChooser selector=new javax.swing.JFileChooser();
        File image=null;
        int error=selector.showOpenDialog(null);    
        //selector.setFileFilter(null);
        if(error==javax.swing.JFileChooser.APPROVE_OPTION)//push button aceptar
            image=selector.getSelectedFile();
        return image;
    }   
    public void setImage(String route,int width,int height){
        javax.swing.Icon icon=new javax.swing.ImageIcon(new javax.swing.ImageIcon(route).getImage().getScaledInstance(width,height,java.awt.Image.SCALE_DEFAULT));
        vistaAddProduct.imageLabel.setIcon(icon);
    }    
    public void loadImage(){
        File image=selectImage();
        if(image==null){
            javax.swing.JOptionPane.showMessageDialog(null,"not selected any file");
            return;
        }
        routeImage=image.getAbsolutePath();
        setImage(routeImage,600,400);
    }
    public Product buildProduct(){
        Product product;
        String barcode=vistaAddProduct.barcodeField.getText();
        if(barcode.equals("")){
            javax.swing.JOptionPane.showMessageDialog(null,"barcode is field obligatorio please enter one");
            return null;
        }
        String saleType=String.valueOf(vistaAddProduct.saleTypeField.getSelectedItem());
        String name=vistaAddProduct.nameField.getText();
        if(name.equals("")){
            javax.swing.JOptionPane.showMessageDialog(null,"name is field obligatorio please enter one");
            return null;
        }
        float buyPrice=Float.parseFloat(vistaAddProduct.buyPriceField.getText());
        float salePrice=Float.parseFloat(vistaAddProduct.salePriceField.getText());
        if(salePrice<=buyPrice){
            if(javax.swing.JOptionPane.showConfirmDialog(null,"sale price is less or same than buy price are you sure wanna continue?")==javax.swing.JOptionPane.NO_OPTION)
                return null;
        }
        String description=vistaAddProduct.descriptionField.getText();
        if(description.equals("")){
            javax.swing.JOptionPane.showMessageDialog(null,"description is field obligatorio please enter one");
            return null;        
        }
        product=new Product(barcode, saleType, name, buyPrice, salePrice, description, routeImage);
        if(vistaAddProduct.yesExpiration.isSelected()&&!vistaAddProduct.expirationField.getText().equals(""))
            product.setExpiration(new Date(vistaAddProduct.expirationField.getText()));

        String tax=String.valueOf(vistaAddProduct.taxField.getSelectedItem());
        if(!tax.equals("No Tax")){
            product.setTax(new Tax(tax,0));
        }        
        String section=String.valueOf(vistaAddProduct.sectionField.getSelectedItem());
        if(!section.equals("No Section")){
            product.setSection(new Section(section,null,null));
        }
        if(vistaAddProduct.yesInventary.isSelected())
            product.setInventary(new Inventary(barcode,Integer.parseInt(vistaAddProduct.minimalAmountField.getText()),Integer.parseInt(vistaAddProduct.inStockField.getText())));
        if(vistaAddProduct.yesWholesales.isSelected()){
            float priceWholesale=0,priceHalfWholesale=0;
            int fromWholesale=0,fromHalfWholesale=0;
            if(vistaAddProduct.activateWholesale.isSelected()){
                priceWholesale=Float.parseFloat(vistaAddProduct.priceWholesaleField.getText());
                fromWholesale=Integer.parseInt(vistaAddProduct.fromWholesaleField.getText());
                if(priceWholesale<=buyPrice){
                    javax.swing.JOptionPane.showMessageDialog(null,"price wholesale is less or same than buy price please check this");
                    return null;
                }
                product.setWholesale(new Wholesale(barcode,priceWholesale,fromWholesale));
            }
            if(vistaAddProduct.activateHalfWholesale.isSelected()){
                priceHalfWholesale=Float.parseFloat(vistaAddProduct.priceHalfWholesaleField.getText());
                fromHalfWholesale=Integer.parseInt(vistaAddProduct.fromHalfWholesaleField.getText());
                if(priceHalfWholesale<=buyPrice){
                    javax.swing.JOptionPane.showMessageDialog(null,"price half wholesale is less or same than buy price please check this");
                    return null;
                }                
                product.setHalfWholesale(new HalfWholesale(barcode,priceHalfWholesale,fromHalfWholesale));
            }
            if(vistaAddProduct.activateWholesale.isSelected()&&vistaAddProduct.activateHalfWholesale.isSelected()){
                if(fromHalfWholesale>=fromWholesale){
                    javax.swing.JOptionPane.showMessageDialog(null,"from half wholesale is greates or same than from wholesale please check this");
                    return null;
                }
            }
        }
        return product;
    }
    public void registerProduct(){
        Product product=buildProduct();
        if(product==null)
            return;
        if(ProductDAO.insert(product)){
            javax.swing.JOptionPane.showMessageDialog(null,"product added succefull");
            restartFields();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Object object=e.getSource();
        javax.swing.JButton button;
        javax.swing.JRadioButton radioButton;
        javax.swing.JCheckBox checkBox;
        if(object instanceof javax.swing.JButton){
            button=(javax.swing.JButton)object;
            if(button==vistaAddProduct.loadImage){
                loadImage();
            }else{
                if(button==vistaAddProduct.save){
                    registerProduct();
                }
            }
                
        }else{
            if(object instanceof javax.swing.JRadioButton){
                radioButton=(javax.swing.JRadioButton)object;
                if(radioButton==vistaAddProduct.yesExpiration){
                    des_activateExpiration(true);
                }else{
                    if(radioButton==vistaAddProduct.noExpiration){
                        des_activateExpiration(false);
                    }if(radioButton==vistaAddProduct.yesInventary){
                        des_activateInventary(true);
                    }else{
                        if(radioButton==vistaAddProduct.noInventary){
                            des_activateInventary(false);
                        }else{
                            if(radioButton==vistaAddProduct.yesWholesales){
                                des_activateWholesales(true);
                            }else{
                                if(radioButton==vistaAddProduct.noWholesales){
                                    des_activateWholesales(false);
                                }
                            }
                        }
                    }
                }
            }else{
                if(object instanceof javax.swing.JCheckBox){
                    checkBox=(javax.swing.JCheckBox)object;
                    if(checkBox==vistaAddProduct.activateWholesale){
                        if(vistaAddProduct.activateWholesale.isSelected()){
                            des_activateWholesale(true);
                        }else{
                            des_activateWholesale(false);
                        }
                    }else{
                        if(checkBox==vistaAddProduct.activateHalfWholesale){
                            if(vistaAddProduct.activateHalfWholesale.isSelected()){
                                des_activateHalfWholesale(true);
                            }else{
                                des_activateHalfWholesale(false);
                            }
                        }
                    }
                }
            }
        }
    }
    @Override
    public void keyPressed(KeyEvent e){;}
    @Override
    public void keyReleased(KeyEvent e){;}
    @Override
    public void keyTyped(KeyEvent e){;}
}
