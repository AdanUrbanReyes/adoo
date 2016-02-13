package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.Section;
import modelo.SectionDAO;
import modelo.Tax;
import modelo.TaxDAO;
import vista.AddTax;

public class DriverAddTax implements ActionListener{
    private AddTax vistaAddTax;
    private boolean flatSave=true;
    private String routeImage="src/imagenes/productSinImage.gif";
    public DriverAddTax(){
        vistaAddTax=new AddTax();
        setActionListeners();
    }
    public AddTax getAddTax(){
        return vistaAddTax;
    }
    public void setActionListeners(){
        vistaAddTax.save.addActionListener(this);
    }
    public void restartFields(){
        vistaAddTax.nameField.setText("");
        vistaAddTax.percentField.setText("0");
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
    public Tax buildTax(){
        String name;
        int percent=tryGetInteger(vistaAddTax.percentField.getText());
        if((name=vistaAddTax.nameField.getText()).equals("")){
            JOptionPane.showMessageDialog(null,"the name section is field necesary please enter one");
            return null;
        }
        if(percent<=0){
            JOptionPane.showMessageDialog(null,"enter percent greates 0 please");
            return null;
        }
        return new Tax(name, percent);
    }
    public void registerTax(){
        Tax tax=buildTax();
        if(tax==null)
            return;
        if(TaxDAO.register(tax)){
            javax.swing.JOptionPane.showMessageDialog(null,"tax added succefull");
            restartFields();
        }        
    }   
    public void actionPerformed(ActionEvent e){
        Object object=e.getSource();
        JButton button;
        if(object instanceof JButton){
            button=(JButton)object;
            if(button==vistaAddTax.save){
                registerTax();
            }
        }
    }
    public void keyPressed(KeyEvent e){;}
    public void keyReleased(KeyEvent e){;}
    public void keyTyped(KeyEvent e){;}    
}
