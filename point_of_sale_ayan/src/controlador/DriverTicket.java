package controlador;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.Date;
import vista.Ticket;
public class DriverTicket implements Printable,ActionListener{
    private static DriverTicket driverTicket;//singlenton
    private Ticket vistaTicket;
    private String nameStock="Pharmacy of Healty";
    private String addressStock="Calle Allende Sin Numero Barrio San Antonio Tultepec Edo. Mexico";
    private String phoneStock="24600063";
    private DriverTicket(javax.swing.table.DefaultTableModel model,String user,float total){//singlenton
        vistaTicket=new Ticket();
        setLabelsTicket(model,user);
        fillTable(model);
        setActionListeners();
        setWindowsListeners();
        vistaTicket.total.setText("Total: $"+total);
    }
    public static DriverTicket getInstance(javax.swing.table.DefaultTableModel model,String user,float total){
        if(driverTicket==null)
            driverTicket=new DriverTicket(model, user,total);
        return driverTicket;
    }
    public void setWindowsListeners(){
        try{
            vistaTicket.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    driverTicket=null;
                }
            });
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,"error closing frame manager products");
        }
    }
    public void setActionListeners(){
        vistaTicket.print.addActionListener(this);
    }
    public void setLabelsTicket(javax.swing.table.DefaultTableModel model,String user){
        SimpleDateFormat formatDate=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
        vistaTicket.nameStock.setText(nameStock);
        vistaTicket.date.setText(formatDate.format(new Date()));
        vistaTicket.atendidoBy.setText("Le atendio "+user);
        //vistaTicket.total.setText("$ 0.0");
    }
    public void fillTable(javax.swing.table.DefaultTableModel model){
        javax.swing.table.DefaultTableModel modelTableTicket=(javax.swing.table.DefaultTableModel)vistaTicket.table.getModel();
        int i,rows=model.getRowCount();
        String barcode,name;
        int amount;
        float subtotal;
        for(i=0;i<rows;i++){
            barcode=model.getValueAt(i,0).toString();
            name=model.getValueAt(i,1).toString();
            amount=Integer.parseInt(model.getValueAt(i,4).toString());
            subtotal=Float.parseFloat(model.getValueAt(i,6).toString());
            modelTableTicket.addRow(new Object[]{barcode,name,amount,subtotal});
        }
    }
    public void printTicket(){
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setPrintable(this);
        boolean print=job.printDialog();
        try{
            if(print){
                job.print();
            }
        }catch(PrinterException pe){
            javax.swing.JOptionPane.showMessageDialog(null,"\n error print ticket "+pe.toString());
        }
    }
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if(pageIndex>0){
            return NO_SUCH_PAGE;
        }
        Graphics2D hub=(Graphics2D)graphics;
        hub.translate(pageFormat.getImageableX()+30,pageFormat.getImageableY()+30);//se pone "sangrias"
        hub.scale(1.0,1.0);//scale of ticket
        vistaTicket.panel.printAll(graphics);
        return PAGE_EXISTS;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object=e.getSource();
        javax.swing.JButton button;
        if(object instanceof javax.swing.JButton){
            button=(javax.swing.JButton)object;
            if(button==vistaTicket.print)
                printTicket();
        }
    }
    
}
