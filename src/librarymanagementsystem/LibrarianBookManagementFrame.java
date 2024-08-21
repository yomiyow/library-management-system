package librarymanagementsystem;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.print.PrinterException;
import javax.swing.*;
import java.sql.*;
import java.text.MessageFormat;
import java.time.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @since 11/16/2023
 */
public class LibrarianBookManagementFrame extends javax.swing.JFrame {
    Connection connection = DatabaseConnection.getConnection();
    DefaultTableModel booksTableModel;
    public static int librarianUserId;
    public static String librarianFirstName;
    
    public LibrarianBookManagementFrame() {
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
        titleTextField = new javax.swing.JTextField();
        authorTextField = new javax.swing.JTextField();
        isbnTextField = new javax.swing.JTextField();
        searchTextField = new javax.swing.JTextField();
        publishDateChooser = new com.toedter.calendar.JDateChooser();
        quantitySpinner = new javax.swing.JSpinner();
        clearButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        categoryComboBox = new javax.swing.JComboBox<>();
        statusComboBox = new javax.swing.JComboBox<>();
        booksFilterComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Books");
        setLocation(new java.awt.Point(450, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        manageBooksButton.setBackground(new java.awt.Color(24, 119, 242));
        manageBooksButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        manageBooksButton.setForeground(new java.awt.Color(255, 255, 255));
        manageBooksButton.setText("Manage Books");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(librarianFirstNameLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(manageBooksButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageMembersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageBooksButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(librarianFirstNameLabel)
                .addGap(7, 7, 7)
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
                "ISBN", "Title", "Author", "Publish Date", "Category", "Status", "Quantity"
            }
        ));
        booksTable.setFillsViewportHeight(true);
        booksTable.setShowGrid(true);
        booksTable.setShowVerticalLines(false);
        booksTable.getTableHeader().setReorderingAllowed(false);
        booksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booksTable);

        isbnTextField.setToolTipText("");

        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        publishDateChooser.setDateFormatString("yyyy, MM, dd");

        clearButton.setText("CLEAR");
        clearButton.setToolTipText("Remove all inputs");
        clearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        addButton.setText("ADD");
        addButton.setToolTipText("Add book on the list");
        addButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE");
        updateButton.setToolTipText("Update book on the list");
        updateButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");
        deleteButton.setToolTipText("Delete book on the list");
        deleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html><font color='gray'>Select...</font></html>", "Programming", "Science", "Math", "Philosophy", "English" }));

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html><font color='gray'>Select...</font></html>", "Available", "Not Available" }));

        booksFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html><font color='gray'>Category...</font></html>", "Programming", "Science", "Math", "Philosophy", "English" }));
        booksFilterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksFilterComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Author:");

        jLabel4.setText("ISBN:");

        jLabel5.setText("Quantity:");

        jLabel7.setText("Title:");

        jLabel8.setText("Category:");

        jLabel2.setText("Status:");

        jLabel6.setText("Publish Date:");

        jLabel9.setText("Search");

        jLabel10.setText("Filter Books by");

        jButton1.setText("print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(booksFilterComboBox, 0, 153, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(isbnTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(authorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8))
                                            .addComponent(publishDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(categoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(publishDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String isbn = isbnTextField.getText().trim();
        String title = titleTextField.getText();
        String author = authorTextField.getText();
        String date = "";
        try {
            date = publishDateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Fill out needed information", "Reminder", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String category = categoryComboBox.getSelectedItem().toString();
        String status = statusComboBox.getSelectedItem().toString();
        String quantity = quantitySpinner.getValue().toString();
        
        if (isbn.isBlank() || 
                title.isBlank() ||
                author.isBlank() ||
                date.isBlank() ||
                status.isBlank() ||
                quantity.isBlank()) {
            
            JOptionPane.showMessageDialog(this, "Fill out needed information.", "Reminder", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String insertQuery = "INSERT INTO books " + 
                "VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)){
            preparedStatement.setLong(1, Long.parseLong(isbn));
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, author);
            preparedStatement.setString(4, date);
            preparedStatement.setString(5, category);
            preparedStatement.setString(6, status);
            preparedStatement.setInt(7, Integer.parseInt(quantity));
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Book Added Successfully", "Notice", JOptionPane.INFORMATION_MESSAGE);
            
            clearUserInput();
        } catch (SQLException ex) {
            System.err.println("Add Operation: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "This record already exist", "Notice", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException ex) {
            System.err.println("Add Operation: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "ISBN Must Contain Only Numbers", "Error", JOptionPane.ERROR_MESSAGE);        
        }
        
        populateBooksTable();     
    }//GEN-LAST:event_addButtonActionPerformed
    
    private void checkUserInput() {
        String isbn = isbnTextField.getText().trim();
        String title = titleTextField.getText();
        String author = authorTextField.getText();
        String date = "";
        try {
            date = publishDateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Fill out needed information", "Reminder", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String category = categoryComboBox.getSelectedItem().toString();
        String status = statusComboBox.getSelectedItem().toString();
        String quantity = quantitySpinner.getValue().toString();
        
        if (isbn.isBlank() || 
                title.isBlank() ||
                author.isBlank() ||
                date.isBlank() ||
                category.equals("Select...") ||
                status.equals("Select...") ||
                status.isBlank() ||
                quantity.isBlank()) {
            JOptionPane.showMessageDialog(this, "Fill out needed information.", "Reminder", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
      
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearUserInput();   
    }//GEN-LAST:event_clearButtonActionPerformed

    private void clearUserInput() {
        authorTextField.setText("");
        titleTextField.setText("");
        isbnTextField.setText("");
        publishDateChooser.setDate(null);
        statusComboBox.setSelectedIndex(0);
        quantitySpinner.setValue(0);
        categoryComboBox.setSelectedIndex(0);
        
        booksTable.clearSelection();
    }
    
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = booksTable.getSelectedRow();
        
        if (selectedRow != -1) {                
            final int ISBN_COLUMN = 0;
            
            long deletedBook = (long) booksTable.getValueAt(selectedRow, ISBN_COLUMN);
            String deleteQuery = "DELETE FROM books WHERE isbn = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                preparedStatement.setLong(1, deletedBook);
                preparedStatement.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Book deleted Succesfully.", "Notice", JOptionPane.INFORMATION_MESSAGE);    
                
                booksTableModel.removeRow(selectedRow);
                booksTableModel.fireTableDataChanged(); 
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Select a row in the Table you want to delete.", "Reminder", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String isbn = isbnTextField.getText();
        String title = titleTextField.getText();
        String author = authorTextField.getText();
        String date = "";
        try {
            date = publishDateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Fill out needed information", "Reminder", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String category = categoryComboBox.getSelectedItem().toString();
        String status = statusComboBox.getSelectedItem().toString();
        String quantity = quantitySpinner.getValue().toString();
        
        String updateQuery = "UPDATE books " + 
                "SET isbn = ?, title = ?, author = ?, publish_date = ?, category = ?, status = ?, quantity = ? " +  
                "WHERE isbn = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setLong(1, Long.parseLong(isbn));
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, author);
            preparedStatement.setString(4, date);
            preparedStatement.setString(5, category);
            preparedStatement.setString(6, status);
            preparedStatement.setInt(7, Integer.parseInt(quantity));
            preparedStatement.setLong(8, Long.parseLong(isbn));
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Record Succesfully Updated", "Notice", JOptionPane.INFORMATION_MESSAGE);
            
            clearUserInput();
        } catch (SQLException ex) {
            System.err.println("Update Operation: " + ex.getMessage());
        }
        
        populateBooksTable();     
    }//GEN-LAST:event_updateButtonActionPerformed

    private void booksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksTableMouseClicked
        int selectedRow = 0;
        
        try {
            selectedRow = booksTable.getSelectedRow();
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("SelectedRow: " + ex.getMessage());
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
                
            JOptionPane.showMessageDialog(
                    this, 
                    bookDetails, 
                    "Book Details", 
                    JOptionPane.PLAIN_MESSAGE
            );
        } 
        else {
            titleTextField.setText(title);
            authorTextField.setText(author);
            isbnTextField.setText(isbn);
            publishDateChooser.setDate(Date.valueOf(LocalDate.parse((CharSequence)publishDate)));
            categoryComboBox.setSelectedItem(category);
            statusComboBox.setSelectedItem(status);
            quantitySpinner.setValue(Integer.valueOf(quantity));
        }
    }//GEN-LAST:event_booksTableMouseClicked

    private void manageMembersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMembersButtonActionPerformed
        new LibrarianMemberManagementFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_manageMembersButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Log out Confirmation", JOptionPane.YES_NO_OPTION);
        final int YES = 0;
        
        if (response == YES) {
            new LogInFrame().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        booksTableModel.setRowCount(0);
        String userInput = searchTextField.getText();
        
        String searchQuery = "SELECT * FROM books " + 
                "WHERE title LIKE ? OR author LIKE ?";
          
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
            System.err.println("Search Operation: " + ex.getMessage());
        }
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void booksFilterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksFilterComboBoxActionPerformed
        String selectedCategory = booksFilterComboBox.getSelectedItem().toString();
        booksTableModel.setRowCount(0);
        
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
           populateBooksTable();
        }
    }//GEN-LAST:event_booksFilterComboBoxActionPerformed

    private void manageBooksButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBooksButton1ActionPerformed
        new LibrarianBorrowedBookManagementFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_manageBooksButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            booksTable.print();
            
        } catch (PrinterException ex) {
            Logger.getLogger(LibrarianBookManagementFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    static class MultiLineTableCellRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (c instanceof JLabel) {
                JLabel label = (JLabel) c;
                label.setText("<html><body style='width: 200px;'>" + value + "</html>");
            }
            return c;
        }
    }
    private void populateBooksTable() {      
        booksTableModel = (DefaultTableModel) booksTable.getModel();
        booksTableModel.setRowCount(0);
        
        String selectQuery = "SELECT * FROM books";
        
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
            System.out.println("Pupulate Books Table Operation: " + ex.getMessage());
        } 
    }
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
             System.out.println(ex.getMessage());
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LibrarianBookManagementFrame().setVisible(true);
            }
        });
    
    }   
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JComboBox<String> booksFilterComboBox;
    private javax.swing.JTable booksTable;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private com.toedter.calendar.JDateChooser publishDateChooser;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
