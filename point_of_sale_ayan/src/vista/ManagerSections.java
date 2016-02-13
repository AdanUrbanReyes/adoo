package vista;
public class ManagerSections extends javax.swing.JFrame {
    public ManagerSections() {
        initComponents();
        setTitle("Manager Sections");
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        modify = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        add.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        add.setForeground(java.awt.Color.blue);
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new.png"))); // NOI18N
        add.setText("Add (F1)");

        remove.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        remove.setForeground(java.awt.Color.blue);
        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/remove.png"))); // NOI18N
        remove.setText("Remove (F2)");

        modify.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        modify.setForeground(java.awt.Color.blue);
        modify.setText("Modify (F3)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(add)
                .addGap(96, 96, 96)
                .addComponent(remove)
                .addGap(77, 77, 77)
                .addComponent(modify)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(remove)
                    .addComponent(modify))
                .addGap(18, 18, 18)
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setPanel(javax.swing.JPanel panel){
        tabbedPane.removeAll();
        tabbedPane.add(panel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    public javax.swing.JButton modify;
    public javax.swing.JButton remove;
    public javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
