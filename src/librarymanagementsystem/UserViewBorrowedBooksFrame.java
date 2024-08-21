
package librarymanagementsystem;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @since 11/27/2023
 */
public class UserViewBorrowedBooksFrame extends javax.swing.JFrame {
    private Connection connection = DatabaseConnection.getConnection();
    private DefaultTableModel booksTableModel;
    public static int userFrameUserId;
    public static String firstName;
    
    public UserViewBorrowedBooksFrame() { 
        initComponents();
        UserViewBooksFrame.userFrameUserId = userFrameUserId;
        userFirstNameLabel.setText(firstName);
        populateBookTable(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ViewBooksButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        burrowBooksButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        userFirstNameLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        booksFilterComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Borrowed Books");
        setLocation(new java.awt.Point(380, 200));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        ViewBooksButton.setText("View Books");
        ViewBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBooksButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome Back!");

        burrowBooksButton.setBackground(new java.awt.Color(24, 119, 242));
        burrowBooksButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        burrowBooksButton.setForeground(new java.awt.Color(255, 255, 255));
        burrowBooksButton.setText("View Borrowed Books");

        logOutButton.setBackground(new java.awt.Color(255, 0, 0));
        logOutButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(0, 255, 255));
        logOutButton.setText("Log out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        userFirstNameLabel.setFont(new java.awt.Font("Georgia Pro Black", 0, 24)); // NOI18N
        userFirstNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        userFirstNameLabel.setText("First Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(burrowBooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewBooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addComponent(userFirstNameLabel)
                            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userFirstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ViewBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(burrowBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        booksTable.setAutoCreateRowSorter(true);
        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Category", "Borrowed Date", "Return Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booksTable.setFillsViewportHeight(true);
        booksTable.setShowGrid(true);
        booksTable.getTableHeader().setResizingAllowed(false);
        booksTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(booksTable);

        jLabel9.setText("Search");

        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        jLabel10.setText("Filter Books by");

        booksFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html><font color='gray'>Category...</font></html>", "Programming", "Science", "Math", "Philosophy", "English" }));
        booksFilterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksFilterComboBoxActionPerformed(evt);
            }
        });

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
                        .addComponent(booksFilterComboBox, 0, 215, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void ViewBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBooksButtonActionPerformed
        new UserViewBooksFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewBooksButtonActionPerformed

    private void booksFilterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksFilterComboBoxActionPerformed
        booksTableModel.setRowCount(0);
        
        String selectedCategory = booksFilterComboBox.getSelectedItem().toString();
        
        String selectQuery = "SELECT books.title, books.category, borrowed_books.borrowed_date, borrowed_books.returned_date " +
                "FROM borrowed_books " +
                "JOIN books ON borrowed_books.book_isbn = books.isbn " +
                "JOIN account ON borrowed_books.user_id = account.user_id " +
                "WHERE books.category LIKE ? AND account.user_id = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setString(1, selectedCategory);
            preparedStatement.setInt(2, userFrameUserId);
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
            populateBookTable();
        }
    }//GEN-LAST:event_booksFilterComboBoxActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        booksTableModel.setRowCount(0);
        
        String userInput = searchTextField.getText();
        
        String selectQuery = "SELECT books.title, books.category, borrowed_books.borrowed_date, borrowed_books.returned_date " +
                "FROM borrowed_books " +
                "JOIN books ON borrowed_books.book_isbn = books.isbn " +
                "JOIN account ON borrowed_books.user_id = account.user_id " +
                "WHERE books.title LIKE ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setString(1, "%" + userInput + "%");
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

    private void populateBookTable() {
        booksTableModel = (DefaultTableModel) booksTable.getModel();
        booksTableModel.setRowCount(0);
        
        String selectQuery = "SELECT books.title, books.category, borrowed_books.borrowed_date, borrowed_books.returned_date " +
                "FROM borrowed_books " +
                "JOIN books ON borrowed_books.book_isbn = books.isbn " +
                "JOIN account ON borrowed_books.user_id = account.user_id " +
                "WHERE account.user_id = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setInt(1, userFrameUserId);
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
                new UserViewBorrowedBooksFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewBooksButton;
    private javax.swing.JComboBox<String> booksFilterComboBox;
    private javax.swing.JTable booksTable;
    private javax.swing.JButton burrowBooksButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel userFirstNameLabel;
    // End of variables declaration//GEN-END:variables
}
