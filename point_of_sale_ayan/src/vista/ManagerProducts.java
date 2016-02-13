package vista;
public class ManagerProducts extends javax.swing.JFrame {
    public ManagerProducts() {
        initComponents();
        setTitle("Manager Products");
        setSize(getSizeDisplay());
        setVisible(true);
    }
    public java.awt.Dimension getSizeDisplay(){
        java.awt.Toolkit toolkit=java.awt.Toolkit.getDefaultToolkit();
        java.awt.Dimension size=toolkit.getScreenSize();
        return size;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addProductButton = new javax.swing.JButton();
        removeProductButton = new javax.swing.JButton();
        modifyProductButton = new javax.swing.JButton();
        tabbedPaneManager = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addProductButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        addProductButton.setForeground(java.awt.Color.blue);
        addProductButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new.png"))); // NOI18N
        addProductButton.setText("Add (F1)");

        removeProductButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        removeProductButton.setForeground(java.awt.Color.blue);
        removeProductButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/remove.png"))); // NOI18N
        removeProductButton.setText("Remove (F2)");

        modifyProductButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        modifyProductButton.setForeground(java.awt.Color.blue);
        modifyProductButton.setText("Modify (F3)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(addProductButton)
                .addGap(164, 164, 164)
                .addComponent(removeProductButton)
                .addGap(147, 147, 147)
                .addComponent(modifyProductButton)
                .addGap(0, 304, Short.MAX_VALUE))
            .addComponent(tabbedPaneManager)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProductButton)
                    .addComponent(removeProductButton)
                    .addComponent(modifyProductButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPaneManager, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setPanel(javax.swing.JPanel panel){
        tabbedPaneManager.removeAll();
        tabbedPaneManager.add(panel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addProductButton;
    public javax.swing.JButton modifyProductButton;
    public javax.swing.JButton removeProductButton;
    private javax.swing.JTabbedPane tabbedPaneManager;
    // End of variables declaration//GEN-END:variables
}
