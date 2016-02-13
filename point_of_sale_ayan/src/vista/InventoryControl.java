package vista;
public class InventoryControl extends javax.swing.JFrame {
    public InventoryControl() {
        initComponents();
        setTitle("Inventary Control");
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableInventory.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        tableInventory.setForeground(java.awt.Color.blue);
        tableInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "Description", "InStock", "AmountMinimal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableInventory);
        if (tableInventory.getColumnModel().getColumnCount() > 0) {
            tableInventory.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableInventory.getColumnModel().getColumn(0).setMaxWidth(200);
            tableInventory.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableInventory.getColumnModel().getColumn(1).setMaxWidth(200);
            tableInventory.getColumnModel().getColumn(2).setPreferredWidth(400);
            tableInventory.getColumnModel().getColumn(2).setMaxWidth(400);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableInventory;
    // End of variables declaration//GEN-END:variables
}
