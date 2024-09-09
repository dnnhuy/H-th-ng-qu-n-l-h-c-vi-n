/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.Phonghoc;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class PHONGHOCDAO {
    //Thêm
    public boolean insert(Phonghoc ttp) throws Exception {
        String Sql;
        Sql = "insert into Phonghoc(MaTinh,TenTinh) values(?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, ttp.getMaTinh());
        pm.setString(2, ttp.getTenTinh());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaTinh) throws Exception {
        String sql = "Delete from Phonghoc where BINARY_CHECKSUM(MaTinh) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaTinh);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(Phonghoc ttp) throws Exception {
        String Sql;
        Sql = "Update Phonghoc SET MaTinh=?,TenTinh=?  WHERE MaTinh = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, ttp.getMaTinh());
        pm.setString(2, ttp.getTenTinh());
        pm.setString(3, ttp.getMaTinh());
        return pm.executeUpdate() > 0;
    }

}
