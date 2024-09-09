/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.Giaovien;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class GIAOVIENDAO {
    //Thêm
    public boolean insert(Giaovien GV) throws Exception {
        String Sql;
        Sql = "insert into GiaoVien(MaGV,HoTenGV,NgaySinhGV,GioiTinhGV,SDT,CCCD) values(?,?,?,?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, GV.getMaGV());
        pm.setString(2, GV.getHoTenGV());
        pm.setString(3, GV.getNgaySinhGV());
        pm.setString(4, GV.getGioiTinhGV());
        pm.setString(5, GV.getSDT());
        pm.setString(6, GV.getCCCD());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaGV) throws Exception {
        String sql = "Delete from GiaoVien where BINARY_CHECKSUM(MaGV) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaGV);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(Giaovien GV) throws Exception {
        String Sql;
        Sql = "Update GiaoVien SET MaGV=?,HoTenGV=?,NgaySinhGV=?,GioiTinhGV=?,SDT=?,CCCD=? WHERE MaGV = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, GV.getMaGV());
        pm.setString(2, GV.getHoTenGV());
        pm.setString(3, GV.getNgaySinhGV());
        pm.setString(4, GV.getGioiTinhGV());
        pm.setString(5, GV.getSDT());
        pm.setString(6, GV.getCCCD());
        pm.setString(7, GV.getMaGV());
        return pm.executeUpdate() > 0;
    }

}
