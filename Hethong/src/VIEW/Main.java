
package VIEW;

/**
 *
 * @author Acer
 */

import BEAN.Danhmuc;
import CONTROLLER.Chuyenmanhinh;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Quản lý học viên");
        
        Chuyenmanhinh controller = new Chuyenmanhinh(jpview);
        controller.setView(jpntrangchu, jlbtrangchu);
        
        List<Danhmuc> listItem=new ArrayList<>();
        listItem.add(new Danhmuc ("Trangchu", jpntrangchu, jlbtrangchu)); 
        listItem.add(new Danhmuc ("Hocvien", jpnhocvien, jlbhocvien));
        listItem.add(new Danhmuc ("Giaovien", jpngiaovien, jlbgiaovien));
        listItem.add(new Danhmuc ("Khoahoc", jpnkhoahoc, jlbkhoahoc)); 
        listItem.add(new Danhmuc ("LopHP", jpnlhp, jlblhp));
        listItem.add(new Danhmuc ("Dangky", jpndk, jlbdk));
        listItem.add(new Danhmuc ("Thongke", jpnthongke, jlbthongke)); 
        controller.setEvent (listItem);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jproot = new javax.swing.JPanel();
        jpmenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnhocvien = new javax.swing.JPanel();
        jlbhocvien = new javax.swing.JLabel();
        jpngiaovien = new javax.swing.JPanel();
        jlbgiaovien = new javax.swing.JLabel();
        jpnkhoahoc = new javax.swing.JPanel();
        jlbkhoahoc = new javax.swing.JLabel();
        jpnlhp = new javax.swing.JPanel();
        jlblhp = new javax.swing.JLabel();
        jpnthongke = new javax.swing.JPanel();
        jlbthongke = new javax.swing.JLabel();
        jpntrangchu = new javax.swing.JPanel();
        jlbtrangchu = new javax.swing.JLabel();
        jpndk = new javax.swing.JPanel();
        jlbdk = new javax.swing.JLabel();
        jpview = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(getPreferredSize());

        jpmenu.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Thiết kế chưa có tên.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpnhocvien.setBackground(new java.awt.Color(37, 150, 190));

        jlbhocvien.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbhocvien.setForeground(new java.awt.Color(255, 255, 255));
        jlbhocvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/STU_1.png"))); // NOI18N
        jlbhocvien.setText("Quản lý học viên");

        javax.swing.GroupLayout jpnhocvienLayout = new javax.swing.GroupLayout(jpnhocvien);
        jpnhocvien.setLayout(jpnhocvienLayout);
        jpnhocvienLayout.setHorizontalGroup(
            jpnhocvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnhocvienLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbhocvien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnhocvienLayout.setVerticalGroup(
            jpnhocvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnhocvienLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbhocvien)
                .addGap(15, 15, 15))
        );

        jpngiaovien.setBackground(new java.awt.Color(37, 150, 190));

        jlbgiaovien.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbgiaovien.setForeground(new java.awt.Color(255, 255, 255));
        jlbgiaovien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/IC.png"))); // NOI18N
        jlbgiaovien.setText("Quản lý giáo viên");

        javax.swing.GroupLayout jpngiaovienLayout = new javax.swing.GroupLayout(jpngiaovien);
        jpngiaovien.setLayout(jpngiaovienLayout);
        jpngiaovienLayout.setHorizontalGroup(
            jpngiaovienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpngiaovienLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbgiaovien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpngiaovienLayout.setVerticalGroup(
            jpngiaovienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpngiaovienLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbgiaovien)
                .addGap(15, 15, 15))
        );

        jpnkhoahoc.setBackground(new java.awt.Color(37, 150, 190));

        jlbkhoahoc.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbkhoahoc.setForeground(new java.awt.Color(255, 255, 255));
        jlbkhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/list_1.png"))); // NOI18N
        jlbkhoahoc.setText("Quản lý khóa học");

        javax.swing.GroupLayout jpnkhoahocLayout = new javax.swing.GroupLayout(jpnkhoahoc);
        jpnkhoahoc.setLayout(jpnkhoahocLayout);
        jpnkhoahocLayout.setHorizontalGroup(
            jpnkhoahocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnkhoahocLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbkhoahoc)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jpnkhoahocLayout.setVerticalGroup(
            jpnkhoahocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnkhoahocLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbkhoahoc)
                .addGap(15, 15, 15))
        );

        jpnlhp.setBackground(new java.awt.Color(37, 150, 190));

        jlblhp.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlblhp.setForeground(new java.awt.Color(255, 255, 255));
        jlblhp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lhp.png"))); // NOI18N
        jlblhp.setText("Quản lý lớp HP");

        javax.swing.GroupLayout jpnlhpLayout = new javax.swing.GroupLayout(jpnlhp);
        jpnlhp.setLayout(jpnlhpLayout);
        jpnlhpLayout.setHorizontalGroup(
            jpnlhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlhpLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlblhp)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jpnlhpLayout.setVerticalGroup(
            jpnlhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlhpLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlblhp)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpnthongke.setBackground(new java.awt.Color(37, 150, 190));

        jlbthongke.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbthongke.setForeground(new java.awt.Color(255, 255, 255));
        jlbthongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tk.png"))); // NOI18N
        jlbthongke.setText("Thống kê dữ liệu");

        javax.swing.GroupLayout jpnthongkeLayout = new javax.swing.GroupLayout(jpnthongke);
        jpnthongke.setLayout(jpnthongkeLayout);
        jpnthongkeLayout.setHorizontalGroup(
            jpnthongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnthongkeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbthongke)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnthongkeLayout.setVerticalGroup(
            jpnthongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnthongkeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbthongke)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpntrangchu.setBackground(new java.awt.Color(37, 150, 190));

        jlbtrangchu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbtrangchu.setForeground(new java.awt.Color(255, 255, 255));
        jlbtrangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.png"))); // NOI18N
        jlbtrangchu.setText(" Màn hình chính");

        javax.swing.GroupLayout jpntrangchuLayout = new javax.swing.GroupLayout(jpntrangchu);
        jpntrangchu.setLayout(jpntrangchuLayout);
        jpntrangchuLayout.setHorizontalGroup(
            jpntrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpntrangchuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbtrangchu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpntrangchuLayout.setVerticalGroup(
            jpntrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpntrangchuLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbtrangchu)
                .addGap(15, 15, 15))
        );

        jpndk.setBackground(new java.awt.Color(37, 150, 190));
        jpndk.setPreferredSize(new java.awt.Dimension(246, 80));

        jlbdk.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbdk.setForeground(new java.awt.Color(255, 255, 255));
        jlbdk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/RG.png"))); // NOI18N
        jlbdk.setText("Quản lý đăng ký");

        javax.swing.GroupLayout jpndkLayout = new javax.swing.GroupLayout(jpndk);
        jpndk.setLayout(jpndkLayout);
        jpndkLayout.setHorizontalGroup(
            jpndkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpndkLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbdk)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jpndkLayout.setVerticalGroup(
            jpndkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpndkLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jlbdk)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jpmenuLayout = new javax.swing.GroupLayout(jpmenu);
        jpmenu.setLayout(jpmenuLayout);
        jpmenuLayout.setHorizontalGroup(
            jpmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpmenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpntrangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnthongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlhp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnkhoahoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpngiaovien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnhocvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpndk, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpmenuLayout.setVerticalGroup(
            jpmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpmenuLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jpnhocvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpngiaovien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpnkhoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpnlhp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpndk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnthongke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpntrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpviewLayout = new javax.swing.GroupLayout(jpview);
        jpview.setLayout(jpviewLayout);
        jpviewLayout.setHorizontalGroup(
            jpviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        jpviewLayout.setVerticalGroup(
            jpviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2013, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jprootLayout = new javax.swing.GroupLayout(jproot);
        jproot.setLayout(jprootLayout);
        jprootLayout.setHorizontalGroup(
            jprootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jprootLayout.createSequentialGroup()
                .addContainerGap(346, Short.MAX_VALUE)
                .addComponent(jpview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jprootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jprootLayout.createSequentialGroup()
                    .addComponent(jpmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 552, Short.MAX_VALUE)))
        );
        jprootLayout.setVerticalGroup(
            jprootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jprootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jproot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jproot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlbdk;
    private javax.swing.JLabel jlbgiaovien;
    private javax.swing.JLabel jlbhocvien;
    private javax.swing.JLabel jlbkhoahoc;
    private javax.swing.JLabel jlblhp;
    private javax.swing.JLabel jlbthongke;
    private javax.swing.JLabel jlbtrangchu;
    private javax.swing.JPanel jpmenu;
    private javax.swing.JPanel jpndk;
    private javax.swing.JPanel jpngiaovien;
    private javax.swing.JPanel jpnhocvien;
    private javax.swing.JPanel jpnkhoahoc;
    private javax.swing.JPanel jpnlhp;
    private javax.swing.JPanel jpnthongke;
    private javax.swing.JPanel jpntrangchu;
    private javax.swing.JPanel jproot;
    private javax.swing.JPanel jpview;
    // End of variables declaration//GEN-END:variables
}
