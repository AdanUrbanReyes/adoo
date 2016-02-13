package controlador;

import java.awt.Color;
import java.awt.Component;

public class ColorTable extends javax.swing.table.DefaultTableCellRenderer{
    public Component getTableCellRendererComponent(javax.swing.JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column){
      if (String.valueOf(value).equals("true")){
         //this.setOpaque(true);
         //this.setBackground(Color.RED);
         this.setForeground(Color.red);
      }
      return super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
   }    
}
