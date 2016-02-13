package vista;
public class RemoveProduct extends javax.swing.JPanel {
    public RemoveProduct() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterBarcodeLabel = new javax.swing.JLabel();
        barcodeField = new javax.swing.JTextField();
        tabbedPane = new javax.swing.JTabbedPane();
        search = new javax.swing.JButton();
        remove = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1400, 650));

        enterBarcodeLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        enterBarcodeLabel.setForeground(java.awt.Color.blue);
        enterBarcodeLabel.setText("Enter barcode product to remove:");

        barcodeField.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        barcodeField.setForeground(java.awt.Color.blue);

        search.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        search.setForeground(java.awt.Color.magenta);
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/serach.png"))); // NOI18N
        search.setText("Search");

        remove.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        remove.setForeground(java.awt.Color.red);
        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/remove.png"))); // NOI18N
        remove.setText("Remove");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(enterBarcodeLabel)
                .addGap(18, 18, 18)
                .addComponent(barcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(search)
                .addGap(51, 51, 51)
                .addComponent(remove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterBarcodeLabel)
                    .addComponent(barcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(remove))
                .addGap(18, 18, 18)
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField barcodeField;
    private javax.swing.JLabel enterBarcodeLabel;
    public javax.swing.JButton remove;
    public javax.swing.JButton search;
    public javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
