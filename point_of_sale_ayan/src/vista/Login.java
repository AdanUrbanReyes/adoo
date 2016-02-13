package vista;

import javax.swing.WindowConstants;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        //setResizable(false);
        //setLocationRelativeTo(null);
        setTitle("Login");
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

        pideFields = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userEnter = new javax.swing.JTextField();
        passwordEnter = new javax.swing.JPasswordField();
        enter = new javax.swing.JButton();
        goOut = new javax.swing.JButton();
        typeOfUserComboBox = new javax.swing.JComboBox();
        typeOfUserLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("point of sale ayan");

        pideFields.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pideFields.setForeground(new java.awt.Color(255, 51, 153));
        pideFields.setText("Please enter user and password");

        userLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(102, 0, 0));
        userLabel.setText("User:");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(102, 0, 51));
        passwordLabel.setText("Password:");

        userEnter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userEnter.setForeground(new java.awt.Color(51, 51, 255));

        passwordEnter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        passwordEnter.setForeground(new java.awt.Color(0, 0, 255));
        passwordEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordEnterActionPerformed(evt);
            }
        });

        enter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        enter.setText("Enter");

        goOut.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        goOut.setText("Exit");

        typeOfUserComboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        typeOfUserComboBox.setForeground(new java.awt.Color(102, 0, 102));
        typeOfUserComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Employeer", "Boss" }));

        typeOfUserLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        typeOfUserLabel.setForeground(new java.awt.Color(102, 0, 102));
        typeOfUserLabel.setText("Type of User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typeOfUserLabel)
                        .addGap(53, 53, 53)
                        .addComponent(typeOfUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                                .addComponent(passwordEnter)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enter)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(goOut)
                            .addGap(36, 36, 36)))
                    .addComponent(pideFields, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(pideFields, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeOfUserLabel)
                    .addComponent(typeOfUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enter)
                    .addComponent(goOut))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordEnterActionPerformed
    public void fieldsEmpty(){
        javax.swing.JOptionPane.showMessageDialog(null,"please enter all fields","error",javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    public void userNotValido(){
        javax.swing.JOptionPane.showMessageDialog(null,"the user or passsowd is not valido","error",javax.swing.JOptionPane.ERROR_MESSAGE);
    }       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton enter;
    public javax.swing.JButton goOut;
    public javax.swing.JPasswordField passwordEnter;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel pideFields;
    public javax.swing.JComboBox typeOfUserComboBox;
    private javax.swing.JLabel typeOfUserLabel;
    public javax.swing.JTextField userEnter;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
