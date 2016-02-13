package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import modelo.Product;
import modelo.ProductDAO;
import vista.SearchTable;

public class DriverSearchTable implements KeyListener{//implements MouseListener
    private static DriverSearchTable dst=null;//singlenton
    private SearchTable vistaSearchTable;
    private DriverRemoveProduct drp;
    private DriverModifyProduct dmp;
    private DriverSale ds;
    private DriverSearchTable(){
        vistaSearchTable=new SearchTable();
        vistaSearchTable.table.addKeyListener(this);
        setWindowsListeners();
        loadAllProducts();
//vistaSearchTable.table.addMouseListener(this);
    }
    public void setDriverRemoveProduct(DriverRemoveProduct drp){
        this.drp=drp;
    }
    public void setDriverModifyProduct(DriverModifyProduct dmp){
        this.dmp=dmp;
    }
    public void setDriverSale(DriverSale ds){
        this.ds=ds;
    }
    public void setWindowsListeners(){
        try{
            vistaSearchTable.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    dst=null;
                }
            });
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,"error closing frame manager products");
        }
    }    
    public static DriverSearchTable getInstance(){//singlenton
        if(dst==null)
            dst=new DriverSearchTable();
        return dst;
    }
    public void loadAllProducts(){
        LinkedList <Product> list=ProductDAO.getAllProducts();
        int i,percent=0;
        String wholesale="No Wholesale";
        String halfWholesale="No Half Wholesale";
        for(i=0;i<list.size();i++,percent=0,wholesale="No Wholesale",halfWholesale="No Half Wholesale"){
            javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)vistaSearchTable.table.getModel();
            Product temp=list.get(i);
            if(temp.getTax()!=null){
                percent=temp.getTax().getPercent();
            }
            if(temp.getWholesale()!=null){
                wholesale="$"+temp.getWholesale().getPrice()+"/"+temp.getWholesale().getFrom()+" pieces";
            }
            if(temp.getHalfWholesale()!=null){
                halfWholesale="$"+temp.getHalfWholesale().getPrice()+"/"+temp.getHalfWholesale().getFrom()+" pieces";
            }            
            model.addRow(new Object[]{temp.getBarcode(),temp.getSaleType(),temp.getName(),temp.getSalePrice(),percent,wholesale,halfWholesale});
        }    
    }
/*
    @Override
    public void mouseClicked(MouseEvent e) {
        int row=vistaSearchTable.table.rowAtPoint(e.getPoint());
        String barcode=(String)vistaSearchTable.table.getValueAt(row,0);
        drp.setBarcode(barcode);
        vistaSearchTable.dispose();
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
            int row=vistaSearchTable.table.getSelectedRow();
            if(row==-1)
                return;
            String barcode=(String)vistaSearchTable.table.getValueAt(row,0);
            if(drp!=null)
                drp.setBarcode(barcode);
            if(dmp!=null)
                dmp.setBarcode(barcode);
            if(ds!=null)
                ds.setBarcode(barcode);
            vistaSearchTable.dispose();
            dst=null;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {;}
}
