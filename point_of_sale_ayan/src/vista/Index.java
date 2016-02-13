package vista;
public class Index extends javax.swing.JFrame {
    public Index() {
        initComponents();
        //setLocationRelativeTo(null);
        //setResizable(false);
        setTitle("Index");
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

        jLabel1 = new javax.swing.JLabel();
        salesButton = new javax.swing.JButton();
        productsButton = new javax.swing.JButton();
        stocktakingButton = new javax.swing.JButton();
        clientsButton = new javax.swing.JButton();
        providersButton = new javax.swing.JButton();
        configurationButton = new javax.swing.JButton();
        goOutButton = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 900));

        jLabel1.setText("Image Point of sale ayan");

        salesButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        salesButton.setForeground(new java.awt.Color(0, 0, 204));
        salesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sale.png"))); // NOI18N
        salesButton.setText("(F1) Sale");

        productsButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        productsButton.setForeground(new java.awt.Color(0, 0, 204));
        productsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/products.png"))); // NOI18N
        productsButton.setText("(F2) Products");
        productsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsButtonActionPerformed(evt);
            }
        });

        stocktakingButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        stocktakingButton.setForeground(new java.awt.Color(0, 0, 204));
        stocktakingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventari.png"))); // NOI18N
        stocktakingButton.setText("(F4) StockTaking");
        stocktakingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stocktakingButtonActionPerformed(evt);
            }
        });

        clientsButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        clientsButton.setForeground(new java.awt.Color(0, 0, 204));
        clientsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tax.png"))); // NOI18N
        clientsButton.setText("(F5) Taxs Products");
        clientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsButtonActionPerformed(evt);
            }
        });

        providersButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        providersButton.setForeground(new java.awt.Color(0, 0, 204));
        providersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sections.png"))); // NOI18N
        providersButton.setText("(F3) Sections Products");

        configurationButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        configurationButton.setForeground(new java.awt.Color(0, 102, 102));
        configurationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuration.png"))); // NOI18N
        configurationButton.setText("(c) Configuration");

        goOutButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        goOutButton.setForeground(new java.awt.Color(255, 0, 51));
        goOutButton.setText("(ESC) Exit");

        welcomeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(204, 0, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stocktakingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(goOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(configurationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(providersButton))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(configurationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(providersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(stocktakingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(clientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productsButtonActionPerformed

    private void stocktakingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stocktakingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stocktakingButtonActionPerformed

    private void clientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientsButtonActionPerformed
    public void putTextInWelcom(String text){
        welcomeLabel.setText(text);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton clientsButton;
    public javax.swing.JButton configurationButton;
    public javax.swing.JButton goOutButton;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton productsButton;
    public javax.swing.JButton providersButton;
    public javax.swing.JButton salesButton;
    public javax.swing.JButton stocktakingButton;
    public javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
