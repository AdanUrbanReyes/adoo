package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import javax.swing.table.TableCellRenderer;
import modelo.Inventary;
import modelo.Product;
import modelo.ProductDAO;
import vista.InventoryControl;

public class DriverInventoryControl implements KeyListener{//implements MouseListener
    private static DriverInventoryControl driverInventoryControl=null;//singlenton
    private InventoryControl vistaInventoryControl;
    private DriverInventoryControl(){
        vistaInventoryControl=new InventoryControl();
        vistaInventoryControl.tableInventory.addKeyListener(this);
        setWindowsListeners();
        loadAllProducts();
//vistaInventoryControl.table.addMouseListener(this);
    }
    public void setWindowsListeners(){
        try{
            vistaInventoryControl.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    driverInventoryControl=null;
                }
            });
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,"error closing frame manager products");
        }
    }    
    public static DriverInventoryControl getInstance(){//singlenton
        if(driverInventoryControl==null)
            driverInventoryControl=new DriverInventoryControl();
        return driverInventoryControl;
    }
    public void loadAllProducts(){
        LinkedList <Product> list=ProductDAO.getAllProducts();
        int i,row=0,sizeList=list.size();
        int inStock=0;
        int amountMinimal=0;
        Product product;
        Inventary inventory;
        for(i=0;i<sizeList;i++,inStock=0,amountMinimal=0){
            javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)vistaInventoryControl.tableInventory.getModel();
            product=list.get(i);
            inventory=product.getInventary();
            if(inventory==null){
                continue;
            }
            inStock=inventory.getInStock();
            amountMinimal=inventory.getAmountMinimal();
            if(inStock>=amountMinimal)
                continue;
            model.addRow(new Object[]{product.getBarcode(),product.getName(),product.getDescription(),inStock,amountMinimal});
        }
        vistaInventoryControl.tableInventory.setDefaultRenderer(Object.class,new ColorTable());
    }
/*
    @Override
    public void mouseClicked(MouseEvent e) {
        int row=vistaInventoryControl.table.rowAtPoint(e.getPoint());
        String barcode=(String)vistaInventoryControl.table.getValueAt(row,0);
        drp.setBarcode(barcode);
        vistaInventoryControl.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {;}

    @Override
    public void mouseReleased(MouseEvent e) {;}

    @Override
    public void mouseEntered(MouseEvent e) {;}

    @Override
    public void mouseExited(MouseEvent e) {;}*/

    @Override
    public void keyTyped(KeyEvent e) {;}

    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        if(code==KeyEvent.VK_ENTER){
            ;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {;}
}