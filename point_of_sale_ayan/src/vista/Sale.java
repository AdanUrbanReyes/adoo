package vista;
public class Sale extends javax.swing.JFrame {
    public Sale() {
        initComponents();
        setTitle("Sale");
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

        barcodeProduct = new javax.swing.JTextField();
        amountProducts = new javax.swing.JFormattedTextField();
        nameProduct = new javax.swing.JLabel();
        barcodeLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        unitarioPriceLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        amountProdcut = new javax.swing.JLabel();
        imageProduct = new javax.swing.JLabel();
        unitarioPriceProduct = new javax.swing.JLabel();
        subtotalProduct = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        addCar = new javax.swing.JButton();
        search = new javax.swing.JButton();
        totalAuxLabel = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        closeSale = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        barcodeProduct.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        barcodeProduct.setForeground(java.awt.Color.magenta);

        amountProducts.setForeground(java.awt.Color.magenta);
        amountProducts.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        nameProduct.setBackground(java.awt.Color.gray);
        nameProduct.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        nameProduct.setForeground(java.awt.Color.magenta);

        barcodeLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        barcodeLabel.setForeground(java.awt.Color.blue);
        barcodeLabel.setText("Barcode");

        nameLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        nameLabel.setForeground(java.awt.Color.blue);
        nameLabel.setText("Name");

        unitarioPriceLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        unitarioPriceLabel.setForeground(java.awt.Color.blue);
        unitarioPriceLabel.setText("Unitario Price");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setText("Subtotal");

        amountProdcut.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        amountProdcut.setForeground(java.awt.Color.blue);
        amountProdcut.setText("Amount");

        imageProduct.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N

        unitarioPriceProduct.setBackground(java.awt.Color.gray);
        unitarioPriceProduct.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        unitarioPriceProduct.setForeground(java.awt.Color.magenta);

        subtotalProduct.setBackground(java.awt.Color.gray);
        subtotalProduct.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        subtotalProduct.setForeground(java.awt.Color.magenta);

        carTable.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        carTable.setForeground(java.awt.Color.pink);
        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "Description", "In Stock", "Amount", "Unitario Price ($)", "Subtotal ($)", "HalfWholesale", "Wholesale"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(carTable);
        if (carTable.getColumnModel().getColumnCount() > 0) {
            carTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            carTable.getColumnModel().getColumn(0).setMaxWidth(200);
            carTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            carTable.getColumnModel().getColumn(1).setMaxWidth(200);
            carTable.getColumnModel().getColumn(2).setPreferredWidth(500);
            carTable.getColumnModel().getColumn(2).setMaxWidth(500);
            carTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            carTable.getColumnModel().getColumn(3).setMaxWidth(70);
            carTable.getColumnModel().getColumn(4).setPreferredWidth(70);
            carTable.getColumnModel().getColumn(4).setMaxWidth(70);
            carTable.getColumnModel().getColumn(5).setPreferredWidth(140);
            carTable.getColumnModel().getColumn(5).setMaxWidth(140);
            carTable.getColumnModel().getColumn(6).setPreferredWidth(140);
            carTable.getColumnModel().getColumn(6).setMaxWidth(140);
        }

        addCar.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        addCar.setForeground(java.awt.Color.pink);
        addCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addCar.png"))); // NOI18N
        addCar.setText("Add Car");

        search.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        search.setForeground(java.awt.Color.red);
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/serach.png"))); // NOI18N
        search.setText("Search");

        totalAuxLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        totalAuxLabel.setForeground(java.awt.Color.red);
        totalAuxLabel.setText("Total: ");

        total.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        total.setForeground(java.awt.Color.pink);
        total.setText("$ 0.0");

        user.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        user.setForeground(java.awt.Color.blue);

        closeSale.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        closeSale.setForeground(java.awt.Color.magenta);
        closeSale.setText("Close Sale");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barcodeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barcodeLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(nameLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountProdcut))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitarioPriceLabel)
                            .addComponent(unitarioPriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(subtotalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search)
                            .addComponent(addCar)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(totalAuxLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeSale)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(barcodeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(barcodeProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(amountProdcut)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(unitarioPriceLabel)
                                        .addComponent(jLabel2))
                                    .addComponent(addCar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amountProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unitarioPriceProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subtotalProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(closeSale)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalAuxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addCar;
    private javax.swing.JLabel amountProdcut;
    public javax.swing.JFormattedTextField amountProducts;
    private javax.swing.JLabel barcodeLabel;
    public javax.swing.JTextField barcodeProduct;
    public javax.swing.JTable carTable;
    public javax.swing.JButton closeSale;
    public javax.swing.JLabel imageProduct;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    public javax.swing.JLabel nameProduct;
    public javax.swing.JButton search;
    public javax.swing.JLabel subtotalProduct;
    public javax.swing.JLabel total;
    private javax.swing.JLabel totalAuxLabel;
    private javax.swing.JLabel unitarioPriceLabel;
    public javax.swing.JLabel unitarioPriceProduct;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
