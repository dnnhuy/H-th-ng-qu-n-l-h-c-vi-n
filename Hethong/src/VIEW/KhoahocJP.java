/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIEW;
import Connection.Connect;
import DAO.KHOAHOCDAO;
import Model.Khoahoc;
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
public class KhoahocJP extends javax.swing.JPanel {

    /**
     * Creates new form KhoahocJP
     */
     DefaultTableModel tbtModel;
     private TableRowSorter<TableModel> rowSorter = null;

    public KhoahocJP() {
        initComponents();
        initcbbMaLoai();
        initcbbMaKN();
        initcbbMaMH() ;
        Loadulieu();
    }
    //Khởi tạo cho cbb Mã Môn học
    private void initcbbMaMH() {
        try {
            String sql = "Select MaMH from MonHoc";
            Connection conn = Connect.openConnect();
            PreparedStatement pm = conn.prepareStatement(sql);
            ResultSet rs = pm.executeQuery();
            cbbMaMH.removeAllItems();
            while (rs.next()) {
                cbbMaMH.addItem(rs.getString("MaMH"));
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
     private void initcbbMaLoai() {
        try {
            String sql = "Select MaLoai from LoaiHinh";
            Connection conn = Connect.openConnect();
            PreparedStatement pm = conn.prepareStatement(sql);
            ResultSet rs = pm.executeQuery();
            cbbMaLoai.removeAllItems();
            while (rs.next()) {
                cbbMaLoai.addItem(rs.getString("MaLoai"));
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
     private void initcbbMaKN() {
        try {
            String sql = "Select MaKN from NhomKN";
            Connection conn = Connect.openConnect();
            PreparedStatement pm = conn.prepareStatement(sql);
            ResultSet rs = pm.executeQuery();
            cbbMaKN.removeAllItems();
            while (rs.next()) {
                cbbMaKN.addItem(rs.getString("MaKN"));
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
            tbl_kh.removeAll();
            String[] arr = {"Mã KH","Tên KH","Tuổi","Thời lượng","Giá","Slmax"," Mã MH", "Mã Loai","Mã KN"};
            tbtModel = new DefaultTableModel(arr, 0);
            String sql = "SELECT * FROM KhoaHoc";
            Connection conn = Connect.openConnect();
            PreparedStatement pm = conn.prepareStatement(sql);
            ResultSet rs = pm.executeQuery();
            tbtModel.setRowCount(0);
            
            
            
            while (rs.next()) {
                String[] row = new String[]
            {
                    rs.getString("MaKH"), 
                    rs.getString("TenKH"),
                    rs.getString("Tuoi"),
                    rs.getString("Thoiluong"),
                    rs.getString("Gia"),
                    rs.getString("Slmax"),
                    rs.getString("MaMH"),
                    rs.getString("MaLoai"),
                    rs.getString("MaKN")};
                
                tbtModel.addRow(row);
            }
            tbl_kh.setModel(tbtModel);
            tbl_kh.setAutoCreateRowSorter(true);
            tbl_kh.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
            tbl_kh.getTableHeader().setPreferredSize(new Dimension(100, 50));
            tbtModel.fireTableDataChanged();
            Connect.CloseConnect(conn);
            
             rowSorter = new TableRowSorter<>(tbl_kh.getModel());
            tbl_kh.setRowSorter(rowSorter);
            
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblDong2 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        lblDong3 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        lblDong1 = new javax.swing.JLabel();
        txtTuoi = new javax.swing.JTextField();
        lblDong4 = new javax.swing.JLabel();
        lblDong5 = new javax.swing.JLabel();
        lblDong6 = new javax.swing.JLabel();
        txtSLmax = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtThoiluong = new javax.swing.JTextField();
        lblDong7 = new javax.swing.JLabel();
        lblDong8 = new javax.swing.JLabel();
        lblDong9 = new javax.swing.JLabel();
        cbbMaMH = new javax.swing.JComboBox<>();
        cbbMaLoai = new javax.swing.JComboBox<>();
        cbbMaKN = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kh = new javax.swing.JTable();
        jtfSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1570, 970));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1580, 970));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("#9Slide03 Neutra", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(205, 132, 105));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHÓA HỌC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(407, 407, 407))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 241, 236));

        lblDong2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong2.setText("MaKH:");

        txtMaKH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblDong3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong3.setText("Tên KH:");

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblDong1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong1.setText("Tuổi:");

        txtTuoi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblDong4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong4.setText("Thời lượng:");

        lblDong5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong5.setText("Giá:");

        lblDong6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong6.setText("Số lượng max:");

        txtSLmax.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtGia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtThoiluong.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblDong7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong7.setText("Mã môn:");

        lblDong8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong8.setText("Mã loại:");

        lblDong9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDong9.setText("Mã KN:");

        cbbMaMH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        cbbMaLoai.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        cbbMaKN.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDong3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(lblDong1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(lblDong2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(txtMaKH)
                    .addComponent(txtTuoi))
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDong6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDong4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDong5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGia)
                    .addComponent(txtThoiluong)
                    .addComponent(txtSLmax, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDong8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDong9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDong7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMaKN, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDong7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMaMH))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDong8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMaLoai))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDong9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMaKN)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtThoiluong)
                                .addComponent(lblDong4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGia)
                                .addComponent(lblDong5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSLmax)
                                .addComponent(lblDong6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaKH)
                                .addComponent(lblDong2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTenKH)
                                .addComponent(lblDong3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTuoi)
                                .addComponent(lblDong1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );

        jPanel6.setBackground(new java.awt.Color(255, 241, 236));

        tbl_kh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tbl_kh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MaKH", "TenKh", "Tuoi", "Thoiluong", "Gia", "Slmax", "MaMH", "MaLoai", "MaKN"
            }
        ));
        tbl_kh.setRowHeight(40);
        jScrollPane1.setViewportView(tbl_kh);

        jtfSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N

        btnThem.setBackground(new java.awt.Color(190, 219, 171));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/A.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(255, 183, 175));
        btnxoa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/D.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.setPreferredSize(new java.awt.Dimension(147, 56));
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 242, 176));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/F.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setPreferredSize(new java.awt.Dimension(147, 56));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnThem)
                        .addGap(66, 66, 66)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1565, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMaKH.getText().equals(""))
        {
            sb.append("MaKH đang trống!\n");
            txtMaKH.requestFocus();
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Khoahoc kh = new Khoahoc();
            KHOAHOCDAO khd = new KHOAHOCDAO();

            kh.setMaKH(txtMaKH.getText());
            kh.setTenKH((txtTenKH.getText()));
            kh.setTuoi(txtTuoi.getText());
            kh.setThoiluong((txtThoiluong.getText()));
            kh.setGia(txtGia.getText());
            kh.setSlmax(txtSLmax.getText());
            String n1 = cbbMaMH.getItemAt(cbbMaMH.getSelectedIndex());
            kh.setMaMH(n1);
            String n2 = cbbMaLoai.getItemAt(cbbMaLoai.getSelectedIndex());
            kh.setMaLoai(n2);
            String n3 = cbbMaKN.getItemAt(cbbMaKN.getSelectedIndex());
            kh.setMaKN(n3);
            
            khd.insert(kh);
            Loadulieu();
            JOptionPane.showMessageDialog(this, "Thêm khóa học thành công!");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Không thể thêm khóa học!");
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
         StringBuilder sb = new StringBuilder();
        if (txtMaKH.getText().equals(""))
        {
            sb.append("MaKH đang trống!\n");
            txtMaKH.requestFocus();
        }
        if (sb.length() > 0)
        {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            Khoahoc  kh = new Khoahoc();
            KHOAHOCDAO Hvup = new  KHOAHOCDAO();

            kh.setMaKH(txtMaKH.getText());
            kh.setTenKH((txtTenKH.getText()));
            kh.setTuoi(txtTuoi.getText());
            kh.setThoiluong((txtThoiluong.getText()));
            kh.setGia(txtGia.getText());
            kh.setSlmax(txtSLmax.getText());
            String n1 = cbbMaMH.getItemAt(cbbMaMH.getSelectedIndex());
            kh.setMaMH(n1);
            String n2 = cbbMaLoai.getItemAt(cbbMaLoai.getSelectedIndex());
            kh.setMaLoai(n2);
            String n3 = cbbMaKN.getItemAt(cbbMaKN.getSelectedIndex());
            kh.setMaKN(n3);

            Hvup.Update(kh);
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
        if (txtMaKH.getText().equals("")) {
            sb.append("MaKH đang trống!\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Cảnh báo!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int dk = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa khóa học này", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (dk == JOptionPane.YES_OPTION) {
            try {
                KHOAHOCDAO kh = new KHOAHOCDAO();
                if (kh.Delete(txtMaKH.getText())) {
                    JOptionPane.showMessageDialog(this, "Xóa khóa học thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa khóa học thất bại");
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
    private javax.swing.JComboBox<String> cbbMaKN;
    private javax.swing.JComboBox<String> cbbMaLoai;
    private javax.swing.JComboBox<String> cbbMaMH;
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
    private javax.swing.JLabel lblDong7;
    private javax.swing.JLabel lblDong8;
    private javax.swing.JLabel lblDong9;
    private javax.swing.JTable tbl_kh;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSLmax;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtThoiluong;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables

    
}
