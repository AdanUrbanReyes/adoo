package vista;
public class AddProduct extends javax.swing.JPanel {
    public AddProduct() {
        initComponents();
        addRadioButtonsToButtonGroup();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        expirationButtonGroup = new javax.swing.ButtonGroup();
        inventaryButtonGroup = new javax.swing.ButtonGroup();
        wholesalesButtonGroup = new javax.swing.ButtonGroup();
        barcodeLabel = new javax.swing.JLabel();
        saleTypeLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        barcodeField = new javax.swing.JTextField();
        saleTypeField = new javax.swing.JComboBox();
        nameField = new javax.swing.JTextField();
        tabbedPane = new javax.swing.JTabbedPane();
        pricesTaxPanel = new javax.swing.JPanel();
        buyPriceLabel = new javax.swing.JLabel();
        salePriceLabel = new javax.swing.JLabel();
        taxLabel = new javax.swing.JLabel();
        buyPriceField = new javax.swing.JFormattedTextField();
        salePriceField = new javax.swing.JFormattedTextField();
        taxField = new javax.swing.JComboBox();
        SpecsPanel = new javax.swing.JPanel();
        descriptionLabel = new javax.swing.JLabel();
        descriptionScroll = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionField = new javax.swing.JTextArea();
        sectionLabel = new javax.swing.JLabel();
        sectionField = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        haveExpirationLabel = new javax.swing.JLabel();
        manageInventaryLabel = new javax.swing.JLabel();
        yesExpiration = new javax.swing.JRadioButton();
        noExpiration = new javax.swing.JRadioButton();
        expirationDateLabel = new javax.swing.JLabel();
        expirationField = new javax.swing.JFormattedTextField();
        yesInventary = new javax.swing.JRadioButton();
        noInventary = new javax.swing.JRadioButton();
        minimalAmountLabel = new javax.swing.JLabel();
        minimalAmountField = new javax.swing.JFormattedTextField();
        inStockLabel = new javax.swing.JLabel();
        inStockField = new javax.swing.JFormattedTextField();
        formatExpirationLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        manageWholesalesLabel = new javax.swing.JLabel();
        yesWholesales = new javax.swing.JRadioButton();
        noWholesales = new javax.swing.JRadioButton();
        activateWholesale = new javax.swing.JCheckBox();
        activateHalfWholesale = new javax.swing.JCheckBox();
        priceWholesaleLabel = new javax.swing.JLabel();
        fromWholesaleLabel = new javax.swing.JLabel();
        priceHalfWholesaleLabel = new javax.swing.JLabel();
        fromHalfWholesaleLabel = new javax.swing.JLabel();
        priceWholesaleField = new javax.swing.JFormattedTextField();
        fromWholesaleField = new javax.swing.JFormattedTextField();
        priceHalfWholesaleField = new javax.swing.JFormattedTextField();
        fromHalfWholesaleField = new javax.swing.JFormattedTextField();
        imageLabel = new javax.swing.JLabel();
        loadImage = new javax.swing.JButton();
        save = new javax.swing.JButton();

        barcodeLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        barcodeLabel.setForeground(java.awt.Color.blue);
        barcodeLabel.setText("Barcode: ");

        saleTypeLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        saleTypeLabel.setForeground(java.awt.Color.blue);
        saleTypeLabel.setText("Sale Type: ");

        nameLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        nameLabel.setForeground(java.awt.Color.blue);
        nameLabel.setText("Name :");

        barcodeField.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        barcodeField.setForeground(java.awt.Color.magenta);

        saleTypeField.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        saleTypeField.setForeground(java.awt.Color.magenta);

        nameField.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        nameField.setForeground(java.awt.Color.magenta);

        buyPriceLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        buyPriceLabel.setForeground(java.awt.Color.blue);
        buyPriceLabel.setText("Buy Price: ");

        salePriceLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        salePriceLabel.setForeground(java.awt.Color.blue);
        salePriceLabel.setText("Sale Price: ");

        taxLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        taxLabel.setForeground(java.awt.Color.blue);
        taxLabel.setText("Tax :");

        buyPriceField.setForeground(java.awt.Color.magenta);
        buyPriceField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        salePriceField.setForeground(java.awt.Color.magenta);
        salePriceField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        taxField.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        taxField.setForeground(java.awt.Color.magenta);

        javax.swing.GroupLayout pricesTaxPanelLayout = new javax.swing.GroupLayout(pricesTaxPanel);
        pricesTaxPanel.setLayout(pricesTaxPanelLayout);
        pricesTaxPanelLayout.setHorizontalGroup(
            pricesTaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricesTaxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pricesTaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyPriceLabel)
                    .addComponent(salePriceLabel)
                    .addComponent(taxLabel))
                .addGap(23, 23, 23)
                .addGroup(pricesTaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buyPriceField)
                    .addComponent(salePriceField)
                    .addComponent(taxField, 0, 189, Short.MAX_VALUE))
                .addContainerGap(417, Short.MAX_VALUE))
        );
        pricesTaxPanelLayout.setVerticalGroup(
            pricesTaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricesTaxPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pricesTaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyPriceLabel)
                    .addComponent(buyPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pricesTaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salePriceLabel)
                    .addComponent(salePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pricesTaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxLabel)
                    .addComponent(taxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(285, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Prices e Tax", pricesTaxPanel);

        descriptionLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        descriptionLabel.setForeground(java.awt.Color.blue);
        descriptionLabel.setText("Enter a little description: ");

        descriptionField.setColumns(20);
        descriptionField.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        descriptionField.setForeground(java.awt.Color.magenta);
        descriptionField.setRows(5);
        jScrollPane1.setViewportView(descriptionField);

        descriptionScroll.setViewportView(jScrollPane1);

        sectionLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        sectionLabel.setForeground(java.awt.Color.blue);
        sectionLabel.setText("Section: ");

        sectionField.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        sectionField.setForeground(java.awt.Color.magenta);

        javax.swing.GroupLayout SpecsPanelLayout = new javax.swing.GroupLayout(SpecsPanel);
        SpecsPanel.setLayout(SpecsPanelLayout);
        SpecsPanelLayout.setHorizontalGroup(
            SpecsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SpecsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SpecsPanelLayout.createSequentialGroup()
                        .addComponent(descriptionScroll)
                        .addGap(51, 51, 51))
                    .addGroup(SpecsPanelLayout.createSequentialGroup()
                        .addGroup(SpecsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionLabel)
                            .addGroup(SpecsPanelLayout.createSequentialGroup()
                                .addComponent(sectionLabel)
                                .addGap(47, 47, 47)
                                .addComponent(sectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(407, Short.MAX_VALUE))))
        );
        SpecsPanelLayout.setVerticalGroup(
            SpecsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SpecsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionLabel)
                    .addComponent(sectionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(descriptionLabel)
                .addGap(18, 18, 18)
                .addComponent(descriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Specs", SpecsPanel);

        haveExpirationLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        haveExpirationLabel.setForeground(java.awt.Color.blue);
        haveExpirationLabel.setText("Does this product have a expiration? ");

        manageInventaryLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        manageInventaryLabel.setForeground(java.awt.Color.blue);
        manageInventaryLabel.setText("Does this product manage inventary? ");

        yesExpiration.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        yesExpiration.setForeground(java.awt.Color.magenta);
        yesExpiration.setText("Yes");

        noExpiration.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        noExpiration.setForeground(java.awt.Color.magenta);
        noExpiration.setText("No");

        expirationDateLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        expirationDateLabel.setForeground(java.awt.Color.blue);
        expirationDateLabel.setText("Enter date expiration: ");

        expirationField.setForeground(java.awt.Color.magenta);
        expirationField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("M/d/yyyy"))));

        yesInventary.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        yesInventary.setForeground(java.awt.Color.magenta);
        yesInventary.setText("Yes");

        noInventary.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        noInventary.setForeground(java.awt.Color.magenta);
        noInventary.setText("No");

        minimalAmountLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        minimalAmountLabel.setForeground(java.awt.Color.blue);
        minimalAmountLabel.setText("Minimal Amount: ");

        minimalAmountField.setForeground(java.awt.Color.magenta);
        minimalAmountField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        inStockLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        inStockLabel.setForeground(java.awt.Color.blue);
        inStockLabel.setText("In Stock: ");

        inStockField.setForeground(java.awt.Color.magenta);
        inStockField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        formatExpirationLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        formatExpirationLabel.setForeground(java.awt.Color.blue);
        formatExpirationLabel.setText("Format: Month/Day/Year");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(minimalAmountLabel)
                                .addComponent(manageInventaryLabel)
                                .addComponent(inStockLabel))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(yesInventary)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(noInventary))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(minimalAmountField)
                                        .addComponent(inStockField)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(expirationDateLabel)
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(formatExpirationLabel)
                                .addComponent(expirationField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(haveExpirationLabel)
                        .addGap(60, 60, 60)
                        .addComponent(yesExpiration)
                        .addGap(44, 44, 44)
                        .addComponent(noExpiration)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(haveExpirationLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yesExpiration)
                        .addComponent(noExpiration)))
                .addGap(18, 18, 18)
                .addComponent(formatExpirationLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expirationDateLabel)
                    .addComponent(expirationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageInventaryLabel)
                    .addComponent(yesInventary)
                    .addComponent(noInventary))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minimalAmountLabel)
                    .addComponent(minimalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inStockLabel)
                    .addComponent(inStockField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Others", jPanel1);

        manageWholesalesLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        manageWholesalesLabel.setForeground(java.awt.Color.blue);
        manageWholesalesLabel.setText("Does this product manage wholesale and half wholesale?");

        yesWholesales.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        yesWholesales.setForeground(java.awt.Color.magenta);
        yesWholesales.setText("Yes");

        noWholesales.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        noWholesales.setForeground(java.awt.Color.magenta);
        noWholesales.setText("No");

        activateWholesale.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        activateWholesale.setForeground(java.awt.Color.magenta);
        activateWholesale.setText("Activate Wholesale");

        activateHalfWholesale.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        activateHalfWholesale.setForeground(java.awt.Color.magenta);
        activateHalfWholesale.setText("Activate Half Wholesale");

        priceWholesaleLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        priceWholesaleLabel.setForeground(java.awt.Color.blue);
        priceWholesaleLabel.setText("Price");

        fromWholesaleLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        fromWholesaleLabel.setForeground(java.awt.Color.blue);
        fromWholesaleLabel.setText("From: ");

        priceHalfWholesaleLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        priceHalfWholesaleLabel.setForeground(java.awt.Color.blue);
        priceHalfWholesaleLabel.setText("Price: ");

        fromHalfWholesaleLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        fromHalfWholesaleLabel.setForeground(java.awt.Color.blue);
        fromHalfWholesaleLabel.setText("From: ");

        priceWholesaleField.setForeground(java.awt.Color.magenta);
        priceWholesaleField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        fromWholesaleField.setForeground(java.awt.Color.magenta);
        fromWholesaleField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        priceHalfWholesaleField.setForeground(java.awt.Color.magenta);
        priceHalfWholesaleField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        fromHalfWholesaleField.setForeground(java.awt.Color.magenta);
        fromHalfWholesaleField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageWholesalesLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(activateWholesale)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(priceWholesaleLabel)
                                            .addComponent(fromWholesaleLabel))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fromWholesaleField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(priceWholesaleField))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(activateHalfWholesale)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(priceHalfWholesaleLabel)
                                            .addComponent(fromHalfWholesaleLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(priceHalfWholesaleField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                            .addComponent(fromHalfWholesaleField))))))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(yesWholesales)
                        .addGap(141, 141, 141)
                        .addComponent(noWholesales)
                        .addGap(256, 256, 256))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageWholesalesLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesWholesales)
                    .addComponent(noWholesales))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activateWholesale)
                    .addComponent(activateHalfWholesale))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceWholesaleLabel)
                    .addComponent(priceHalfWholesaleLabel)
                    .addComponent(priceWholesaleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceHalfWholesaleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromWholesaleLabel)
                    .addComponent(fromHalfWholesaleLabel)
                    .addComponent(fromWholesaleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromHalfWholesaleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Wholesale and Half Wholesale", jPanel2);

        loadImage.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        loadImage.setForeground(java.awt.Color.red);
        loadImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/load.png"))); // NOI18N
        loadImage.setText("Load Image");

        save.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        save.setForeground(java.awt.Color.red);
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        save.setText("Save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barcodeLabel)
                    .addComponent(saleTypeLabel)
                    .addComponent(nameLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barcodeField)
                    .addComponent(nameField)
                    .addComponent(saleTypeField, 0, 228, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save)
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadImage)
                        .addGap(222, 222, 222))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barcodeLabel)
                    .addComponent(barcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saleTypeLabel)
                    .addComponent(saleTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loadImage)
                        .addGap(18, 18, 18)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabbedPane)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addRadioButtonsToButtonGroup(){
        expirationButtonGroup.add(yesExpiration);
        expirationButtonGroup.add(noExpiration);
        inventaryButtonGroup.add(yesInventary);
        inventaryButtonGroup.add(noInventary);
        wholesalesButtonGroup.add(yesWholesales);
        wholesalesButtonGroup.add(noWholesales);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SpecsPanel;
    public javax.swing.JCheckBox activateHalfWholesale;
    public javax.swing.JCheckBox activateWholesale;
    public javax.swing.JTextField barcodeField;
    private javax.swing.JLabel barcodeLabel;
    public javax.swing.JFormattedTextField buyPriceField;
    private javax.swing.JLabel buyPriceLabel;
    public javax.swing.JTextArea descriptionField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionScroll;
    private javax.swing.ButtonGroup expirationButtonGroup;
    public javax.swing.JLabel expirationDateLabel;
    public javax.swing.JFormattedTextField expirationField;
    public javax.swing.JLabel formatExpirationLabel;
    public javax.swing.JFormattedTextField fromHalfWholesaleField;
    public javax.swing.JLabel fromHalfWholesaleLabel;
    public javax.swing.JFormattedTextField fromWholesaleField;
    public javax.swing.JLabel fromWholesaleLabel;
    public javax.swing.JLabel haveExpirationLabel;
    public javax.swing.JLabel imageLabel;
    public javax.swing.JFormattedTextField inStockField;
    public javax.swing.JLabel inStockLabel;
    private javax.swing.ButtonGroup inventaryButtonGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton loadImage;
    public javax.swing.JLabel manageInventaryLabel;
    public javax.swing.JLabel manageWholesalesLabel;
    public javax.swing.JFormattedTextField minimalAmountField;
    public javax.swing.JLabel minimalAmountLabel;
    public javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    public javax.swing.JRadioButton noExpiration;
    public javax.swing.JRadioButton noInventary;
    public javax.swing.JRadioButton noWholesales;
    public javax.swing.JFormattedTextField priceHalfWholesaleField;
    public javax.swing.JLabel priceHalfWholesaleLabel;
    public javax.swing.JFormattedTextField priceWholesaleField;
    public javax.swing.JLabel priceWholesaleLabel;
    private javax.swing.JPanel pricesTaxPanel;
    public javax.swing.JFormattedTextField salePriceField;
    private javax.swing.JLabel salePriceLabel;
    public javax.swing.JComboBox saleTypeField;
    private javax.swing.JLabel saleTypeLabel;
    public javax.swing.JButton save;
    public javax.swing.JComboBox sectionField;
    private javax.swing.JLabel sectionLabel;
    private javax.swing.JTabbedPane tabbedPane;
    public javax.swing.JComboBox taxField;
    private javax.swing.JLabel taxLabel;
    private javax.swing.ButtonGroup wholesalesButtonGroup;
    public javax.swing.JRadioButton yesExpiration;
    public javax.swing.JRadioButton yesInventary;
    public javax.swing.JRadioButton yesWholesales;
    // End of variables declaration//GEN-END:variables
}
