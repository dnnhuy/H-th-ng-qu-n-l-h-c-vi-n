/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.Monhoc;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class MONHOCDAO{
    //Thêm
    public boolean insert(Monhoc cn) throws Exception {
        String Sql;
        Sql = "insert into Monhoc (MaCN,TenCN, MaKhoa) values(?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, cn.getMaCN());
        pm.setString(2, cn.getTenCN());
        pm.setString(3, cn.getMaKhoa());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaCN) throws Exception {
        String sql = "Delete from Monhoc where BINARY_CHECKSUM(MaCN) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaCN);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(Monhoc cn) throws Exception {
        String Sql;
        Sql = "Update Monhoc SET MaCN=?,TenCN=?, MaKhoa=?  WHERE MaCN = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, cn.getMaCN());
        pm.setString(2, cn.getTenCN());
        pm.setString(3, cn.getMaKhoa());
        pm.setString(4, cn.getMaCN());
        return pm.executeUpdate() > 0;
    }

}
