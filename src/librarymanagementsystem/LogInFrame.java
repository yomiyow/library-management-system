package librarymanagementsystem;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.event.ItemEvent;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author admin
 * since 11/14/2023
 */
public class LogInFrame extends javax.swing.JFrame {
    private Connection connection =  DatabaseConnection.getConnection();
    public String _firstName;
    public int _userId;
    
    public LogInFrame() {
        initComponents();
        userNameTextField.setEnabled(false);
        passwordField.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        logInButton = new javax.swing.JButton();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        signUpLink = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        accountRoleComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("<html><b><font color='#333333'>Log in</font></b></html>");
        setLocation(new java.awt.Point(800, 250));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setForeground(new java.awt.Color(249, 249, 249));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Library Management System");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Log in");

        userNameTextField.setForeground(new java.awt.Color(51, 51, 51));

        logInButton.setBackground(new java.awt.Color(24, 119, 242));
        logInButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logInButton.setForeground(new java.awt.Color(255, 255, 255));
        logInButton.setText("LOGIN");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        showPasswordCheckBox.setForeground(new java.awt.Color(51, 51, 51));
        showPasswordCheckBox.setText("show password");
        showPasswordCheckBox.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        showPasswordCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showPasswordCheckBoxItemStateChanged(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Don't have an account?");

        signUpLink.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        signUpLink.setForeground(new java.awt.Color(0, 0, 255));
        signUpLink.setText("<html><u> Sign up </u><html>");
        signUpLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLinkMouseClicked(evt);
            }
        });

        passwordField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(85, 85, 85));
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(85, 85, 85));
        jLabel4.setText("Username");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(85, 85, 85));
        jLabel6.setText("Log in as...");

        accountRoleComboBox.setForeground(new java.awt.Color(51, 51, 51));
        accountRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html><font color='gray'>Select...</font></html>", "Librarian", "Teacher", "Student", "Staff" }));
        accountRoleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountRoleComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userNameTextField)
            .addComponent(passwordField)
            .addComponent(accountRoleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signUpLink, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(showPasswordCheckBox)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(accountRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPasswordCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(signUpLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showPasswordCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxItemStateChanged
        int state = evt.getStateChange();
        
        if (state == ItemEvent.SELECTED){
            passwordField.setEchoChar((char) 0);
        }
        else {
            passwordField.setEchoChar('•');
        }
    }//GEN-LAST:event_showPasswordCheckBoxItemStateChanged

    private void signUpLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLinkMouseClicked
        new SignUpFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_signUpLinkMouseClicked

    private void accountRoleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountRoleComboBoxActionPerformed
        final int SELECT = 0;
        final int SELECTED_ROLE = accountRoleComboBox.getSelectedIndex();
        
        if (SELECTED_ROLE != SELECT) {
            userNameTextField.setEnabled(true);
            passwordField.setEnabled(true);
        }
        else {
            userNameTextField.setEnabled(false);
            passwordField.setEnabled(false);
        }
    }//GEN-LAST:event_accountRoleComboBoxActionPerformed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        String username = userNameTextField.getText();
        String password = String.valueOf(passwordField.getPassword());
        String role = accountRoleComboBox.getSelectedItem().toString();

        if (username.isBlank() ||
                password.isBlank() ||
                role.equals("Select")) {
            
            JOptionPane.showMessageDialog(this, "Fill out needed information", "Reminder", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String selectQuery = "SELECT * FROM account WHERE username = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                int dbUserId = resultSet.getInt("user_id");
                String dbFirstName = resultSet.getString("first_name");
                String dbUsername = resultSet.getString("username");
                String dbPassword = resultSet.getString("password");
                String dbRole = resultSet.getString("role");
                
                if (dbUsername.equals(username) &&
                        dbPassword.equals(password) &&
                        dbRole.equals(role)) {

                    _userId = dbUserId;
                    _firstName = dbFirstName;

                    JOptionPane.showMessageDialog(this, "Log in succesful", "Notice", JOptionPane.INFORMATION_MESSAGE);
                    identifyAccountRole(role);
                    return;
                }        
            }
            
            JOptionPane.showMessageDialog(this, "This credential doesn't match our record", "Error Occured", JOptionPane.ERROR_MESSAGE);     
        } catch (SQLException ex) {
            System.err.println("Log in Operation: " + ex.getMessage());
        }
    }//GEN-LAST:event_logInButtonActionPerformed

    private void identifyAccountRole(String role) {
        switch (role) {
            case "Librarian": {
                LibrarianBookManagementFrame.librarianFirstName = _firstName;
                LibrarianBookManagementFrame.librarianUserId = _userId;
                
                LibrarianMemberManagementFrame.librarianFirstName = _firstName;
                LibrarianMemberManagementFrame.librarianUserId = _userId;
                
                LibrarianBorrowedBookManagementFrame.librarianFirstName = _firstName;
                LibrarianBorrowedBookManagementFrame.librarianUserId = _userId;
                
                new LibrarianBookManagementFrame().setVisible(true);
                dispose();
                break;
            }
            case "Student": {
                UserViewBooksFrame.firstName = _firstName;
                UserViewBooksFrame.userFrameUserId = _userId;
                
                UserViewBorrowedBooksFrame.firstName = _firstName;
                UserViewBorrowedBooksFrame.userFrameUserId = _userId;
                
                new UserViewBooksFrame().setVisible(true);
                dispose();
                break;
            }
            case "Staff": {
                UserViewBooksFrame.firstName = _firstName;
                UserViewBooksFrame.userFrameUserId = _userId;
                
                UserViewBorrowedBooksFrame.firstName = _firstName;
                UserViewBorrowedBooksFrame.userFrameUserId = _userId;
                
                new UserViewBooksFrame().setVisible(true);
                dispose();
                break;
            }
            case "Teacher": {
                UserViewBooksFrame.firstName = _firstName;
                UserViewBooksFrame.userFrameUserId = _userId;
                
                UserViewBorrowedBooksFrame.firstName = _firstName;
                UserViewBorrowedBooksFrame.userFrameUserId = _userId;
                
                new UserViewBooksFrame().setVisible(true);
                dispose();
                break;
            }
        }
    }

    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
             System.out.println(ex.getMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accountRoleComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logInButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JLabel signUpLink;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
