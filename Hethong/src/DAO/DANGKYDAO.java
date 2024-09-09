/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.DangKy;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class DANGKYDAO{
    //Thêm
    public boolean insert(DangKy dk) throws Exception {
        String Sql;
        Sql = "insert into DangKy (MaHV,MaLHP, NgayDk, Khuyenmai, Xeploai, Chungchi) values(?,?,?,?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, dk.getMaHV());
        pm.setString(2, dk.getMaLHP());
        pm.setString(3, dk.getNgayDk());
        pm.setString(4, dk.getKhuyenmai());
        pm.setString(5, dk.getXeploai());
        pm.setString(6, dk.getChungchi());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaHV, String MaLHP) throws Exception {
        String sql = "Delete from DangKy  WHERE MaHV = ? and MaLHP=?";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaHV);
        pm.setString(2, MaLHP);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(DangKy dk) throws Exception {
        String Sql;
        Sql = "Update DangKy SET MaHV=?,MaLHP=?, NgayDk=?,Khuyenmai=?, Xeploai=?, Chungchi=?  WHERE MaHV = ? and MaLHP=?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, dk.getMaHV());
        pm.setString(2, dk.getMaLHP());
        pm.setString(3, dk.getNgayDk());
        pm.setString(4, dk.getKhuyenmai());
        pm.setString(5, dk.getXeploai());
        pm.setString(6, dk.getChungchi());
        pm.setString(7, dk.getMaHV());
        pm.setString(8, dk.getMaLHP());
        return pm.executeUpdate() > 0;
    }

}
