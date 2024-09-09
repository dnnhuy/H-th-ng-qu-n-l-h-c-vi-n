/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.Coso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Connection.Connect;

/**
 *
 * @author Acer
 */
public class COSODAO {
    //Thêm
    public boolean insert(Coso k) throws Exception {
        String Sql;
        Sql = "insert into Coso(MaCS,TenCS) values(?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, k.getMaCS());
        pm.setString(2, k.getTenCS());
        pm.setString(3, k.getDiachi());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaCS) throws Exception {
        String sql = "Delete from Coso where BINARY_CHECKSUM(MaCS) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaCS);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(Coso k) throws Exception {
        String Sql;
        Sql = "Update Coso SET MaCS=?,TenCS=?, Diachi=?  WHERE MaCS = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, k.getMaCS());
        pm.setString(2, k.getTenCS());
        pm.setString(3, k.getDiachi());
        pm.setString(4, k.getMaCS());
        return pm.executeUpdate() > 0;
    }

}
