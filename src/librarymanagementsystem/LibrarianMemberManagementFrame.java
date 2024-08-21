package librarymanagementsystem;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @since 11/16/2023
 */
public class LibrarianMemberManagementFrame extends javax.swing.JFrame {
    private Connection connection = DatabaseConnection.getConnection();
    private DefaultTableModel membersTableModel;
    public static int librarianUserId;
    public static String librarianFirstName;
    
    public LibrarianMemberManagementFrame() {
        initComponents();
        LibrarianBookManagementFrame.librarianUserId = librarianUserId;
        librarianFirstNameLabel.setText(librarianFirstName);
        userIDTextField.setVisible(false);
        populateMembersTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        manageBooksButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manageMembersButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        librarianFirstNameLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        manageBooksButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        membersTable = new javax.swing.JTable();
        firstNameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        userNameTextField = new javax.swing.JTextField();
        roleComboBox = new javax.swing.JComboBox<>();
        clearButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        accountRoleComboBox = new javax.swing.JComboBox<>();
        passwordTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        userIDTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Members");
        setLocation(new java.awt.Point(450, 150));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        manageBooksButton.setText("Manage Books");
        manageBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBooksButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome Back!");

        manageMembersButton.setBackground(new java.awt.Color(24, 119, 242));
        manageMembersButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        manageMembersButton.setForeground(new java.awt.Color(255, 255, 255));
        manageMembersButton.setText("Manage Members");

        logOutButton.setBackground(new java.awt.Color(255, 0, 0));
        logOutButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(0, 255, 255));
        logOutButton.setText("Log out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        librarianFirstNameLabel.setFont(new java.awt.Font("Georgia Pro Black", 0, 24)); // NOI18N
        librarianFirstNameLabel.setText("First Name");

        manageBooksButton1.setText("Manage Borrowed Books");
        manageBooksButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBooksButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(manageBooksButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(logOutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(librarianFirstNameLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(manageBooksButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageMembersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(librarianFirstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageMembersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageBooksButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        membersTable.setAutoCreateRowSorter(true);
        membersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "User_ID", "First Name", "Last Name", "Email", "Username", "Password", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        membersTable.setFillsViewportHeight(true);
        membersTable.setShowGrid(true);
        membersTable.getTableHeader().setResizingAllowed(false);
        membersTable.getTableHeader().setReorderingAllowed(false);
        membersTable.setUpdateSelectionOnSort(false);
        membersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                membersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(membersTable);

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html><font color='gray'>Select...</font></html>", "Librarian", "Teacher", "Student", "Staff" }));

        clearButton.setText("CLEAR");
        clearButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        addButton.setText("ADD");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE");
        updateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Email:");

        jLabel4.setText("Password:");

        jLabel7.setText("First Name:");

        jLabel8.setText("Role:");

        jLabel9.setText("Search:");

        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        jLabel10.setText("Filter Members by:");

        accountRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html><font color='gray'>Role...</font></html>", "Librarian", "Teacher", "Student", "Staff", " ", " " }));
        accountRoleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountRoleComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("Username:");

        jLabel11.setText("Last Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accountRoleComboBox, 0, 131, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordTextField)
                                    .addComponent(userNameTextField)
                                    .addComponent(emailTextField)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(roleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(accountRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(userIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String email = emailTextField.getText();
        String username = userNameTextField.getText();
        String password = passwordTextField.getText();
        String role = roleComboBox.getSelectedItem().toString();
        int user_id = 0;
        try {
            int selectedRow = membersTable.getSelectedRow();
            final int USER_ID_COLUMN = 0;
            user_id = Integer.parseInt(membersTable.getValueAt(selectedRow, USER_ID_COLUMN).toString());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Row Selection: " + ex.getMessage());
        }
        
        if (firstName.isBlank() ||
                lastName.isBlank() ||
                email.isBlank() ||
                username.isBlank() ||
                password.isBlank() ||
                role.isBlank()) {
            JOptionPane.showMessageDialog(this, "Fill out needed information.", "Reminder", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String insertQuery = "INSERT INTO account (first_name, last_name, email, username, password, role, user_id) " + 
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, username);
            preparedStatement.setString(5, password);
            preparedStatement.setString(6, role);
            preparedStatement.setInt(7, user_id);
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Member Added Successfully.", "Notice", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.err.println("Add Operation: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "This record already exist", "Notice", JOptionPane.WARNING_MESSAGE);
        }     
        
        populateMembersTable();  
    }//GEN-LAST:event_addButtonActionPerformed

    private void populateMembersTable() {
        membersTableModel = (DefaultTableModel) membersTable.getModel();
        membersTableModel.setRowCount(0);
        
        String selectQuery = "SELECT * FROM account";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            int columnCount = resultSet.getMetaData().getColumnCount();
            
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                
                for (int i = 1; i <= columnCount; i++) {
                    row[i-1] = resultSet.getObject(i);
                }
                
                membersTableModel.addRow(row);
            }
        } catch (SQLException ex) {
            System.err.println("Populate Members Table Operation: " + ex.getMessage());
        }
        
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String email = emailTextField.getText();
        String username = userNameTextField.getText();
        String password = passwordTextField.getText();
        String role = roleComboBox.getSelectedItem().toString();
        int user_id = 0;
        try {
            int selectedRow = membersTable.getSelectedRow();
            final int USER_ID_COLUMN = 0;
            user_id = Integer.parseInt(membersTable.getValueAt(selectedRow, USER_ID_COLUMN).toString());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Row Selection: " + ex.getMessage());
        }
        
        if (firstName.isBlank() ||
                lastName.isBlank() ||
                email.isBlank() ||
                username.isBlank() ||
                password.isBlank() ||
                role.isBlank()) {
            
            JOptionPane.showMessageDialog(this, "Fill out needed information.", "Reminder", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String updateQuery = "UPDATE account " + 
                "SET first_name = ?, last_name = ?, email = ?, username = ?, password = ?, role = ? " + 
                "WHERE user_id = ?";
         
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, username);
            preparedStatement.setString(5, password);
            preparedStatement.setString(6, role);
            preparedStatement.setInt(7, user_id);
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Record Succesfully Updated", "Notice", JOptionPane.INFORMATION_MESSAGE);
            
            clearUserInputs();
            membersTable.clearSelection();
        } catch (SQLException ex) {
            System.err.println("Update Operation: " + ex.getMessage());
        }
        
        populateMembersTable();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void membersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_membersTableMouseClicked
        final int CLICKED_2_TIMES = 2;
        if (evt.getClickCount() == CLICKED_2_TIMES) {
            try {
                int selectedRow = membersTable.getSelectedRow();
                String userID = String.valueOf(membersTable.getValueAt(selectedRow, 0));
                String firstName = String.valueOf(membersTable.getValueAt(selectedRow, 1));
                String lastName = String.valueOf(membersTable.getValueAt(selectedRow, 2));
                String email = String.valueOf(membersTable.getValueAt(selectedRow, 3));
                String username = String.valueOf(membersTable.getValueAt(selectedRow, 4));
                String password = String.valueOf(membersTable.getValueAt(selectedRow, 5));
                String role = String.valueOf(membersTable.getValueAt(selectedRow, 6));
                
                userIDTextField.setText(userID);
                firstNameTextField.setText(firstName);
                lastNameTextField.setText(lastName);
                emailTextField.setText(email);
                userNameTextField.setText(username);
                passwordTextField.setText(password);
                roleComboBox.setSelectedItem(role);
            } catch (IndexOutOfBoundsException ex) {
                System.err.println("membersTableMouseClicked Operation: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_membersTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = membersTable.getSelectedRow();
        
        if (selectedRow != -1) {
            final int USER_ID_COLUMN = 0;
            int deletedMember = (int) membersTable.getValueAt(selectedRow, USER_ID_COLUMN);
            
            String deleteQuery = "DELETE FROM account WHERE user_id = ?";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                preparedStatement.setInt(1, deletedMember);
                preparedStatement.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Member deleted Succesfully.", "Notice", JOptionPane.INFORMATION_MESSAGE);    
                
                membersTableModel.removeRow(selectedRow);
                membersTableModel.fireTableDataChanged();
            } catch (SQLException ex) {
                System.err.println("Delete Operation: " + ex.getMessage());
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Select a row in the Table you want to delete.", "Reminder", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearUserInputs();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void manageBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBooksButtonActionPerformed
        new LibrarianBookManagementFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_manageBooksButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Log out Confirmation", JOptionPane.YES_NO_OPTION);
        
        final int YES = 0;
        if (response == YES) {
            new LogInFrame().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        membersTableModel.setRowCount(0);
        
        String userInput = searchTextField.getText();
        String searchQuery = "SELECT * FROM account " +
                "WHERE first_name LIKE ? OR last_name LIKE ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(searchQuery)) {
            preparedStatement.setString(1, "%" + userInput + "%");
            preparedStatement.setString(2, "%" + userInput + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            
            int columnCount = resultSet.getMetaData().getColumnCount();
            
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                
                for (int i = 1; i <= columnCount; i++) {
                    row[i-1] = resultSet.getObject(i);
                }
                
                membersTableModel.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println("Search Operation: " + ex.getMessage());
        }
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void accountRoleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountRoleComboBoxActionPerformed
        membersTableModel.setRowCount(0);
        
        String selectedRole = accountRoleComboBox.getSelectedItem().toString();
        
        String selectQuery = "SELECT * FROM account " + 
                "WHERE role = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setString(1, selectedRole);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            int columnCount = resultSet.getMetaData().getColumnCount();
            
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                
                for (int i = 1; i <= columnCount; i++) {
                    row[i-1] = resultSet.getObject(i);
                }
                
                membersTableModel.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println("Selecting Account Role Operation: " + ex.getMessage());
        }
        
        final int SELECT = 0;
        if (accountRoleComboBox.getSelectedIndex() == SELECT) {
            populateMembersTable();
        }
    }//GEN-LAST:event_accountRoleComboBoxActionPerformed

    private void manageBooksButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBooksButton1ActionPerformed
        new LibrarianBorrowedBookManagementFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_manageBooksButton1ActionPerformed
    
    private void clearUserInputs() {
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        emailTextField.setText("");
        userNameTextField.setText("");
        passwordTextField.setText("");
        roleComboBox.setSelectedIndex(0);
        userIDTextField.setText("");
        
        membersTable.clearSelection();
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
             System.out.println(ex.getMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianMemberManagementFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accountRoleComboBox;
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lastNameTextField;
    public javax.swing.JLabel librarianFirstNameLabel;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton manageBooksButton;
    private javax.swing.JButton manageBooksButton1;
    private javax.swing.JButton manageMembersButton;
    private javax.swing.JTable membersTable;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField userIDTextField;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
