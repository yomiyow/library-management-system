package librarymanagementsystem;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @since 11/16/2023
 */
public class UserViewBooksFrame extends javax.swing.JFrame {
    private Connection connection = DatabaseConnection.getConnection();
    private DefaultTableModel booksTableModel;
    public static int userFrameUserId;
    public static String firstName;
    
    public UserViewBooksFrame() {
        initComponents();
        UserViewBorrowedBooksFrame.userFrameUserId = userFrameUserId;
        userFirstNameLabel.setText(firstName);
        populateBookTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        viewBooksButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewBorrowedBooksButton = new javax.swing.JButton();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        bookDetailsTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Books");
        setLocation(new java.awt.Point(380, 200));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        viewBooksButton.setBackground(new java.awt.Color(24, 119, 242));
        viewBooksButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        viewBooksButton.setForeground(new java.awt.Color(255, 255, 255));
        viewBooksButton.setText("View Books");

        jLabel1.setText("Welcome Back!");

        viewBorrowedBooksButton.setText("View Borrowed Books");
        viewBorrowedBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBorrowedBooksButtonActionPerformed(evt);
            }
        });

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
        userFirstNameLabel.setText("First Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewBorrowedBooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewBooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(userFirstNameLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userFirstNameLabel)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewBorrowedBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                "ISBN", "Title", "Author", "Publish Date", "Category", "Status", "Quantity"
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
        booksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksTableMouseClicked(evt);
            }
        });
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

        bookDetailsTextArea.setEditable(false);
        bookDetailsTextArea.setColumns(20);
        bookDetailsTextArea.setRows(5);
        jScrollPane2.setViewportView(bookDetailsTextArea);

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
                    .addComponent(jScrollPane2)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksTableMouseClicked
        
        int selectedRow = 0;
        try {
            if (selectedRow != -1)
                selectedRow = booksTable.getSelectedRow();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("SelectedRow: " + ex.getMessage());
            return;
        }

        String isbn = String.valueOf(booksTable.getValueAt(selectedRow, 0));
        String title = String.valueOf(booksTable.getValueAt(selectedRow, 1));
        String author = String.valueOf(booksTable.getValueAt(selectedRow, 2));
        String publishDate = String.valueOf(booksTable.getValueAt(selectedRow, 3));
        String category = String.valueOf(booksTable.getValueAt(selectedRow, 4));
        String status = String.valueOf(booksTable.getValueAt(selectedRow, 5));
        String quantity = String.valueOf(booksTable.getValueAt(selectedRow, 6));

        final int CLICKED_2_TIMES = 2;
        if (evt.getClickCount() == CLICKED_2_TIMES) {
            String bookDetails = "<html><b>Title:</b> " + title + "<br>" +
                    "<b>Author:</b> " + author + "<br>" +
                    "<b>ISBN:</b> " + isbn + "<br>" +
                    "<b>Publish Date:</b> " + publishDate + "<br>" +
                    "<b>Category:</b> " + category + "<br>" +
                    "<b>Status:</b> " + status + "<br>" +
                    "<b>Quantity:</b> " + quantity + "</html>";
            
            String[] options = {"Borrow", "Close"};

            int response = JOptionPane.showOptionDialog(this, bookDetails, "Book Details", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, 1);
            
            final int BORROW = 0;
            if (response == BORROW) {
                Date borrowDate = new Date(Calendar.getInstance().getTimeInMillis());
            
                Calendar returnDateCalendar = Calendar.getInstance();
                returnDateCalendar.setTime(borrowDate);
                final int BORROWED_DAYS_LIMT = 15;
                returnDateCalendar.add(Calendar.DAY_OF_YEAR, BORROWED_DAYS_LIMT);
            
                Date returnDate = new Date(returnDateCalendar.getTimeInMillis());       
                
                insertNewBorrowedRecord(borrowDate, returnDate, isbn); 

                populateBookTable();
            }
        }

        StringBuilder bookDetails = new StringBuilder();
            
        bookDetails.append("ISBN             :  ").append(isbn).append("\n");
        bookDetails.append("Title              :  ").append(title).append("\n");
        bookDetails.append("Author          :  ").append(author).append("\n");
        bookDetails.append("Publish Date:  ").append(publishDate).append("\n");
        bookDetails.append("Category      :  ").append(category).append("\n");
        bookDetails.append("Status           :  ").append(status).append("\n");
        bookDetails.append("Quantity       :  ").append(quantity).append("\n");
            
        bookDetailsTextArea.setText(bookDetails.toString());

    }//GEN-LAST:event_booksTableMouseClicked

    private void insertNewBorrowedRecord(Date borrowDate, Date returnDate, String isbn) {
        String insertQuery = "INSERT INTO borrowed_books (user_id, book_isbn, borrowed_date, returned_date) "
                + "VALUES (?, ?, ?, ?)";
        
        String selectQuery =  "SELECT quantity, status FROM books WHERE isbn = ?";
            
        try (PreparedStatement bookQuantityAndStatus = connection.prepareStatement(selectQuery)) {
            PreparedStatement borrowedBooks = connection.prepareStatement(insertQuery);
            
            bookQuantityAndStatus.setLong(1, Long.parseLong(isbn));
            ResultSet bookResultSet = bookQuantityAndStatus.executeQuery();
            
            if (bookResultSet.next()) {
                int bookQuantity = bookResultSet.getInt("quantity");
                String bookStatus = bookResultSet.getString("status");
                
                if (bookQuantity > 0 && bookStatus.equals("Available")) {
                    borrowedBooks.setInt(1, userFrameUserId);
                    borrowedBooks.setLong(2, Long.parseLong(isbn));
                    borrowedBooks.setString(3, borrowDate.toString());
                    borrowedBooks.setString(4, returnDate.toString());
                    borrowedBooks.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this, "Book Borrowed Successfully!", "Notice", JOptionPane.INFORMATION_MESSAGE);

                }
                else {
                    JOptionPane.showMessageDialog(this, "This book is currently not available/out of stock", "Reminder", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }       
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "You cannot borrow the same book twice!", "Reminder", JOptionPane.ERROR_MESSAGE);
            System.out.println("Insert New Borrowed Record: " + ex.getMessage());
            return;
        }
        
        decrementBookQuantity(isbn);
        updateBookStatusWhenQuantityIsZero(isbn);
    }
    
    private void decrementBookQuantity(String isbn) {
        String updateQuery = "UPDATE books "
                + "SET quantity = quantity - 1 "
                + "WHERE isbn = ? AND quantity > 0";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, isbn);
            preparedStatement.executeUpdate();
        
        } catch (SQLException ex) {
            System.out.println("Decrement Book Quantity Operation: " + ex.getMessage());
        }
    }
        
    private void updateBookStatusWhenQuantityIsZero(String isbn) {
        String updateQuery = "UPDATE books "
                + "SET status = 'Not Available' "
                + "WHERE isbn = ? AND quantity = 0";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, isbn);
            preparedStatement.executeUpdate();
        
        } catch (SQLException ex) {
            System.out.println("Update Book Status Operation: " + ex.getMessage());
        }
    }
    
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

    private void viewBorrowedBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBorrowedBooksButtonActionPerformed
        new UserViewBorrowedBooksFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_viewBorrowedBooksButtonActionPerformed

    private void booksFilterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksFilterComboBoxActionPerformed
        booksTableModel.setRowCount(0);
        
        String selectedCategory = booksFilterComboBox.getSelectedItem().toString();
        String selectQuery = "SELECT * FROM books " + 
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
            populateBookTable();
        }
    }//GEN-LAST:event_booksFilterComboBoxActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        booksTableModel.setRowCount(0);
        
        String userInput = searchTextField.getText();
        String searchQuery = "SELECT * FROM books "
                + "WHERE title LIKE ? OR author LIKE ?";
          
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
                
                booksTableModel.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println("Search Operation: " + ex.getMessage());
        }
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void populateBookTable() {
        booksTableModel = (DefaultTableModel) booksTable.getModel();
        booksTableModel.setRowCount(0);
        
        String selectQuery = "SELECT * FROM books";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
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
            System.out.println("Populate Book Table Operation: " + ex.getMessage());
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
                new UserViewBooksFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bookDetailsTextArea;
    private javax.swing.JComboBox<String> booksFilterComboBox;
    private javax.swing.JTable booksTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel userFirstNameLabel;
    private javax.swing.JButton viewBooksButton;
    private javax.swing.JButton viewBorrowedBooksButton;
    // End of variables declaration//GEN-END:variables
}
