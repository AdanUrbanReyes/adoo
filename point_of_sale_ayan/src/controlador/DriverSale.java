package controlador;
import vista.Sale;
import modelo.Product;
import modelo.ProductDAO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.LinkedList;
import modelo.Boss;
import modelo.Employeer;
import modelo.HalfWholesale;
import modelo.Inventary;
import modelo.InventaryDAO;
import modelo.Sales;
import modelo.SalesDAO;
import modelo.Wholesale;
public class DriverSale implements ActionListener,KeyListener{
    private static DriverSale driverSale;
    private Employeer employeer;
    private Boss boss;
    private Sale vistaSale;
    private LinkedList<Sales> buyCar;
    private Sales sale;//contains the prodcut that goint to sale 
    private Product product;
    private DriverSale(){
        vistaSale=new Sale();
        buyCar=new LinkedList<Sales>();
        setActionListener();
        setKeysListener();
        setWindowsListeners();
    }
    public static DriverSale getInstance(){
        if(driverSale==null){
            driverSale=new DriverSale();
        }
        return driverSale;
    }
    public void setWindowsListeners(){
        try{
            vistaSale.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    driverSale=null;
                }
            });
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,"error closing frame manager products");
        }
    }    
    public void setActionListener(){
        vistaSale.search.addActionListener(this);
        vistaSale.addCar.addActionListener(this);
        vistaSale.closeSale.addActionListener(this);
    }
    public void setKeysListener(){
        vistaSale.carTable.addKeyListener(this);
        vistaSale.carTable.setFocusable(true);
        vistaSale.barcodeProduct.addKeyListener(this);
        vistaSale.barcodeProduct.setFocusable(true);
        vistaSale.amountProducts.addKeyListener(this);
        vistaSale.amountProducts.setFocusable(true);
    }
    public void setEmployeer(Employeer employeer){
        this.employeer=employeer;
    }
    public void setBoss(Boss boss){
        this.boss=boss;
    }
    public void setBarcode(String barcode){
       vistaSale.barcodeProduct.setText(barcode);
       fillVentanilla();
    }
    public void setImage(String route,int width,int height){
        javax.swing.Icon icon=new javax.swing.ImageIcon(new javax.swing.ImageIcon(route).getImage().getScaledInstance(width,height,java.awt.Image.SCALE_DEFAULT));
        vistaSale.imageProduct.setIcon(icon);
    }    
    public void resetVentanilla(){
        vistaSale.nameProduct.setText("");
        vistaSale.amountProducts.setText("0");
        vistaSale.unitarioPriceProduct.setText("$ 0.0");
        vistaSale.subtotalProduct.setText("$ 0.0");
        setImage("src/imagenes/productSinImage.gif",600,400);
    }
    public void emptyTable(){
        javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)vistaSale.carTable.getModel();
        while(model.getRowCount()>0)
            model.removeRow(0);
    }
    public void emptBuyCarList(){
        while(buyCar.size()>0)
            buyCar.remove(0);
    }
    public void fillVentanilla(){//put barcode, name, amount, price unitario, subtotal
        String barcode=vistaSale.barcodeProduct.getText();
        product=ProductDAO.getProduct(barcode);
        if(product==null){
            javax.swing.JOptionPane.showMessageDialog(null,"the prodcut with barcode "+barcode+" not exists in data base");
            return;
        }
        vistaSale.nameProduct.setText(product.getName());
        vistaSale.amountProducts.setText("1");
        vistaSale.unitarioPriceProduct.setText("$ "+product.getSalePrice());
        vistaSale.subtotalProduct.setText("$ "+product.getSalePrice());
        setImage(product.getRouteImage(),600,400);
    }
    public int tryGetInteger(String cadena){
        int integer=-1;
        try{
            integer=Integer.parseInt(cadena);
        }catch(NumberFormatException nfe){
            ;
        }
        return integer;
    }
    public void updateSubtotal(){
        if(product==null){
            javax.swing.JOptionPane.showMessageDialog(null,"first select a product");
            return;
        }
        int piecesToSale=0;
        if((piecesToSale=tryGetInteger(vistaSale.amountProducts.getText()))==-1)
            piecesToSale=0;
        vistaSale.subtotalProduct.setText("$ "+product.getSalePrice()*piecesToSale);
    }
    public int buyCarContainsProduct(Product product){
        int i;
        for(i=0;i<buyCar.size();i++){
            if(buyCar.get(i).getBarcodeProduc().equals(product.getBarcode()))
                return i;
        }
        return -1;
    }
    public int carTableContainsProduct(javax.swing.table.DefaultTableModel model,Product product){
        int i,rows=model.getRowCount();
        String barcode;
        for(i=0;i<rows;i++){
            barcode=(String)model.getValueAt(i,0);
            if(barcode.equals(product.getBarcode()))
                return i;
        }
        return -1;
    }
    public void updateTotal(){
        javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)vistaSale.carTable.getModel();
        int row,rows=model.getRowCount();
        float total=0;
        for(row=0;row<rows;row++){
            total+=Float.parseFloat(model.getValueAt(row,6).toString());
        }
        vistaSale.total.setText("$ "+total);
    }
    public void updateCarTable(){
        javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)vistaSale.carTable.getModel();
        int indexTable=carTableContainsProduct(model,product),indexList=buyCarContainsProduct(product),amount=buyCar.get(indexList).getAmountSale();
        String inStock="no inventary",ts=vistaSale.total.getText();
        float subtotal=amount*product.getSalePrice();
        boolean hasWholesale=false,hasHalfWholesale=false;
        Wholesale wholesale=product.getWholesale();
        HalfWholesale halfWholesale=product.getHalfWholesale();
        if(halfWholesale!=null){
            if(amount>=halfWholesale.getFrom()){
                hasHalfWholesale=true;
                subtotal=amount*halfWholesale.getPrice();
            }
        }
        if(wholesale!=null){
            if(amount>=wholesale.getFrom()){
                hasHalfWholesale=false;
                hasWholesale=true;
                subtotal=amount*wholesale.getPrice();
            }
        }
        if(product.getInventary()!=null){
            inStock=""+product.getInventary().getInStock();
        }
        if(indexTable<0){//table NO containts product
            model.addRow(new Object[]{product.getBarcode(),product.getName(),product.getDescription(),inStock,amount,product.getSalePrice(),subtotal,hasHalfWholesale,hasWholesale});
        }else{//table containts product
            model.setValueAt(amount,indexTable,4);//change amount
            model.setValueAt(subtotal,indexTable,6);//change subtotal
            model.setValueAt(hasHalfWholesale,indexTable,7);//change half wholesale
            model.setValueAt(wholesale,indexTable,8);//change wholesale
        }
    }
    public void addProductToBuyCarList(){
        int index=buyCarContainsProduct(product);
        int amount=tryGetInteger(vistaSale.amountProducts.getText());
        Object user=null;
        if(employeer!=null)
            user=employeer;
        if(boss!=null)
            user=boss;
        if(index<0){//buy car no contains product
            buyCar.add(new Sales(product.getBarcode(),amount,new Date(),user));
            index=buyCar.size()-1;
        }else{
            int amountOld=buyCar.get(index).getAmountSale();
            buyCar.get(index).setAmountSale(amount+amountOld);
        }
        /*
        Inventary inventary=product.getInventary();
        if(inventary!=null){
            if(inventary.getInStock()<buyCar.get(index).getAmountSale()){
                if(javax.swing.JOptionPane.showConfirmDialog(null,"product in stock is less than amount to sale wanna continue?")==javax.swing.JOptionPane.YES_NO_CANCEL_OPTION){
                    buyCar.remove(index);
                    return false;
                }
            }
        }
        return true;*/
    }
    public void removeToBuyCar(int row){
        javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)vistaSale.carTable.getModel();
        int amount=Integer.parseInt(model.getValueAt(row,4).toString())-1;
        if(amount<=0){
            model.removeRow(row);
            updateTotal();
            return;
        }
        Product product=ProductDAO.getProduct(model.getValueAt(row,0).toString());
        float subtotal=amount*product.getSalePrice();
        boolean hasWholesale=false,hasHalfWholesale=false;
        HalfWholesale halfWholesale=product.getHalfWholesale();
        Wholesale wholesale=product.getWholesale();
        if(halfWholesale!=null){
            if(amount>=halfWholesale.getFrom()){
                hasHalfWholesale=true;
                subtotal=amount*halfWholesale.getPrice();
            }
        }
        if(wholesale!=null){
            if(amount>=wholesale.getFrom()){
                hasHalfWholesale=false;
                hasWholesale=true;
                subtotal=amount*wholesale.getPrice();
            }
        }
        model.setValueAt(amount,row,4);//change amount
        model.setValueAt(subtotal,row,6);//change subtotal
        model.setValueAt(hasHalfWholesale,row,7);//change half wholesale
        model.setValueAt(wholesale,row,8);//change wholesale
        updateTotal();
    }
    public void addToBuyCar(){
        if(product==null){
            javax.swing.JOptionPane.showMessageDialog(null,"first select a product");
            return;
        }
        if(tryGetInteger(vistaSale.amountProducts.getText())<=0){
            javax.swing.JOptionPane.showMessageDialog(null,"please insert amount (number positive) please");
            return;
        }
        addProductToBuyCarList();
        updateCarTable();
        //resetVentanilla();
        updateTotal();
        //product=null;
    }
    public void openSearchTable(){
        DriverSearchTable dst=DriverSearchTable.getInstance();
        dst.setDriverSale(this);
    }
    public void setSalesInDataBase(){
        int i,sizeList=buyCar.size(),amount;
        Inventary inventary;
        for(i=0;i<sizeList;i++){ 
            SalesDAO.insertSale(buyCar.get(i));
            inventary=InventaryDAO.getInventary(buyCar.get(i).getBarcodeProduc());
            if(inventary!=null){
                amount=inventary.getInStock()-buyCar.get(i).getAmountSale();
                if(amount<0)
                    amount=0;
                InventaryDAO.updateInStock(inventary.getBarcodeProduct(),amount);
            }
        }
    }
    public void printTicket(){
        String user=null;
        String totalAux=vistaSale.total.getText();
        float total=Float.parseFloat(totalAux.substring(totalAux.indexOf("$")+1));
        if(employeer!=null)
            user=employeer.getName()+" "+employeer.getSurname();
        if(boss!=null)
            user=boss.getName()+" "+boss.getSurname();
        DriverTicket driverTicket=DriverTicket.getInstance((javax.swing.table.DefaultTableModel)vistaSale.carTable.getModel(),user,total);
    }
    public void closeSale(){
        javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)vistaSale.carTable.getModel();
        if(model.getRowCount()<=0){
            javax.swing.JOptionPane.showMessageDialog(null,"fist add product to car");
            return;
        }
        setSalesInDataBase();
        printTicket();
        emptyTable();
        emptBuyCarList();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Object object=e.getSource();
        if(object instanceof javax.swing.JButton){
            javax.swing.JButton button=(javax.swing.JButton)object;
            if(button==vistaSale.search){
                openSearchTable();
            }else{
                if(button==vistaSale.addCar){
                    addToBuyCar();
                }else{
                    if(button==vistaSale.closeSale){
                        closeSale();
                    }
                }
            }
        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        Object object=e.getSource();
        int code=e.getKeyCode();
        if(object instanceof javax.swing.JTextField){
            javax.swing.JTextField field=(javax.swing.JTextField)object;
            if(field==vistaSale.barcodeProduct){
                if(code==KeyEvent.VK_ENTER)
                    fillVentanilla();
            }
        }else{
            if(object instanceof javax.swing.JTable){
                javax.swing.JTable table=(javax.swing.JTable)object;
                if(table==vistaSale.carTable){
                    if(code==KeyEvent.VK_DELETE){
                        int row=vistaSale.carTable.getSelectedRow();
                        removeToBuyCar(row);
                    }
                }
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        Object object=e.getSource();
        if(object instanceof javax.swing.JFormattedTextField){
            javax.swing.JFormattedTextField formmateField=(javax.swing.JFormattedTextField)object;
            if(formmateField==vistaSale.amountProducts){
                updateSubtotal();
            }
        }
    }  
    @Override
    public void keyTyped(KeyEvent e){;}
}
