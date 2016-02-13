package controlador;
import modelo.Section;
import modelo.SectionDAO;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.io.File;
import vista.AddSection;
public class DriverAddSection implements ActionListener,KeyListener{
    private AddSection vistaAddSection;
    private boolean flatSave=true;
    private String routeImage="src/imagenes/productSinImage.gif";
    public DriverAddSection(){
        vistaAddSection=new AddSection();
        setImage(routeImage,600,400);
        setActionListeners();
    }
    public AddSection getAddSection(){
        return vistaAddSection;
    }
    public void setActionListeners(){
        vistaAddSection.loadImage.addActionListener(this);
        vistaAddSection.save.addActionListener(this);
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
        vistaAddSection.image.setIcon(icon);
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
    public void restartFields(){
        vistaAddSection.nameField.setText("");
        vistaAddSection.descriptionField.setText("");
        routeImage="src/imagenes/productSinImage.gif";
        setImage(routeImage,600,400);
    }
    public Section buildSection(){
        String name,description;
        if((name=vistaAddSection.nameField.getText()).equals("")){
            JOptionPane.showMessageDialog(null,"the name section is field necesary please enter one");
            return null;
        }
        if((description=vistaAddSection.descriptionField.getText()).equals(""))
            description=null;
        return new Section(name, description, routeImage);
    }
    public void registerSection(){
        Section section=buildSection();
        if(section==null)
            return;
        if(SectionDAO.register(section)){
            javax.swing.JOptionPane.showMessageDialog(null,"section added succefull");
            restartFields();
        }        
    }   
    public void actionPerformed(ActionEvent e){
        Object object=e.getSource();
        JButton button;
        if(object instanceof JButton){
            button=(JButton)object;
            if(button==vistaAddSection.loadImage){
                loadImage();
            }else{
                if(button==vistaAddSection.save){
                    registerSection();
                }
            }
        }
    }
    public void keyPressed(KeyEvent e){;}
    public void keyReleased(KeyEvent e){;}
    public void keyTyped(KeyEvent e){;}
}
