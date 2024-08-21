package librarymanagementsystem;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @since 11/16/2023
 */
public class LibrarianBorrowedBookManagementFrame extends javax.swing.JFrame {
    Connection connection = DatabaseConnection.getConnection();
    DefaultTableModel booksTableModel;
    public static int librarianUserId;
    public static String librarianFirstName;
    
    public LibrarianBorrowedBookManagementFrame() {
        initComponents(); 
        librarianFirstNameLabel.setText(librarianFirstName);
        LibrarianMemberManagementFrame.librarianUserId = librarianUserId;
        populateBooksTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        manageBooksButton = new javax.swing.JButton();
        manageMembersButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        librarianFirstNameLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        manageBooksButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        searchTextField = new javax.swing.JTextField();
        booksFilterComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Borrowed Books");
        setLocation(new java.awt.Point(450, 150));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        manageBooksButton.setText("Manage Books");
        manageBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBooksButtonActionPerformed(evt);
            }
        });

        manageMembersButton.setText("Manage Members");
        manageMembersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMembersButtonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Welcome back!");

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
        librarianFirstNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        librarianFirstNameLabel.setText("First Name");

        manageBooksButton1.setBackground(new java.awt.Color(24, 119, 242));
        manageBooksButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        manageBooksButton1.setForeground(new java.awt.Color(255, 255, 255));
        manageBooksButton1.setText("Manage Borrowed Books");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageBooksButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageMembersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageBooksButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logOutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(librarianFirstNameLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(librarianFirstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageMembersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageBooksButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        booksTable.setAutoCreateRowSorter(true);
        booksTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Borrow_ID", "Title", "Category", "Borrower First Name", "Borrower Last Name", "Borrowed Date", "Return Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booksTable.setFillsViewportHeight(true);
        booksTable.setShowGrid(true);
        booksTable.getTableHeader().setResizingAllowed(false);
        booksTable.getTableHeader().setReorderingAllowed(false);
        booksTable.setUpdateSelectionOnSort(false);
        booksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booksTable);

        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        booksFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html><font color='gray'>Category...</font></html>", "Programming", "Science", "Math", "Philosophy", "English" }));
        booksFilterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksFilterComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setText("Search");

        jLabel10.setText("Filter Books by");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(booksFilterComboBox, 0, 153, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(booksFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void manageMembersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMembersButtonActionPerformed
        new LibrarianMemberManagementFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_manageMembersButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to log out?", 
                "Log out Confirmation", 
                JOptionPane.YES_NO_OPTION);
        
        final int YES = 0;
        if (response == YES) {
            new LogInFrame().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void booksFilterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksFilterComboBoxActionPerformed
        booksTableModel.setRowCount(0);
        
        String selectedCategory = booksFilterComboBox.getSelectedItem().toString();
        
        String selectQuery = "SELECT borrowed_books.borrow_id, "
                + "books.title, books.category, "
                + "account.first_name, account.last_name, "
                + "borrowed_books.borrowed_date, "
                + "borrowed_books.returned_date " +
                "FROM borrowed_books " +
                "JOIN books ON borrowed_books.book_isbn = books.isbn " +
                "JOIN account ON borrowed_books.user_id = account.user_id " +
                "WHERE category = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setString(1, selectedCategory);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            int columnCount = resultSet.getMetaData().getColumnCount();
            
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                
                for (int i = 1; i <= columnCount; i++) {
                    row[i-1] = resultSet.getObject(i);
                }
                
                booksTableModel.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println("Books Filtering Operation: " + ex.getMessage());
        }       

        final int SELECT = 0;
        if (booksFilterComboBox.getSelectedIndex() == SELECT) {
            populateBooksTable();
        }
    }//GEN-LAST:event_booksFilterComboBoxActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        booksTableModel.setRowCount(0);
        
        String userInputTiTle = searchTextField.getText();
        String userInputFirstName = searchTextField.getText();
        String userInputLastName = searchTextField.getText();

        String searchQuery = "SELECT borrowed_books.borrow_id, "
                + "books.title, "
                + "books.category, account.first_name, "
                + "account.last_name, "
                + "borrowed_books.borrowed_date, "
                + "borrowed_books.returned_date " +
                "FROM borrowed_books " +
                "JOIN books ON borrowed_books.book_isbn = books.isbn " +
                "JOIN account ON borrowed_books.user_id = account.user_id " +
                "WHERE books.title LIKE ? OR account.first_name LIKE ? OR account.last_name LIKE ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(searchQuery)) {
            preparedStatement.setString(1, "%" + userInputTiTle + "%");
            preparedStatement.setString(2, "%" + userInputFirstName);
            preparedStatement.setString(3, userInputLastName + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            
            int columnCount = resultSet.getMetaData().getColumnCount();

            while (resultSet.next()) {
                Object[] row = new Object[columnCount];

                for (int i = 1; i <= columnCount; i++) {
                    row[i-1] = resultSet.getObject(i);
                }

                booksTableModel.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println("Search Operation: " + ex.getMessage());
        }
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void booksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksTableMouseClicked
        int selectedRow = 0;
        
        try {
            selectedRow = booksTable.getSelectedRow();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("SelectedRow: " + ex.getMessage());
        }

        int borrow_id = Integer.parseInt(booksTable.getValueAt(selectedRow, 0).toString());
        String title = String.valueOf(booksTable.getValueAt(selectedRow, 1));
        String category = String.valueOf(booksTable.getValueAt(selectedRow, 2));
        String borrowerFirstName = String.valueOf(booksTable.getValueAt(selectedRow, 3));
        String borrowerLastName = String.valueOf(booksTable.getValueAt(selectedRow, 4));
        String borrowedDate = String.valueOf(booksTable.getValueAt(selectedRow, 5));
        String returnDate = String.valueOf(booksTable.getValueAt(selectedRow, 6));

        final int CLICKED_2_TIMES = 2;
        if (evt.getClickCount() == CLICKED_2_TIMES) {

            String borrowingDetails = "<html><b>Borrow_ID:</b> " + borrow_id + "<br>" +
                    "<b>Title:</b> " + title + "<br>" +
                    "<b>Category:</b> " + category + "<br>" +
                    "<b>Borrower Name:</b> " + borrowerFirstName + " " + borrowerLastName +"<br>" +
                    "<b>Borrowed Date:</b> " + borrowedDate + "<br>" +
                    "<b>Return Date:</b> " + returnDate + "</html>";

            String[] options = {"Returned", "Close"};
                
            int response = JOptionPane.showOptionDialog(this, 
                                                borrowingDetails, 
                                                "Borrowing Details", 
                                                JOptionPane.OK_CANCEL_OPTION, 
                                                JOptionPane.PLAIN_MESSAGE, 
                                                null, 
                                                options, 
                                                1
                                        );
            
            final int RETURNED = 0;
            if (response == RETURNED) {
                int returnConfirmation = JOptionPane.showConfirmDialog(this,
                                                            "Has this book already been returned?",
                                                            "Returning Book Confirmation",
                                                            JOptionPane.YES_NO_OPTION)
                                                    ;
                
                final int YES = 0;
                if (returnConfirmation == YES) {
                    deleteReturnedBooks(borrow_id);
                    incrementBookQuantity(title);
                    
                    populateBooksTable();
                }
            }
        }
    }//GEN-LAST:event_booksTableMouseClicked

    private void deleteReturnedBooks(int borrowId) {
        String deleteQuery = "DELETE FROM borrowed_books " +
                "WHERE borrow_id = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, borrowId);
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Returned Successful!", "Notice", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println("Delete Return Books Method: " + ex.getMessage());
        }
    }
    
    private void incrementBookQuantity(String title) {
        String updateQuery = "UPDATE books "
                + "SET quantity = quantity + 1 "
                + "WHERE title = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, title);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Increment Book Quantity Method: " + ex.getMessage());
        }
    }
    
    private void manageBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBooksButtonActionPerformed
        new LibrarianBookManagementFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_manageBooksButtonActionPerformed

    private void populateBooksTable() {
        booksTableModel = (DefaultTableModel) booksTable.getModel();
        booksTableModel.setRowCount(0);
        
        String selectQuery = "SELECT borrowed_books.borrow_id, "
                + "books.title, books.category, "
                + "account.first_name, "
                + "account.last_name, "
                + "borrowed_books.borrowed_date, "
                + "borrowed_books.returned_date " +
                "FROM borrowed_books " +
                "JOIN books ON borrowed_books.book_isbn = books.isbn " +
                "JOIN account ON borrowed_books.user_id = account.user_id";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            
            int columnCount = resultSet.getMetaData().getColumnCount();
            
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                
                for (int i = 1; i <= columnCount; i++) {
                    row[i-1] = resultSet.getObject( i);
                }
                
                booksTableModel.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println("Populate Table Operation: " + ex.getMessage());
        }       
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
             System.out.println(ex.getMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianBorrowedBookManagementFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> booksFilterComboBox;
    private javax.swing.JTable booksTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel librarianFirstNameLabel;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton manageBooksButton;
    private javax.swing.JButton manageBooksButton1;
    private javax.swing.JButton manageMembersButton;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
