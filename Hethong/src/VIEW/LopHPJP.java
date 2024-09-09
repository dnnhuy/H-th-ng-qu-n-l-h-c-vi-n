/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIEW;
import Connection.Connect;
import DAO.LOPHOCPHANDAO;
import Model.LopHP;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Acer
 */
public class LopHPJP extends javax.swing.JPanel {
     DefaultTableModel tbtModel;
     private TableRowSorter<TableModel> rowSorter = null;

    public LopHPJP() {
        initComponents();
        initcbbMaGV();
        initcbbMaPH();
        initcbbMaKH();
        Loadulieu();
    }
 //Khởi tạo cho cbb Mã lớp học phần
    private void initcbbMaGV() {
        try {
            String sql = "Select MaGV from GiaoVien";
            Connection conn = Connect.openConnect();
            PreparedStatement pm = conn.prepareStatement(sql);
            ResultSet rs = pm.executeQuery();
            cbbMaGV.removeAllItems();
            while (rs.next()) {
                cbbMaGV.addItem(rs.getString("MaGV"));
            }
            rs.close();
            pm.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
    
    //Khởi tạo cho cbb Mã Loại
     private void initcbbMaKH() {
        try {
            String sql = "Select MaKH from KhoaHoc";
            Connection conn = Connect.openConnect();
            PreparedStatement pm = conn.prepareStatement(sql);
            ResultSet rs = pm.executeQuery();
            cbbMaKH.removeAllItems();
            while (rs.next()) {
                cbbMaKH.addItem(rs.getString("MaKH"));
            }
            rs.close();
            pm.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
    
        //Khởi tạo cho cbb Mã Kỹ Năng
     private void initcbbMaPH() {
        try {
            String sql = "Select MaPH from PhongHoc";
            Connection conn = Connect.openConnect();
            PreparedStatement pm = conn.prepareStatement(sql);
            ResultSet rs = pm.executeQuery();
            cbbMaPH.removeAllItems();
            while (rs.next()) {
                cbbMaPH.addItem(rs.getString("MaPH"));
            }
            rs.close();
            pm.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
    
     public void Loadulieu() {

        try {
            tbl_lhp.removeAll();
            String[] arr = {"Mã LHP", "Ngày bd", "Ngày kt","Mã KH", "Mã GV", "Mã PH"};
            tbtModel = new DefaultTableModel(arr, 0);
            String sql = "SELECT * FROM LopHP";
            Connection conn = Connect.openConnect();
            PreparedStatement pm = conn.prepareStatement(sql);
            ResultSet rs = pm.executeQuery();
            tbtModel.setRowCount(0);
            
            while (rs.next()) {
                String[] row = new String[]
            {
                    rs.getString("MaLHP"),
                    rs.getString("NgayBd"),
                    rs.getString("NgayKt"),
                    rs.getString("MaKH"), 
                    rs.getString("MaGV"),
                    rs.getString("MaPH"),};
                
                tbtModel.addRow(row);
            }
            tbl_lhp.setModel(tbtModel);
            tbl_lhp.setAutoCreateRowSorter(true);
            tbl_lhp.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
            tbl_lhp.getTableHeader().setPreferredSize(new Dimension(100, 50));

            tbtModel.fireTableDataChanged();
            Connect.CloseConnect(conn);
            
            rowSorter = new TableRowSorter<>(tbl_lhp.getModel());
            tbl_lhp.setRowSorter(rowSorter);
            
            jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
            
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblDong2 = new javax.swing.JLabel();
        txtMaLHP = new javax.swing.JTextField();
        lblDong3 = new javax.swing.JLabel();
        txtNgayBd = new javax.swing.JTextField();
        lblDong1 = new javax.swing.JLabel();
        txtNgaykt = new javax.swing.JTextField();
        lblDong4 = new javax.swing.JLabel();
        cbbMaKH = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        lblDong5 = new javax.swing.JLabel();
        lblDong6 = new javax.swing.JLabel();
        cbbMaGV = new javax.swing.JComboBox<>();
        cbbMaPH = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_lhp = new javax.swing.JTable();
        jtfSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1570, 970));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1580, 970));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("#9Slide03 Neutra", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 171, 131));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ LỚP HỌC PHẦN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(320, 320, 320))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(235, 250, 243));

        lblDong2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong2.setText("Mã LHP:");

        txtMaLHP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblDong3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong3.setText("Bắt đầu:");

        txtNgayBd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblDong1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong1.setText("Kết thúc:");

        txtNgaykt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblDong4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong4.setText("Mã KH:");

        cbbMaKH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnThem.setBackground(new java.awt.Color(190, 219, 171));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/A.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 242, 176));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/F.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(255, 183, 175));
        btnxoa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/D.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        lblDong5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong5.setText("Mã GV:");

        lblDong6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong6.setText("Mã PH:");

        cbbMaGV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        cbbMaPH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDong3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblDong2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblDong4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblDong1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblDong5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbbMaKH, javax.swing.GroupLayout.Alignment.TRAILING, 0, 222, Short.MAX_VALUE)
                                            .addComponent(txtNgaykt, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNgayBd, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtMaLHP, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(cbbMaGV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblDong6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(cbbMaPH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(61, 61, 61))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaLHP)
                    .addComponent(lblDong2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNgayBd)
                    .addComponent(lblDong3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNgaykt)
                    .addComponent(lblDong1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbMaKH)
                    .addComponent(lblDong4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDong5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cbbMaGV)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDong6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(cbbMaPH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addComponent(btnxoa)
                .addGap(48, 48, 48))
        );

        jPanel6.setBackground(new java.awt.Color(235, 250, 243));

        tbl_lhp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tbl_lhp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MaLHP", "NgayBd", "NgayKt", "MaKH", "MaGV", "MaPH"
            }
        ));
        tbl_lhp.setRowHeight(40);
        jScrollPane1.setViewportView(tbl_lhp);
        if (tbl_lhp.getColumnModel().getColumnCount() > 0) {
            tbl_lhp.getColumnModel().getColumn(0).setResizable(false);
            tbl_lhp.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_lhp.getColumnModel().getColumn(3).setResizable(false);
            tbl_lhp.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jtfSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(518, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMaLHP.getText().equals(""))
        {
            sb.append("MaLHP đang trống!\n");
            txtMaLHP.requestFocus();
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            LopHP lhp = new LopHP();
            LOPHOCPHANDAO lhpd = new LOPHOCPHANDAO();

            lhp.setMaLHP(txtMaLHP.getText());
            lhp.setNgayBd(txtNgayBd.getText());
            lhp.setNgayKt(txtNgaykt.getText());
            String n = cbbMaKH.getItemAt(cbbMaKH.getSelectedIndex());
            lhp.setMaKH(n);
            String n1 = cbbMaGV.getItemAt(cbbMaGV.getSelectedIndex());
            lhp.setMaGV(n1);
            String n2 = cbbMaPH.getItemAt(cbbMaPH.getSelectedIndex());
            lhp.setMaPH(n2);

            lhpd.insert(lhp);
            Loadulieu();
            JOptionPane.showMessageDialog(this, "Thêm lớp học phần thành công!");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Không thể thêm lớp học phần!");
            if(e.getMessage().equals("The transaction ended in the trigger. The batch has been aborted.")){
                JOptionPane.showMessageDialog(this, "Error: " + "Ngày bắt đầu đang trễ hơn ngày kết thúc, vui lòng nhập lại!");
            } else
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMaLHP.getText().equals(""))
        {
            sb.append("MaLHP đang trống!\n");
            txtMaLHP.requestFocus();
        }
        if (sb.length() > 0)
        {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            LopHP lhp = new LopHP();
            LOPHOCPHANDAO LHPD = new  LOPHOCPHANDAO();

            lhp.setMaLHP(txtMaLHP.getText());
            lhp.setNgayBd(txtNgayBd.getText());
            lhp.setNgayKt(txtNgaykt.getText());
            String n = cbbMaKH.getItemAt(cbbMaKH.getSelectedIndex());
            lhp.setMaKH(n);
            String n1 = cbbMaGV.getItemAt(cbbMaGV.getSelectedIndex());
            lhp.setMaGV(n1);
            String n2 = cbbMaPH.getItemAt(cbbMaPH.getSelectedIndex());
            lhp.setMaPH(n2);

            LHPD.Update(lhp);
            Loadulieu();
            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Cập nhật không thành công!");
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMaLHP.getText().equals("")) {
            sb.append("MaLHP đang trống!\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Cảnh báo!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int dk = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa lớp học phần này", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (dk == JOptionPane.YES_OPTION) {
            try {
                LOPHOCPHANDAO lhp = new LOPHOCPHANDAO();
                if (lhp.Delete(txtMaLHP.getText())) {
                    JOptionPane.showMessageDialog(this, "Xóa lớp học phần thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa lớp học phần thất bại");
                }
                Loadulieu();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnxoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbbMaGV;
    private javax.swing.JComboBox<String> cbbMaKH;
    private javax.swing.JComboBox<String> cbbMaPH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JLabel lblDong1;
    private javax.swing.JLabel lblDong2;
    private javax.swing.JLabel lblDong3;
    private javax.swing.JLabel lblDong4;
    private javax.swing.JLabel lblDong5;
    private javax.swing.JLabel lblDong6;
    private javax.swing.JTable tbl_lhp;
    private javax.swing.JTextField txtMaLHP;
    private javax.swing.JTextField txtNgayBd;
    private javax.swing.JTextField txtNgaykt;
    // End of variables declaration//GEN-END:variables

    
}
