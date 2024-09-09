/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.Hocvien;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class HOCVIENDAO {
    //Thêm
    public boolean insert(Hocvien HV) throws Exception {
        String Sql;
        Sql = "insert into HocVien(MaHV,HoTenHV,NgaySinhHV,GioiTinhHV) values(?,?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, HV.getMaHV());
        pm.setString(2, HV.getHoTenHV());
        pm.setString(3, HV.getNgaySinhHV());
        pm.setString(4, HV.getGioiTinhHV());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaHV) throws Exception {
        String sql = "Delete from HocVien where BINARY_CHECKSUM(MaHV) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaHV);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(Hocvien HV) throws Exception {
        String Sql;
        Sql = "Update HocVien SET MaHV=?,HoTenHV=?,NgaySinhHV=?,GioiTinhHV=? WHERE MaHV = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, HV.getMaHV());
        pm.setString(2, HV.getHoTenHV());
        pm.setString(3, HV.getNgaySinhHV());
        pm.setString(4, HV.getGioiTinhHV());
        pm.setString(5, HV.getMaHV());
        return pm.executeUpdate() > 0;
    }

}
