package vista;
public class ModifyProduct extends javax.swing.JPanel {
    public ModifyProduct() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barcodeLabel = new javax.swing.JLabel();
        barcodeField = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        modify = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();

        barcodeLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        barcodeLabel.setForeground(java.awt.Color.blue);
        barcodeLabel.setText("Enter barcode product to modify: ");

        barcodeField.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        barcodeField.setForeground(java.awt.Color.magenta);

        search.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        search.setForeground(java.awt.Color.magenta);
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/serach.png"))); // NOI18N
        search.setText("Search");

        modify.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        modify.setForeground(java.awt.Color.red);
        modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        modify.setText("Save Changes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(barcodeLabel)
                .addGap(34, 34, 34)
                .addComponent(barcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(search)
                .addGap(120, 120, 120)
                .addComponent(modify)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(barcodeLabel)
                        .addComponent(barcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search)
                        .addComponent(modify)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField barcodeField;
    private javax.swing.JLabel barcodeLabel;
    public javax.swing.JButton modify;
    public javax.swing.JButton search;
    public javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
